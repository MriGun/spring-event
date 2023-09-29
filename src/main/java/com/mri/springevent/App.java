package com.mri.springevent;

import com.mri.springevent.config.AppConfig;
import com.mri.springevent.publisher.Gpay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.start();
        Gpay gpayBean = context.getBean("gpay", Gpay.class);
        gpayBean.sendMoney("Mrinmoy", 500, true);

        context.stop();
        context.close();
    }
}
