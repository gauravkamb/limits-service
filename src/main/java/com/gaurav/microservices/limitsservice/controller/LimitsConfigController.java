package com.gaurav.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.microservices.limitsservice.model.ConfigProperties;
import com.gaurav.microservices.limitsservice.model.LimitsConfig;

@RestController
public class LimitsConfigController {
	
	@Autowired
	private ConfigProperties configProperties;
	
	@GetMapping("/limits")
	public LimitsConfig retrieveConfig() {
		return new LimitsConfig(configProperties.getMaximum(), configProperties.getMinimum());
	}
}
