package org.young.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.young.clients.HomeClient;

/**
 * User: Young
 * Date: 2018/8/31 0031
 * Time: 11:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<HomeClient> {

    @Override
    public HomeClient create(Throwable throwable) {
        return () -> "Feign + hystrix ,提供者服务挂了";
    }

}
