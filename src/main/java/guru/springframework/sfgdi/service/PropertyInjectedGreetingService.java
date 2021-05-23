package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // Among all the beans which are there for the Interface GreetingService this will be the primary.
         // But you cannot use qualifier here on top of service class because it is not relevant.
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        System.out.println("Hello world");
        return "Hi world - Property";
    }
}
