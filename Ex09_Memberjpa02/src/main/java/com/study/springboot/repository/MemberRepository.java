package com.study.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.springboot.domain.Member;

@Repository													//Long은 @id가 붙은 필드의 자료형
public interface MemberRepository extends JpaRepository<Member,Long> {

	Optional<Member> findByUsername(String name);

	Optional<Member> findByEmail(String email);

	List<Member> findByUsernameLike(String username);

	List<Member> findByUsernameLikeOrderByUsernameDesc(String username);
	
	List<Member> findByUsernameLike(String username, Sort sort);
}
