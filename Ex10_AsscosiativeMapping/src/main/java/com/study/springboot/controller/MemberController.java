package com.study.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.domain.Member;
import com.study.springboot.service.MemberService;


@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	@RequestMapping("/minsert")
	public String minsert(Member member, Model model) {
		Member m = memberService.minsert(member);
		model.addAttribute("member", m);
		return "minsert";
	}
	
	 @RequestMapping("/mupdate")
	   public String mupdate(Member member,Model model) {
		 String result = "";
		 Optional<Member> m = memberService.findByIds(member.getId());
		 if(m.isPresent()) {
			 if(m.get().getPassword().equals(member.getPassword())) {
			 member.setCreateAt(m.get().getCreateAt());
			 member.setPassword(m.get().getPassword());
			 memberService.update(member);
			 model.addAttribute("member",m.get());
			 result ="mupdate";
			 
			 }else {
				 result= "index";
			 }
			 
		 }else {
			 result ="index";
		 }
		 return result;
	   }
	 
}