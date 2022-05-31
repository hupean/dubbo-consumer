package com.hupean.service;

public interface UserService {

    // 由于该服务消费者和服务提供者是分开的独立项目，所以需要定义和服务提供者一样的接口（接口所在路径，方法名参数等），不需要实现。不定义的话，后面调用的时候注入不了这个接口类
    // 如果提供者和消费者在同一个工程下，即使是独立的模块，也可以直接在pom中引入提供者即可实现@Autowired自动注入接口类。不需要在单独定义和提供者一样的接口
    String getName(String name);

}
