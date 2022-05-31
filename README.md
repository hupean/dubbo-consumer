# Dubbo Sample by hupean

dubbo框架服务
【服务消费者】：
0.引入zookeeper和dubbo相关依赖，可查看pom文件
1.定义接口：com.hupean.service.UserService
    注意：该步骤仅针对不在同一个maven工程下的两个独立的springboot工程，才需要在（和服务提供者）相同的路径下相同的接口类中定义相同的接口（不需要实现）。
         如果是在同一个maven工程下的不同模块的独立工程，服务消费者工程中就无需再创建一个同名接口，可以通过pom文件引入提供者模块，再用@Autowired注解直接引入对应接口类，即可正常调用提供者中的接口以及实现。
2.定义服务提供者dubbo配置，consumer模块resource目录下，consumer.xml。主要是为了引入注册中心中的服务提供者提供的接口
3.启动类引入consumer.xml配置，com.hupean.task.TestTask业务代码中通过@Autowired注解引入提供者的接口类，直接调用即可

参考：
dubbo官网：https://dubbo.apache.org/zh/
dubbo.xml配置可参考：https://blog.csdn.net/niugang0920/article/details/81975421