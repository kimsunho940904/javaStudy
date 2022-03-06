package com.apring.controller;

import com.apring.entity.Board;
import com.apring.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    /**
     * @작성자 : 김선호
     * @작성일 : 2022.03.01
     */

    @Autowired
    BoardService boardService;

    @GetMapping("/board/list")
    public String boardList(Model model) throws Exception {
        model.addAttribute("boardList", boardService.boardList());
        return "/board/list";
    }

    @GetMapping("/board/insertView")
    public String boardInsertView() throws Exception {
        return "/board/insert";
    }

    @PostMapping("/board/insert")
    public String boardInsert(Board board) throws Exception {
        boardService.boardInsert(board);

        return "redirect:/board/list";
    }

    @GetMapping("/board/readView")
    public String readView(Board board, Model model) throws Exception {
        model.addAttribute("read", boardService.boardDetail(board.getBno()));
        return "/board/detail";
    }


}
