package com.mri.springevent.listener;

import com.mri.springevent.events.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SendEmailListner {
    //@Order(2)
    @EventListener
    public void listnerTransactionFailure(TransactionFailureEvent failureEvent) {
        System.out.println("Hi " + failureEvent.getName());
        System.out.println("Email of You transaction amount  " + failureEvent.getAmount() + " has been failed");
    }
}
