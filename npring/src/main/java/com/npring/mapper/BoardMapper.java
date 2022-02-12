package com.npring.mapper;

import com.npring.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository = MapperScan 대상
@Repository
public interface BoardMapper {
    
    List<Board> list();

}
