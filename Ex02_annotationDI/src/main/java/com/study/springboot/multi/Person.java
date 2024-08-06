package com.study.springboot.multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//person
@Component
public class Person {
	
	@Value("홍길동")
	private String name;
	@Value("번개")
	private String nickname;
	@Autowired
	@Qualifier("printerA")
	private Printer printer;
	
	public Person() {
	}

	public Person(String name, String nickname, Printer printer) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void print() {
		printer.print("Hello"+name+":"+nickname);
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", nickname=" + nickname + ", printer=" + printer + "]";
	}
	
	
}
