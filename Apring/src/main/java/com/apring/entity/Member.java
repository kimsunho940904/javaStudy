package com.apring.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class Member {

    // 22.02.26 박찬혁
	
	private Long memberNo;			// 회원 번호
	private String memberId;		// 회원 아이디
	private String memberPassword;	// 비밀번호
	private String memberName;		// 이름
	private String memberBirth;		// 생년월일
	private String memberGender;	// 성별
	private String memberEmail;		// 이메일
	private String memberPhone;		// 전화번호
	private String memberAddr1;		// 우편번호
	private String memberAddr2;		// 주소(앞)
	private String memberAddr3;		// 주소(뒤)
	private Long memberAdmin;		// 운영 & 일반
	private Date memberDate;		// 가입 날짜
    
}// end Member
