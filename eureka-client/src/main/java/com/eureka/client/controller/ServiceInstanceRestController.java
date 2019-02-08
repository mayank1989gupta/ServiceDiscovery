/**
 * 
 */
package com.eureka.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MGupta
 *
 */
@RestController
public class ServiceInstanceRestController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	/**
	 * Service to get all service instances by Service Name.</br>
	 * 
	 * @param applicationName
	 * @return
	 */
	@GetMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> fetch(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}