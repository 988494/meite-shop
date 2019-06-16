package com.mayikt;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 微服务服务实现
 */
@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig
public class AppWeixin {

	public static void main(String[] args) {
		SpringApplication.run(AppWeixin.class, args);
	}
}
