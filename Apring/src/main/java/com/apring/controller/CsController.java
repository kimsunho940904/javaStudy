package com.apring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CsController {

    /**
     * @작성자 : 김선호
     * @작성일 : 2022.02.26
     */


    @GetMapping("/cs/list")
    public String csList(Model model) throws Exception {
        return "/cs/list";
    }

}
