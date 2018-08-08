package net.greatsoft.datachange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @author sea_ant  
 * @creatDate 2018年7月25日 
 *
 */
@EnableEurekaClient

@SpringBootApplication

public class IefopEurekaClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(IefopEurekaClientApplication.class, args);

	}

}