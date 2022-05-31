package com.hupean.task;

import com.hupean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author hupan
 * @description
 * @date 2022/5/16
 */
@Service
public class TestTask {

    // 自动注入提供者的接口类（依赖于pom中引用的提供者依赖，以及dubbo配置中的消费者依赖）
    @Autowired
    UserService userService;

    @Scheduled(cron = "0 0/1 * * * ?")
    void doTask(){
        // 验证。从配置中心获取提供者，在调用提供者服务
        String name = userService.getName("hupean");
        System.out.println("*** run provider task success ***  " + name);
    }
}
