package tech.ufun.guestbook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tech.ufun.guestbook.entity.Message;

/**
 * (Message)表数据库访问层
 *
 * @author zhanglei
 * @since 2020-08-08 16:43:25
 */
@Repository
public interface MessageDao extends BaseMapper<Message> {
}