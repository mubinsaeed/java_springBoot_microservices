package com.mubin;

import com.mubin.notiification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
@AllArgsConstructor
public class NotificationService {

    @Autowired
    private final NotificationRepository notificationRepository;
    public String saveNotification(NotificationRequest reqBody) {

        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(reqBody.toCustomerId())
                        .emailAddress(reqBody.toCustomerName())
                        .sender("Mubin")
                        .sendAt(LocalDateTime.now())
                        .build()
        );

        log.info("Notification saved of the object {}", reqBody);
        return "Notification saved";
    }

}
