package com.tintin.ApiGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		return "UserService is currently down";
	}
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		return "ContactService is currently down";
	}
}
