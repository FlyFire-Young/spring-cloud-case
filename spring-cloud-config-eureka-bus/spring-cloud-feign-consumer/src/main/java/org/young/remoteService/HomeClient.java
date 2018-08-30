package org.young.remoteService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * User: Young
 * Date: 2018/8/30 0030
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@FeignClient("spring-cloud-config-client")
public interface HomeClient {

    @GetMapping("/")
    String consumer();
}