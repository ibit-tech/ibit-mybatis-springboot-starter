package tech.ibit.mybatis.springboot.autoconfigure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试ResultMapInterceptor是否有启动
 *
 * @author IBIT-TECH
 * mailto: ibit_tech@aliyun.com
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@RunWith(SpringRunner.class)
public class IbitMybatisAutoConfigureTest {

    @Test
    public void getResultMapInterceptor() {
    }
}