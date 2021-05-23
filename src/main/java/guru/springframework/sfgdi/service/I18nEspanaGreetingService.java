package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("ES")
public class I18nEspanaGreetingService  implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - Espana Profile";
    }
}
