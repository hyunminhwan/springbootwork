package com.study.springboot.multi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	//@Bean : 메소드에 어노테이션을 붙이면 return 되는 객체를 bean
	@Bean
	public Person Person1() {
		// setter()메소드를 이용한 의존성 주입
		Person person3 =new Person();
		person3.setName("홍길동");
		person3.setNickname("아버지라부르지못함");
		person3.setPrinter(new PrinterA());
						
			
		return person3;
	}
	
	@Bean(name="hello") //return 의 객체 이름이 없는 경우 @Bean옆에 이름을 명시
	public Person Person2() {
		//constructor를 이용한 의존성 주입
		return new Person("이순신","장군",new PrinterA());
	}
	
	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}
	
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
}
