package org.young.controller;

import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.young.remoteService.HomeClient;

/**
 * User: Young
 * Date: 2018/8/30 0030
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class ConsumerController {

    @Autowired
    private HomeClient homeClient;

    @GetMapping(value = "/hello")
    public String hello() {
        try {
            //模拟手动刷新refresh，刷新8081端口下的config信息
            MediaType JSON = MediaType.parse("application/json; charset=utf-8");
            RequestBody body = RequestBody.create(JSON, " ");
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://localhost:8081/refresh")
                    .post(body)
                    .build();
            Response response = client.newCall(request).execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常-----------");
        }
        return homeClient.consumer();
    }
}
