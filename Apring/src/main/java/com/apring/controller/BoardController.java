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

    /**
     * @작성자 : 김선호
     * @작성일 : 2022.02.20
     */

    @Autowired
    BoardService boardService;

    @GetMapping("/board/list")
    public String boardList(Model model) throws Exception {
        model.addAttribute("boardList", boardService.boardList());
        return "/board/list";
    }


}
