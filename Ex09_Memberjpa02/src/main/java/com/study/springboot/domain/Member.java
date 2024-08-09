package com.study.springboot.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity					//여기에 name 지정하면 테이블을 쓰지않아도됨
@Table(name="member02") //테이블 이름지정
public class Member {
	@Id	//primary key 설정
	@GeneratedValue 	//시퀀스 설정
	private Long id;
	private String username;
	private String email;
	
	public Member(String username, String email) {
		this.username = username;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", username=" + username + ", email=" + email + "]";
	}

}
