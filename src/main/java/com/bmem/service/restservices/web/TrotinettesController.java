package com.bmem.service.restservices.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope()
@RestController
public class TrotinettesController {
 

	 @Value("${xParam}")
	 private int xParam;
	 
	 @Value("${yParam}")
	 private int yParam;
	  
	 @Value("${me}")
	 private String me;
	 


	@GetMapping("/myConfig")
	public Map<String, Object> myConfig(){
		Map<String, Object> param = new HashMap<>();
		param.put("xParam", xParam);
		param.put("yParam", yParam);
		param.put("me", me);
		param.put("threadName", Thread.currentThread().getName());
		return param;
	}
	
	@Bean
	private void lancer() {
		System.out.println("TrotinettesController");
		System.out.println(xParam);
		System.out.println(yParam);
		System.out.println(me);
	}
}
