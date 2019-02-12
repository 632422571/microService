package com.globalcash.spring.cloud.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author gh
 * @date 2019/2/12 11:51
 */
public interface UserMessage {

    @Output("user-message-out")
    MessageChannel output();
}
