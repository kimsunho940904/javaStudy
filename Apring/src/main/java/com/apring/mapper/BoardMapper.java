package com.apring.mapper;

import com.apring.entity.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository = MapperScan 대상
@Repository
public interface BoardMapper {

    /**
     * @작성자 : 김선호
     * @작성일 : 2022.02.20
     */
    // 게시글 개수
    public int boardCount() throws Exception;

    // 게시글 목록
    public List<Board> boardList() throws Exception;

    // 게시글 상세
    public Board boardDetail(Long bno) throws Exception;

    // 게시글 작성
    public Long boardInsert(Board board) throws Exception;

    // 게시글 수정
    public Long boardUpdate(Board board) throws Exception;

    // 게시글 삭제
    public Long boardDelete(Long bno) throws Exception;


}
