package com.hyungee.shop.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;


    @GetMapping("/register")
    public String register(Authentication auth) {
        if(auth == null || auth.getPrincipal().equals("anonymousUser")){
            return "register.html";
        }
        return "redirect:/list";
    }

    @PostMapping("/member")
    public String addMember(String username, String password, String displayName) {
        try {
            if (username.length() < 8 || password.length() < 8) {
                throw new Exception("아이디 또는 비밀번호가 너무 짧습니다.");
            }

            Member member = new Member();
            member.setUsername(username);
            var hash = passwordEncoder.encode(password);
            member.setPassword(hash);
            member.setDisplayName(displayName);
            memberRepository.save(member);

            return "redirect:/list";
        } catch (Exception e) {
            System.out.println("회원 저장 중 예외 발생: " + e.getMessage());
            return "redirect:/register";
        }
    }

    @GetMapping("/login")
    public String login() {
        var result = memberRepository.findAllByUsername("hyungeerhee");
        System.out.println(result.get().getDisplayName());
        return "login.html";
    }

    @GetMapping("/my-page")
    public String myPage(Authentication auth) {
        if(auth == null || auth.getPrincipal().equals("anonymousUser")){
            return "login.html";
        }
        return "mypage.html";
    }
}
