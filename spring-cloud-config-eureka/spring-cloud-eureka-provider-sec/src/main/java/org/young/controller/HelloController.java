package org.young.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Young
 * Date: 2018/8/30 0030
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class HelloController {

    @Value("${content}")
    String content;

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "Hello world ,sec,port:" + port+",content="+content;
    }
}
