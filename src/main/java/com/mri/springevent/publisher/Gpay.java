package com.mri.springevent.publisher;

import com.mri.springevent.events.TransactionFailureEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Gpay {

    private final ApplicationEventPublisher eventPublisher;

    public void sendMoney(String name, double amount, boolean condition) {

        try{
            if (condition) {
                throw new RuntimeException("Transaction failed!");
            }

            System.out.println("Hi : " + name);
            System.out.println("Sending amount : " + amount);
        }
        catch (Exception e) {
            eventPublisher.publishEvent(new TransactionFailureEvent(name, amount));
        }

    }
}
