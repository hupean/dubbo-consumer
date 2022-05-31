package com.hupean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author hupan
 * @description dubbo服务启动前需要先运行zookeeper
 * @date 2022/5/15
 */
@SpringBootApplication
@EnableScheduling
@ImportResource({"classpath:consumer.xml"})//注入dubbo配置
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
