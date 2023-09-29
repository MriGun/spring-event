package com.mri.springevent.listener;

import com.mri.springevent.events.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SendSmsListner {

    //@Order(1)
    @EventListener
    public void listnerTransactionFailure(TransactionFailureEvent failureEvent) {
        System.out.println("Send sms listener! -> inside --> starting");
        try {
            Thread.sleep(4000);
            System.out.println("Hi " + failureEvent.getName());
            System.out.println("Sms of , Your transaction amount  " + failureEvent.getAmount() + " has been failed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Send email listener! -> inside --> ending");
    }
}
