package com.mubin.clients.notiification;

public record NotificationRequest(   Integer toCustomerId,
                                     String toCustomerName,
                                     String message) {
}
