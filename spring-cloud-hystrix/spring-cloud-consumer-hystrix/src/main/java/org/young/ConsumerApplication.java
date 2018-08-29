package org.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * User: Young
 * Date: 2018/8/29 0029
 * Time: 14:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
