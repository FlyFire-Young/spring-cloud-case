package org.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * User: Young
 * Date: 2018/8/29 0029
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulSecProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulSecProducerApplication.class, args);
    }
}
