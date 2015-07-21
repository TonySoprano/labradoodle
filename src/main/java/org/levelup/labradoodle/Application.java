package org.levelup.labradoodle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        logger.debug("Registered beans: {}", Arrays.toString(context.getBeanDefinitionNames()));
    }

}
