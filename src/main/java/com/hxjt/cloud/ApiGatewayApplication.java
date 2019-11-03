package com.hxjt.cloud;

import com.hxjt.cloud.com.hxjt.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayApplication {
    @Bean
    public TokenFilter tokenFilter(){
        System.out.println("dev11");
        System.out.println("deve 1231");
        System.out.println("sddss"
        );
        System.out.println("ssss new ");
        System.out.println("ddd");
        return  new TokenFilter();
    }

	public static void main(String[] args) {
        System.out.println("4555");
        System.out.println("sssss");
        SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
