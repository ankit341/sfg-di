package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service //This is just an annotation for us, but for spring it is simply a component that should be kept in the IoC, as a bean and injected wherever that is needed.
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        System.out.println("Hello world");
        return "Hi world";
    }
}
