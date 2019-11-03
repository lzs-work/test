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
        System.out.println("第一次修改");
        System.out.println("第二次修改");
        System.out.println("分支修改");
        System.out.println("dev2");
        System.out.println(
                "2"
        );
        return  new TokenFilter();
    }

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
