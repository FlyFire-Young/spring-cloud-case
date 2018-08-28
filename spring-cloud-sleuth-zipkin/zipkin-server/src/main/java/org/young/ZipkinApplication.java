package org.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * User: Young
 * Date: 2018/8/28 0028
 * Time: 14:57
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
