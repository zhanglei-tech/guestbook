package tech.ufun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author zhanglei
 * @date 2020/8/8 12:12
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GuestbookApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuestbookApplication.class, args);
        System.out.println("Guestbook 启动成功 ヾ(@^▽^@)ノ");

    }
}
