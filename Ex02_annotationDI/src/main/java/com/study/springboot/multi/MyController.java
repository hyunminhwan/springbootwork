package com.study.springboot.multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
//@Controller : Bean으로 등록하는 것은 같음
/*
	어떤 기능을 수행하는 경우는 @Controller
	의존성 주입에 사용되는 경우는 @Component
	
*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MyController {
	@Autowired
	Person Person1;
	
	@Autowired
	@Qualifier("printerB")
	Printer printer;
	
	@Autowired
	Person Person2;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "스프링 부트 어려운데?";
	}
}
