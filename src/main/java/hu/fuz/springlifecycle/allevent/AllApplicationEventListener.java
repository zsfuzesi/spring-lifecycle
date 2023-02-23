package hu.fuz.springlifecycle.allevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class AllApplicationEventListener implements ApplicationListener<ApplicationEvent> {

    private Logger logger = LoggerFactory.getLogger(AllApplicationEventListener.class);
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        logger.trace("New ewent: {}", event.getClass().getSimpleName());
    }
}
