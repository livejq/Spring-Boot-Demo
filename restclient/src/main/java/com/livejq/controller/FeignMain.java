package com.livejq.controller;

import com.livejq.domain.Person;
import com.livejq.service.PersonClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import org.springframework.context.annotation.Bean;

/**
 * 运行出现 NoClassDefFoundError : com/google/gson/JsonException
 * 可能是版本问题导致，赞未解决。除使用 RestTemplate、Feign 之外，还可以使用 Restlet、CXF 等框架来调用 Rest 服务。
 */
public class FeignMain {
    public static void main(String args[]) {
        // 内部使用了JDK动态代理，返回一个代理对象
        PersonClient fn = Feign.builder()
                .decoder(new GsonDecoder())
                .target(PersonClient.class, "http://localhost:8080/");
        Person p = fn.getPerson("zhl");
        System.out.println("请求成功，返回的数据，名字 : " + p.name + " , 年龄 : " + p.age);
    }

    @Bean
    public PersonClient getPersonClient() {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(PersonClient.class, "http://localhost:8080/");
    }
}
