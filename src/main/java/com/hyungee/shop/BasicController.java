package com.hyungee.shop;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;


import java.time.ZonedDateTime;


@Controller
public class BasicController {


    @GetMapping("/about")

    @ResponseBody
    String about() {

        return "피싱사이트에요";

    }

    @GetMapping("/date")

    @ResponseBody
    String date() {

        return ZonedDateTime.now().toString();

    }

    public static class profile {
    }
}

