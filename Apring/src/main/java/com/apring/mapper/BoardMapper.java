package com.apring.mapper;

import com.apring.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository = MapperScan 대상
@Repository
public interface BoardMapper {
    
    List<Board> list();

}
