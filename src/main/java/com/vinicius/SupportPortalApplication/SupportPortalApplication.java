package com.vinicius.SupportPortalApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.File;

import static com.vinicius.SupportPortalApplication.constant.FileConstant.USER_FOLDER;

@SpringBootApplication
public class SupportPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupportPortalApplication.class, args);
		new File(USER_FOLDER).mkdirs();
	}


	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
