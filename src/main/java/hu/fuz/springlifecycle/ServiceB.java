package hu.fuz.springlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private Logger logger = LoggerFactory.getLogger(ServiceB.class);

    public ServiceB(){
        logger.debug("ServiceB konstruktor");
    }

    @PostConstruct
    public void init(){
        logger.debug("ServiceB @PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        logger.debug("ServiceB @PreDestroy");
    }
}
