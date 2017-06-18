package org.springdays.ny2017.demo.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SalesTaxDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesTaxDemoServiceApplication.class, args);
	}
}
