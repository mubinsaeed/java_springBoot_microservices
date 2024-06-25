package com.mubin;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping(path = "/notification")
public class NotificationController {

    @Autowired
    private final NotificationService service;

    @PostMapping(path = "/api/v1/sendnotification")
    public void sendNotification(Notification notification) {
        service.saveNotification(notification);
    }

}
