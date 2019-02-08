#Service Registry &, Discovery
	This project acts as the client, which on 
	start up automatically gets registered with the Eureka Service

#Dependencies
	Check the build.gradle

#How to enable
	Add annotation to the main application class:
	"@EnableDiscoveryClient"

#application.properties
	spring.application.name=<Service Discovery Name>
	server.port=<Application Port>
	eureka.client.service-url.defaultZone=http://<IP of Eureka Service>:<Port>/eureka/
	
	Default port for Eureka Service: 8716	