package com.gaurav.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LimitsConfig {
	
	private int maximum;
	private int minimum;

}
