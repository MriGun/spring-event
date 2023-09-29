package com.mri.springevent;

import com.mri.springevent.publisher.Gpay;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringEventApplication {

	private final Gpay gpay;

	public static void main(String[] args) {
		SpringApplication.run(SpringEventApplication.class, args);
		System.out.println("Spring event is running!");
	}

}
