package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String getHello() {
        System.out.println("Hello World");

        return "Hi all";
    }
}
