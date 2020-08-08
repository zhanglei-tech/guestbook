package tech.ufun.guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试
 *
 * @author zhanglei
 * @date 2020/8/8 14:58
 */
@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping("/")
    public String index() {
        return "test";
    }
}
