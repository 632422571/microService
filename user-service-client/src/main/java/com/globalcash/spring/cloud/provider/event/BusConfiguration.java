package com.globalcash.spring.cloud.provider.event;

import org.springframework.cloud.bus.event.EnvironmentChangeRemoteApplicationEvent;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@RemoteApplicationEventScan(basePackageClasses = UserRemoteApplicationEvent.class)
public class BusConfiguration {

    @EventListener
    public void onRefreshRemoteApplicationEvent(RefreshRemoteApplicationEvent event) {
        System.out.printf(" Source : %s , originService : %s , destinationService : %s \n",
                event.getSource(),
                event.getOriginService(),
                event.getDestinationService());

    }

    @EventListener
    public void onEnvironmentChangeRemoteApplicationEvent(EnvironmentChangeRemoteApplicationEvent event) {

        System.out.printf("EnvironmentChangeRemoteApplicationEvent - " +
                        " Source : %s , originService : %s , destinationService : %s \n",
                event.getSource(),
                event.getOriginService(),
                event.getDestinationService());

    }

    @EventListener
    public void onUserRemoteApplicationEvent(UserRemoteApplicationEvent event) {

        System.out.printf("UserRemoteApplicationEvent - " +
                        " Source : %s , originService : %s , destinationService : %s \n",
                event.getSource(),
                event.getOriginService(),
                event.getDestinationService());
    }
}
