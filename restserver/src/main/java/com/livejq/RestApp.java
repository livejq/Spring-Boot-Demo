package com.livejq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestApp {
    public static void main(String args[]) {
        SpringApplication.run(RestApp.class, args);
    }

    @GetMapping(value = "/person/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person person(@PathVariable String name) {

        Person p = new Person();
        p.setAge(10);
        p.setName("zhl");
        return p;
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
