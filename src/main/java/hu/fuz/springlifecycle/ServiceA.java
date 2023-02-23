package hu.fuz.springlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    private Logger logger = LoggerFactory.getLogger(ServiceA.class);

    private final ServiceB serviceB;
    public ServiceA(ServiceB serviceB){
        this.serviceB = serviceB;
        logger.debug("ServiceA konstruktor");
    }

    @PostConstruct
    public void init(){
        logger.debug("ServiceA @PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        logger.debug("ServiceA @PreDestroy");
    }
}
