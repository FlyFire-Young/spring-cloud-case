package org.young.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Young
 * Date: 2018/8/28 0028
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        logger.info("request two name is "+name);
        try{
            Thread.sleep(5000);
        }catch ( Exception e){
            logger.error(" hello two error",e);
        }
        return "hello "+name+"，this is first messge";
    }
}
