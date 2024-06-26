package com.mubin.notiification;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("notification")
public interface notificationClient {

    @PostMapping(path = "/notification/api/v1/sendnotification")
    NotificationResponse sendNotification(NotificationRequest reqBody);
}
