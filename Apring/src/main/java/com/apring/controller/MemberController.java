package com.apring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apring.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	private final Logger logger = 
			LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/MemberRegister")
	public void BoardRegisterGET() {
		logger.info("MemberC - memberRegisterGET() 호출");
	} // end MemberRegisterGET()
	
	@PostMapping("MembeResiger")
	public void MemberREgisterPOST() {
		logger.info("MemberC - memberRegisterPOST() 호출");
	} // end MemberRegisterPOST()
}// end MemberController
