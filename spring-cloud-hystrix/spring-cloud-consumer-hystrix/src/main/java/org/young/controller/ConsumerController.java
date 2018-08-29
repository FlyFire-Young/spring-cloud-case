package org.young.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.young.remote.HelloRemote;

/**
 * User: Young
 * Date: 2018/8/29 0029
 * Time: 14:44
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class ConsumerController {

    private final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/helloMethod/{name}")
    @HystrixCommand(fallbackMethod="getFallback")
    public String helloMethod(@PathVariable("name") String name) {
        logger.info("request getFallback "+name);
        return helloRemote.hello(name);
    }

    @RequestMapping("/helloReal/{name}")
    public String helloReal(@PathVariable("name") String name) {
        logger.info("request helloFeign "+name);
        return helloRemote.hello(name);
    }

    @HystrixCommand
    public String getFallback(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed, server disconnection";
    }

}
