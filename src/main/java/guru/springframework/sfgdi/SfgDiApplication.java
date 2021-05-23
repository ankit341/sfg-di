package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = ctx.getBean("myController", MyController.class);

		System.out.println(myController.getHello());

		PropertyInjectedController propertyInjectedController = ctx.getBean("propertyInjectedController", PropertyInjectedController.class);

		SetterInjectedController setterInjectedController = ctx.getBean("setterInjectedController", SetterInjectedController.class);

		ConstructorInjectedController constructorInjectedController = ctx.getBean("constructorInjectedController", ConstructorInjectedController.class);

		System.out.println("--------------Property Based-------------------------");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------------------Setter Based----------------------");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------------Constructor Based-----------------------");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("-------------------Profiling exercise-----------------");

		I18nController i18nController = ctx.getBean("i18nController", I18nController.class);

		System.out.println(i18nController.getGreeting());
	}

}
