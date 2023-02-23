package hu.fuz.springlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MySpringEventListener {

    private Logger logger = LoggerFactory.getLogger(MySpringEventListener.class);

    @EventListener
    void onWebServerInitializedEvent(WebServerInitializedEvent event){
        logger.trace("onWebServerInitializedEvent");
    }

    @EventListener
    void onApplicationStartedEvent(ApplicationStartedEvent event){
        logger.trace("onApplicationStartedEvent");
    }

    @EventListener
    void onApplicationReadyEvent(ApplicationReadyEvent event){
        logger.trace("onApplicationReadyEvent");
    }

    @EventListener
    void onApplicationFailedEvent(ApplicationFailedEvent event){
        logger.trace("onApplicationFailedEvent - hehe, nor work");
    }
    @EventListener
    void onApplicationStaringtEvent(ApplicationStartingEvent event){
        logger.trace("onApplicationStartEvent - hehe, not work :)");
    }
}
