package org.young.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.young.fallback.HystrixClientFallbackFactory;

/**
 * User: Young
 * Date: 2018/8/31 0031
 * Time: 11:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@FeignClient(value ="spring-cloud-eureka-provider",fallbackFactory = HystrixClientFallbackFactory.class)
public interface  HomeClient {

    @GetMapping("/")
    String consumer();

}