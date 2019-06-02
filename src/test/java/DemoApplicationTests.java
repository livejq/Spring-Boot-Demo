import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * 基于 Web 容器的 测试（真实容器）
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
/* 随机分配端口，DEFINED_PORT 为使用默认的端口，如果 application.properties 中没有设置 server.port 的话
* 使用此方式进行测试时， 会启动一个真实的 Web 容器，若不想使用，也可进行模拟，设置为WebEnvironment.MOCK即可*/
public class DemoApplicationTests {

    /* 对 RestTemplate 进行了简单的封装， 我们不必知道 Web 的端口是多少就可以直接
    进行测试 */
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
