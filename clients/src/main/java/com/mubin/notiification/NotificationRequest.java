package com.mubin.notiification;

public record NotificationRequest(   Integer toCustomerId,
                                     String toCustomerName,
                                     String message) {
}
