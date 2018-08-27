package org.young.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Young
 * Date: 2018/8/24 0024
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/y")
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        logger.info("request one  name is "+name);
        return "hello "+name+"，this is first messge";
    }
}
