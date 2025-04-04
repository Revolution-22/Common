package com.revolution.common.command;

public record OrderCommand (
        long orderId,
        long receiverId
){
}
