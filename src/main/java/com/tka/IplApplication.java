package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class IplApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplApplication.class, args);
		System.out.println("true");
	}

}
