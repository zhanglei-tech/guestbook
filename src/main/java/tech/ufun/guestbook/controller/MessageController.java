package tech.ufun.guestbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ufun.guestbook.entity.Message;
import tech.ufun.guestbook.service.MessageService;

/**
 * (Message)表控制层
 *
 * @author zhanglei
 * @since 2020-08-08 16:43:31
 */
@RestController
@RequestMapping("message")
public class MessageController {
    /**
     * 服务对象
     */
    @Autowired
    private MessageService messageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Message selectOne(Long id) {
        return this.messageService.getById(id);
    }

}