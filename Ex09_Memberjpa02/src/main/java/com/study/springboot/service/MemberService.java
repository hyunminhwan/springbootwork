package com.study.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
   
   @Autowired
   MemberRepository memberRepository;
   
   public Member insert(Member member) {
      // save() : insert할 떄의 메소드(JPA에 API)
      Member rmember =memberRepository.save(member);
      return rmember;
   }
	/*
		Optional<T> : nullpointerException 발생을 방지하기 위해 사용
						기존의 반환 값에 타입T를 optional<T> Wrapping하여,null 대신
						Optional안에 빈 타입 객체를 돌려주는 기법
		
		Member member=memberRepository.findById(id);
		member.getId(); =>nullpointerException 발생
	*/					
   public Optional<Member> selectById(Long id) {
	   //findById() : Id는 @Id를 의미 (primary key)
	   Optional<Member> member=memberRepository.findById(id);
	   
	   return member;
   }
   
   public List<Member> selectAll() {
		return memberRepository.findAll();
	}
   
   public Member update(Member m) {
	   // save()  : insert할 때의 메소드 (JPA에 API)
	   //			동일한 키가 있으면 update, 키가 없으면 insert
	   Member member = memberRepository.save(m);
	   return member;
   }
   
   public void delete(Long id) {
	 memberRepository.deleteById(id);
   }
   
   public Optional<Member> selectByName(String name){
	   Optional<Member> member = memberRepository.findByUsername(name);
	   return member;
   }
   
   public Optional<Member> selectByEmail(String email){
	   Optional<Member> member = memberRepository.findByEmail(email);
	   return member;
   }
   public List<Member> selectByNameLike(String username) {
	   return memberRepository.findByUsernameLike(username);
	 
   }
   public List<Member> selectByNameLikeDesc(String username) {
		return memberRepository.findByUsernameLikeOrderByUsernameDesc(username);
	}
   
   public List<Member> selectByNameLikeSort(String username, Sort sort) {
	      
	      return memberRepository.findByUsernameLike(username, sort);
	   }


   
   
   
   
   
   
   
   
   
   
   
}
