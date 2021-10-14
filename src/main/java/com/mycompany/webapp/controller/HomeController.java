package com.mycompany.webapp.controller;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class HomeController {
	
	@RequestMapping("/") // localhost:8080이 생략되어 있는 것임.
	public String home() {
//		logger.error("실행");
//		logger.warn("실행");
//		logger.info("실행");
//		logger.debug("실행"); // 이부분은 출력안됨 왜냐하면 info까지만 출력되게 application.properties에서 설정했음.
		log.info("실행");
		return "home"; // template 폴더에서 찾음. template engine 을 뭘 쓰냐에 따라 다름. thymeleaf를 쓰면 확장자 html
	}
}
