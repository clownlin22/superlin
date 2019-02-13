import com.example.oauthserver.OauthServerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: lxy
 * @Date: 2019/2/12 14:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OauthServerApplication.class)
public class Testss {

    @Test
    public void test89() {



        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encodedPassword = passwordEncoder.encode("admin");
        System.out.println(encodedPassword);
    }


}
