package com.ebanking.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/coreBankingFallBack")
	public String coreBankingFallBackMethod() {
		return "Core Banking service is taking much longer than expected !!";
	}

}
