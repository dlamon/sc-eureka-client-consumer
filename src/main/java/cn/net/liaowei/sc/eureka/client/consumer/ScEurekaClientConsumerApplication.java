package cn.net.liaowei.sc.eureka.client.consumer;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class ScEurekaClientConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScEurekaClientConsumerApplication.class, args);
	}
}
