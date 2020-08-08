package tech.ufun.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhanglei
 * @date 2020/8/8 15:03
 */
@Configuration
@MapperScan("tech.ufun.guestbook.**.dao")
public class ApplicationConfig {
}
