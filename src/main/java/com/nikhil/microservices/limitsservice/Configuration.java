package com.nikhil.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "limits-service")
public class Configuration {

	private int minimum;
	private int maximum;
}
