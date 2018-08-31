package org.young.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * User: Young
 * Date: 2018/8/31 0031
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "backMethod")
    @GetMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://spring-cloud-eureka-provider/", String.class).getBody();
    }

    public String backMethod() {
        return "Ribbon + hystrix Dashboard ,提供者服务挂了";
    }

}
