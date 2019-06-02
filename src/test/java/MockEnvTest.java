import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;

/*
 * 基于 Web 容器的 测试（模拟容器）
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
// SpringBootTest 中的 webEnvironment 默认值即为MOCK
@AutoConfigureMockMvc
public class MockEnvTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHello() throws Exception {
        ResultActions ra = mockMvc.perform(MockMvcRequestBuilders.get(new URI("/hello")));
        MvcResult result = ra.andReturn();
        System.out.println("响应结果为：" + result.getResponse().getContentAsString());
    }

}
