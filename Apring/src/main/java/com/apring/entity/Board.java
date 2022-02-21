package com.apring.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Board {

    /**
     * @작성자 : 김선호
     * @날짜 : 2022.02.20
     */

    // 글 번호
    private Long bno;
    // 글 제목
    private String title;
    // 글 내용
    private String content;
    // 작성 시간
    private LocalDateTime regTime;
    // 수정 시간
    private LocalDateTime updateTime;
}
