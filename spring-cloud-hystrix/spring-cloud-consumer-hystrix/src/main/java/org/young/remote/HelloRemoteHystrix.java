package org.young.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: Young
 * Date: 2018/8/29 0029
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed ";
    }
}