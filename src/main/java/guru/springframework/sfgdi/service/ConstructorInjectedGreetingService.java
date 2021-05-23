package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        System.out.println("Hello world");
        return "Hi world - Constructor";
    }
}
