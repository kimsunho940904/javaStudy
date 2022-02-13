package com.apring.controller;

import com.apring.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    
    @Autowired
    BoardService boardService;

    @GetMapping("board/list")
    public String list(Model model) {
        model.addAttribute("list", boardService.list());
        return "/board/list";
    }

}
