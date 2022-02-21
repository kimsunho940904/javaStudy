package com.apring.service;


import com.apring.entity.Board;
import com.apring.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    /**
     * @작성자 : 김선호
     * @작성일 : 2022.02.20
     */

    private final BoardMapper boardMapper;

    public List<Board> boardList() throws Exception {
        return boardMapper.boardList();
    }

    public Board boardDetail(Long bno) throws Exception {
        return boardMapper.boardDetail(bno);
    }

    public Long boardInsert(Board board) throws Exception {
        return boardMapper.boardInsert(board);
    }

    public Long boardUpdate(Board board) throws Exception {
        return boardMapper.boardUpdate(board);
    }

    public Long boardDelete(Long bno) throws Exception {
        return boardMapper.boardDelete(bno);
    }
}
