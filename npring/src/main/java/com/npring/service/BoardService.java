package com.npring.service;

import com.npring.entity.Board;
import com.npring.mapper.BoardMapper;
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
