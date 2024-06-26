package com.mubin;


import com.mubin.clients.notiification.NotificationRequest;
import com.mubin.clients.notiification.NotificationResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping(path = "/notification")
public class NotificationController {

    @Autowired
    private final NotificationService service;

    @PostMapping(path = "/api/v1/sendnotification")
    public NotificationResponse sendNotification(@RequestBody NotificationRequest reqBody) {
        String ans = service.saveNotification(reqBody);
        return new NotificationResponse(ans);
    }

}
