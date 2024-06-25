package com.mubin;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@Slf4j
@AllArgsConstructor
public class NotificationService {

    @Autowired
    private final NotificationRepository notificationRepository;
    public void saveNotification(Notification notification) {

        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(notification.getToCustomerId())
                        .emailAddress(notification.getEmailAddress())
                        .sender("Mubin")
                        .sendAt(LocalDateTime.now())
                        .build()
        );

        log.info("Notification saved of the object {}", notification);
    }
}
