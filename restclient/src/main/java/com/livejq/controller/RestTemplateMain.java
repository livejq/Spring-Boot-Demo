package com.livejq.controller;

import org.springframework.web.client.RestTemplate;

public class RestTemplateMain {
    public static void main(String args[]) {
        RestTemplate rt = new RestTemplate();
        Person p = rt.getForObject("http://localhost:8080/person/zhl", Person.class);
        System.out.println("请求成功，返回的数据，名字 : " + p.name + " , 年龄 : " + p.age);
    }
    static class Person {
        String name;
        Integer age;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
