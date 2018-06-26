package com.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
class MyAutoConfiguration {

	@Bean
	public LayoutDialect layoutDialect() {
	    return new LayoutDialect();
	}	
}
