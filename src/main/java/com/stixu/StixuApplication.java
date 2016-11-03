package com.stixu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@Import({JpaConfiguration.class, WebMvcConfiguration.class})
@ImportResource(locations={"classpath:application-context.xml"})
public class StixuApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StixuApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(StixuApplication.class, args);
	}
	
}
