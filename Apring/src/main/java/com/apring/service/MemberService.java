package com.apring.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.apring.entity.Member;
import com.apring.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final Logger logger =
			LoggerFactory.getLogger(MemberService.class);
	
	/*
	 *  @작성자 : 박찬혁
	 *  @작성일 : 22.02.26
	 */
	
	private final MemberMapper memberMapper;
		// Member memeber -> MemberVO
		// 회원 가입 (insert)
		public long memberInsert(Member member) throws Exception {
			logger.info("MemberService - memberInsert() 호출");
			return memberMapper.memberInsert(member);
		} // end memberInsert()
		
		// 회원 검색 (select)
		public Member memberSelect(long memberNo) throws Exception{
			logger.info("MemberService - memberSelect() 호출");
			return memberMapper.memberSelect(memberNo);
		}// end memberSelect()
		
		// 회원 전체 검색(select_all)
		public List<Member> memberSelectAll(String memberId) throws Exception{
			logger.info("MemberService - memberSelectAll() 호출");
			return memberMapper.memberSelectAll(memberId);
		}// end memberSelectAll()
		
		// 회원 수정 (update)
		public long memberUpdate(Member member) throws Exception{
			logger.info("MemberService - memberUpdate() 호출");
			return memberMapper.memberUpdate(member);
		}// end memberUpdate()
		
		// 회원 탈퇴 (delete)
		public long memberDelete(long memberNo) throws Exception{
			logger.info("MemberService - memberDelete() 호출");
			return memberMapper.memberDelete(memberNo);
		}// end memberDelete()
		
		// 아이디 중복확인
		public long memberCheck(String memberId) throws Exception{
			logger.info("MemberService - memberCheck() 호출");
			return memberMapper.memberCheck(memberId);
		}// end memberCheck
		
}// end MemberService
