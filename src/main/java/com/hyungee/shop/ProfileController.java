package com.hyungee.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
class ProfileController {

    private final ProfileRepository profileRepository;
    @GetMapping("/profile")
    String profile(Model model) {
        List<Profile> result = profileRepository.findAll();
        model.addAttribute("profiles", result);
        System.out.println(result.toString());

        Profile profile = new Profile();
        profile.setAge(60);
        profile.AgeSet(99);
        profile.AgePlus();
        System.out.println(profile.getAge());
        return "profile.html";
    }
}
