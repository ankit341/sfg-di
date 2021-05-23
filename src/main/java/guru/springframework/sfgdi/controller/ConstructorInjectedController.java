package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //If you have a single constructor in a class then you do not need to provide the @Autowired annotation, as the spring recognizes the single constructor and injects
    //the bean, But if you have more than 1 constructor then you have to explicitly put @Autowired on the specific constructor which has all the dependency initialized.
    // @Qualifier("constructorInjectedGreetingService") so you cannot use a qualifier on top of the constructor, You should use it in argument of the constructor.
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
