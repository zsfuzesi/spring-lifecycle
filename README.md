# Spring lifecycle app
Ez a kisalkalmazás bemutatja, hogy egy spring bean létrejötte után és
le rombolása előtti fázisára hogyan lehet ráülnünk. 

Az alkalmazás bemutatja a spring ApplicationEventek figyelését, külön kitér arra is,
hogyan lehet azokat az eseményeket is figyelni, melyek még a spring context felépülése
előtt váltódnak ki.

A következő módokon indulhat az alkalmazás:
```java
SpringApplication.run(SpringLifecycleApplication.class, args);
```
vagy 
```java
       ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringLifecycleApplication.class)
               .listeners(listener).run();
```
ahol a listener [BeforeApplicationContextListener.java](src%2Fmain%2Fjava%2Fhu%2Ffuz%2Fspringlifecycle%2FBeforeApplicationContextListener.java)
vagy [AllApplicationEventListener.java](src%2Fmain%2Fjava%2Fhu%2Ffuz%2Fspringlifecycle%2Fallevent%2FAllApplicationEventListener.java).
Utóbbi minden egyes ApplicationEvent-et figyel.
 
