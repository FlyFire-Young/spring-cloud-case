package org.young.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.young.clients.HomeClient;

/**
 * User: Young
 * Date: 2018/8/31 0031
 * Time: 11:34
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private HomeClient homeClient;

    @GetMapping(value = "/hello")
    public String hello() {
        return  homeClient.consumer();
    }

}
