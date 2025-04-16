package com.revolution.common.event;

public record EmailNotifyEvent(
        String email,
        String subject,
        String message
) {
}
