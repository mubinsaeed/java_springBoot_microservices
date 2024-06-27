package com.mubin;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.validation.constraints.Email;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notification")
@Entity
@Builder
public class Notification {

    @Id
    @SequenceGenerator(
            name = "notification_id_sequence",
            sequenceName = "notification_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notification_id_sequence"
    )
    @Column(name = "notification_id")
    private Integer notificationId;

    @Column(name = "message_sent")
    private String message;

    @Column(name = "sender")
    private String sender;

    @Column(name = "sendAt")
    private LocalDateTime sendAt;

    @Column(name = "emailAddress")
    @Email(message = "Email should be valid")
    private String emailAddress;

    @Column(name = "to_customer_id")
    private Integer toCustomerId;


}
