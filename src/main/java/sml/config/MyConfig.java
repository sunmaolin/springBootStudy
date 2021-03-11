package sml.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.*;
import sml.bean.User;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *      组件依赖必须使用Full模式默认。其他默认是否Lite(轻量级)模式
 */
@Configuration(proxyBeanMethods = false) //告诉SpringBoot这是一个配置类 == 配置文件
//@Import() 导入某些类到容器中
//@ImportResource() 导入applicationContext.xml等配置文件
public class MyConfig {

//    @Conditional()  该注解下有许多子注解，满足条件后才进行装配
//    @ConditionalOnClass() 比如：onClass  容器中有某个类才进行 User Bean的装配
    @Bean
    public User user01(){
        return new User("孙茂林");
    }
}
