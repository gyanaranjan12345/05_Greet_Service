package com.gyana.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-SERVICE")
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg();

}
