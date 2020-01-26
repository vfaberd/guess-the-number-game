package com.faberv.console;

import com.faberv.config.AppConfig;
import com.faberv.MessageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        log.info("messageGenerator.getMainMessage() = {}", messageGenerator.getMainMessage());
        log.info("messageGenerator.getResultMessage() = {}", messageGenerator.getResultMessage());
        context.close();
    }
}
