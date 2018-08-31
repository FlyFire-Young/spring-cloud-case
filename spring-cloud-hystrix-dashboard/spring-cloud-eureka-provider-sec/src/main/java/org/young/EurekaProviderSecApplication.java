package org.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: Young
 * Date: 2018/8/31 0031
 * Time: 11:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderSecApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderSecApplication.class, args);
    }
}
