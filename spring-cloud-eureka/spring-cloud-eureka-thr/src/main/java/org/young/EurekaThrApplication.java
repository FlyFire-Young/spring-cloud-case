package org.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * User: Young
 * Date: 2018/8/29 0029
 * Time: 17:20
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaThrApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaThrApplication.class, args);
    }
}
