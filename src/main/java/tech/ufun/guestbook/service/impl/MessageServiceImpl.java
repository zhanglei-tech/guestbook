package tech.ufun.guestbook.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.ufun.guestbook.dao.MessageDao;
import tech.ufun.guestbook.entity.Message;
import tech.ufun.guestbook.service.MessageService;

/**
 * (Message)表服务实现类
 *
 * @author zhanglei
 * @since 2020-08-08 16:43:29
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageDao, Message> implements MessageService {
}