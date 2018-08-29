package org.young.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Young
 * Date: 2018/8/29 0029
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello consul";
    }
}
