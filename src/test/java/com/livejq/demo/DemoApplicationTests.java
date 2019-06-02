package com.livejq.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testHello() {
        String result1 = testRestTemplate.getForObject("/hello", String.class);
        assertEquals("Hello ! liveJQ", result1);
        System.out.println("测试 hello 成功！");

        String result2 = testRestTemplate.getForObject("/", String.class);
        assertEquals("Welcome to Spring Boot ~", result2);
        System.out.println("测试 home 主页 成功！");
    }

}
