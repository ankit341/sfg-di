package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"EN", "default"}) //SO you need profile when you have to run your application with different configurations, For example different databases
                            //The you can create the different profiles and use the implementation of the data source which you desire.
                            //You will have all the db configured and you can change the internal working only on the basis of your profile.
                            //You can have the default profile by the default keyword and when no profile specified in the application.properties
                            //Then the default profile will run.
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hi world - English Profile";
    }
}
