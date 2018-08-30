package org.young.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Young
 * Date: 2018/8/30 0030
 * Time: 15:20
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
class HelloController {

    @Value("${content}")
    String content;

    @RequestMapping("/")
    public String home() {
        return "content:" + content;
    }
}
