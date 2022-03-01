package com.apring.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.apring.entity.Member;

@Repository // MemberMapper Scan 대상 :)
public interface MemberMapper {
	
	/*
	 *  @ 작성자 : 박찬혁
	 *  @ 작성일 : 22.02.20
	 */
	
	// 회원 가입 (insert)
	public long memberInsert(Member member) throws Exception;
	// 회원 검색 (select)
	public Member memberSelect(long memberNo) throws Exception;
	// 회원 전체 검색(select_all)
	public List<Member> memberSelectAll(String memberId) throws Exception;
	// 회원 수정 (update)
	public long memberUpdate(Member member) throws Exception;
	// 회원 탈퇴 (delete)
	public long memberDelete(long memberNo) throws Exception;
	// 아이디 중복확인
	public long memberCheck(String memberId) throws Exception;
}// end MemberMapper
