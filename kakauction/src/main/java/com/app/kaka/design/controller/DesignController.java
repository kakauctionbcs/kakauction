package com.app.kaka.design.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/design")
public class DesignController {
	private static final Logger logger = LoggerFactory.getLogger(DesignController.class);
	
	@RequestMapping("/index.do")
	public String index(){
		logger.info("index페이지");
		
		return "/design/main/index";
	}
	
	@RequestMapping("/down.do")
	public String down(){
		logger.info("index페이지");
		
		return "/design/test/down";
	}
	
	@RequestMapping("/top.do")
	public String top(){
		logger.info("index페이지");
		
		return "/design/inc/top";
	}
	
	@RequestMapping("/bottom.do")
	public String bottom(){
		logger.info("index페이지");
		
		return "/design/inc/bottom";
	}
}
