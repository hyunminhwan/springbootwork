package com.study.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springboot.domain.Board;
import com.study.springboot.domain.Member;
import com.study.springboot.service.BoardService;
import com.study.springboot.service.MemberService;



@Controller
public class BoardController {
   
   @Autowired
   BoardService boardService;
   
   @Autowired
   MemberService memberService;
   
   @RequestMapping("/binsert") 
      public String binsert(@RequestParam("id") String id,Board board, Model model) {
         String result="";
	   	Optional<Member> m =memberService.findByIds(id);
         if(!m.isPresent()) {
        	 result="index";
         }else {
         board.setMember(m.get());
         
         Board b = boardService.binsert(board);
         model.addAttribute("board", b);
         result="binsert";
         }
         return result;
      }
   
  
   
}
