package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;

@Controller
public class MemberController {
	
	@RequestMapping(value = "/memberAdd")
	public String memberAdd(MemberDTO m) {
		System.out.println(m);
		// 출력까지만 구현함. 이후 회원가입 구현 할것.
		return "main";	// main.jsp
	}
	
	
	@RequestMapping(value = "/login")
	public String login(@RequestParam String userid,@RequestParam String passwd) {	// @RequestParam 생략가능
		System.out.println(userid+"\t"+passwd);
		return "main";
	}
}
