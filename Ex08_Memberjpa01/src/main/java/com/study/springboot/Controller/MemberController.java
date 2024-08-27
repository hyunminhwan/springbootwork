package com.study.springboot.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springboot.domain.Member;
import com.study.springboot.service.MemberService;

@Controller
public class MemberController {
   
   @Autowired
   MemberService memberService;
   
   @RequestMapping("/")
   public String root() {
      return "/menu";
   }
   
   //??갯수의 생성자를 만들지 않고 빌더를 사용하면 ??개를 넣어줄수 있다
   @RequestMapping("/insert")
   public String insert(@RequestParam("username") String username, Model model) {
      Member member = Member.builder()
                  			.username(username)
                  			.createDate(LocalDate.now())
                  			.build();
      
      Member result = memberService.insert(member);
      model.addAttribute("member", result);
      return "insert";
   }
   
   @RequestMapping("/select")
   public String select(@RequestParam("id") Long id,Model model) {
	   Optional<Member> member=memberService.select(id);
	   if(member.isPresent()) { //isPresent() : 데이터가 있는지 체크. 있으면 true 없으면 false
		   model.addAttribute("member",member.get());
	   }else {
		   model.addAttribute("member",null);
	   }
	   return "select";
   }
   
   @RequestMapping("/selectAll")
	public String selectAll(Model model) {
		List<Member> list = memberService.selectAll();
		model.addAttribute("mList", list);
		return "selectAll";
	}
   
   @RequestMapping("/update")
   public String update(Member m,Model model) {
	  m.setCreateDate(LocalDate.now());
	  Member member = memberService.update(m);
	  model.addAttribute("member",member);
	   return "update";
   }
   
   @RequestMapping("/delete")
   public String delete(@RequestParam("id") Long id,Model model) {
	   memberService.delete(id);
	   return "menu";
	  
   }
}
