import com.livejq.service.MainService;
import com.livejq.service.ThirdService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainService.class)
public class MockThirdTest {
    @MockBean
    private ThirdService thirdService;

    @Autowired
    private MainService mainService;

    @Test
    public void testMainService() {
        // 模拟 ThirdService 调用 thirdService() 方法返回的结果 somethings
        BDDMockito.given(this.thirdService.thirdService()).willReturn("somethings");
        mainService.mainService();
    }


}
