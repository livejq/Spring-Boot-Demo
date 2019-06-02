import com.livejq.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试业务组件
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = MyService.class)
/*
 * 当 webEnvironment 声明为 NONE 时，即为不依赖 Web 容器进行的测试， 所以后面必须指定要
 * 测试的Bean, 然后才能通过注解 @Autowired 进行依赖注入
 */
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    public void testGeneralService() {

//      myService = new MyService();
        String result = myService.generalService();
        System.out.println("测试结果为：" + result);
    }
}
