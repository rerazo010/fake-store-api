package com.fake_store_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FakeStoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakeStoreApiApplication.class, args);
	}

}
