package tech.ibit.mybatis.springboot.autoconfigure;


import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.ibit.mybatis.plugin.ResultMapInterceptor;
import tech.ibit.structlog4j.Logger;
import tech.ibit.structlog4j.StructLoggerFactory;

/**
 * mybatis自动加载
 *
 * @author IBIT TECH
 */
@Configuration
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
public class IbitMybatisAutoConfigure {

    private Logger logger = StructLoggerFactory.getLogger(IbitMybatisAutoConfigure.class);

    @Bean
    public ResultMapInterceptor getResultMapInterceptor() {
        logger.info("Init ResultMapInterceptor!");
        return new ResultMapInterceptor();
    }

}
