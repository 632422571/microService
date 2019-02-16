package com.globalcash.spring.cloud.event;

import com.globalcash.spring.cloud.domain.User;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

public class UserRemoteApplicationEvent extends RemoteApplicationEvent {
    public UserRemoteApplicationEvent(){

    }
    public UserRemoteApplicationEvent(User user, String originService,
                                      String destinationService) {
        super(user, originService, destinationService);
    }

}
