package com.mubin.clients.notiification;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("notification")
public interface notificationClient {

    @PostMapping(path = "/notification/api/v1/sendnotification")
    NotificationResponse sendNotification(NotificationRequest reqBody);
}
