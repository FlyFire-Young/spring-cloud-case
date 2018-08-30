package org.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: Young
 * Date: 2018/8/30 0030
 * Time: 16:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderThrApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderThrApplication.class, args);
    }
}
