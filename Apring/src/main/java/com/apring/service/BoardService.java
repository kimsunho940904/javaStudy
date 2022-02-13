package com.apring.service;


import com.apring.entity.Board;
import com.apring.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public List<Board> list() {
        return boardMapper.list();
    }
}
