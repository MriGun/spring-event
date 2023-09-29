package com.mri.springevent.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRefreshedListener {
    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Appication initialized or refreshd");
        System.out.println(event);
    }
    @EventListener
    public void handleContextStartedEvent(ContextStartedEvent event) {
        System.out.println("Appication initialized with start()");
        System.out.println(event);
    }

    @EventListener
    public void handleContextStopedEvent(ContextStoppedEvent event) {
        System.out.println("Appication stopped with stop()");
        System.out.println(event);
    }

    @EventListener
    public void handleContextClosedEvent(ContextClosedEvent event) {
        System.out.println("Appication stopped with close()");
        System.out.println(event);
    }
}
