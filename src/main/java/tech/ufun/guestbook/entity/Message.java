package tech.ufun.guestbook.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * (Message)实体类
 *
 * @author zhanglei
 * @since 2020-08-08 16:43:22
 */
@Data
@TableName("message")
public class Message {
    /**
     * 物理主键
     */
    @TableId("id")
    private Long id;

    /**
     * 逻辑主键
     */
    @TableField("message_id")
    private String messageId;

    /**
     * 消息留言
     */
    @TableField("message")
    private String message;

    /**
     * 留言时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 留言人
     */
    @TableField("create_by")
    private String createBy;

}