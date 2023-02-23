package hu.fuz.springlifecycle;

import hu.fuz.springlifecycle.allevent.AllApplicationEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringLifecycleApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringLifecycleApplication.class)
//                .listeners(new SthEventListener()).run();
        SpringApplication.run(SpringLifecycleApplication.class, args);
    }

}
