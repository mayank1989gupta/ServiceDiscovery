/**
 * 
 */
package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author MGupta
 *
 * Application class --> Annotated with Enable Discovery client, </br>
 * makes the service available to be discovered under Eureka Service.</br>
 */

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
