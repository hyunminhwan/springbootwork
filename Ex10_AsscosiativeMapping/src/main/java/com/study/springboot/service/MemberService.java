package com.study.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	MemberRepository memberRepository;
	public Member minsert(Member member) {
		//업데이트 && 생성
		return memberRepository.save(member);
	}
	public Optional<Member> findByIds(String id) {
	Optional<Member> m=memberRepository.findById(id);
		return m;
		
	}
	public Member update(Member member) {
		return memberRepository.save(member);
	}
	
}