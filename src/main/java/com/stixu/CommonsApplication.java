package com.stixu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@Import(JpaConfiguration.class)
@ImportResource(locations={"classpath:application-context.xml"})
@ComponentScan(basePackages = "com.stixu",
				includeFilters = {@Filter(Controller.class), @Filter(RestController.class), @Filter(Service.class)}
)
public class CommonsApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CommonsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CommonsApplication.class, args);
	}
	
}
