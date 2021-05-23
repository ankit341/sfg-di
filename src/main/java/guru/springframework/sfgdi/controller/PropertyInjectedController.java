package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedGreetingService") // When primary and qualifier both are there then priority is given to qualifier
                                                  // Because it tells the spring to wire this specific dependency which is in the argument.
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
