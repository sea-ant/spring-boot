package net.greatsoft.datachange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author sea_ant  
 * @creatDate 2018年7月25日 
 *
 */
@EnableEurekaServer

@SpringBootApplication

public class IefopEurekaServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(IefopEurekaServerApplication.class, args);

	}

}