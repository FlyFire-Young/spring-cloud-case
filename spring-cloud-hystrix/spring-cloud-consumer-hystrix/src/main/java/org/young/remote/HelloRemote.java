package org.young.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: Young
 * Date: 2018/8/29 0029
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@FeignClient(name= "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
