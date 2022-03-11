package com.gaurav.microservices.limitsservice.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties("limits.service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigProperties {
	private int maximum;
	private int minimum;
}
