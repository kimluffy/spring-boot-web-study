package io.github.kimluffy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.kimluffy.domain.HelloVO;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		
		return "Hello 9090";
	}
	
	@GetMapping("/hello2")
	public HelloVO hello2() {
		
		HelloVO vo = new HelloVO();
		vo.setComment("Hello");
		vo.setName("kimluffy");
		
		return vo;
	}
}
