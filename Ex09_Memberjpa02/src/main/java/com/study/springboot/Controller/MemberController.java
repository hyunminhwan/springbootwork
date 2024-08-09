package com.study.springboot.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
 
   @RequestMapping("/selectAll")
   public String selectAll(Model model) {
	  List<Member> member = memberService.selectAll();
	  model.addAttribute("list",member);
	  model.addAttribute("title","All");
	  return "selectAll";
   }
   
   @RequestMapping("/selectById")
   public String selectById(Long id,Model model) {
	   Optional<Member> member = memberService.selectById(id);

	   if(member.isPresent()) {
		   model.addAttribute("member",member.get());
	   }else {
		   model.addAttribute("member",null);
	   }
	   model.addAttribute("title","id");
	   return "/select_one";
   }
	
   @RequestMapping("selectByName")
   public String selectByName(String name,Model model) {
	   Optional<Member> member= memberService.selectByName(name);
	   if(member.isPresent()) {
		   model.addAttribute("member",member.get());
		  
	   }else {
		   model.addAttribute("member",null);
	   }
	   model.addAttribute("title","name");
	   return "/select_one";
   }
   
   
   
   @RequestMapping("selectByEmail")
   public String selectByEmail(String email,Model model) {
	   Optional<Member> member= memberService.selectByEmail(email);
	   if(member.isPresent()) {
		   model.addAttribute("member",member.get());
		   
	   }else {
		   model.addAttribute("member",null);
	   }
	   model.addAttribute("title","email");
	   return "/select_one";
   }
   
   @RequestMapping("/selectByNameLike")
   public String selectByNameLike(String name,Model model) {
	   String username = "%"+name+"%";
	   List<Member> member = memberService.selectByNameLike(username);
	   model.addAttribute("list",member);
	  System.out.println(member);
	   model.addAttribute("title","NameLike");
	   return "/selectAll";
   }
   
   @RequestMapping("/selectByNameLikeDesc")
	public String selectByNameLikeDesc(String name, Model model) {
		String username = "%" + name + "%";
		List<Member> member = memberService.selectByNameLikeDesc(username);
		model.addAttribute("list", member);
		model.addAttribute("title","NameLikeDesc");
		return "selectAll";
	}
   
   @RequestMapping("/selectByNameLikeSort")
   public String selectByNameLikeSort(String name, Model model) {
      String username = "%" + name + "%";
      Sort sort = Sort.by(Sort.Order.desc("username"), Sort.Order.asc("email")); // 같을때는 한번더 써줘서 또 차순써줌
      
      
      
      List<Member> member = memberService.selectByNameLikeSort(username,sort);
      model.addAttribute("list", member);
      model.addAttribute("title","NameLikeSort");
      return "selectAll";
   }
	   
	   
	   
	   
	   
	   
	   

}
