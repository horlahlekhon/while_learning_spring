package com.sisyphus.springbootbasics.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootTutorialApplication.class,args);


		for (String name: applicationContext.getBeanDefinitionNames()) {
			// System.out.println(name); //this will print out the names of all the beans that have been declared in this context
			//it will include all the beans that have been autoconfigured also. the configurations are configured by a plugin called springbootAutoconfigure,
			//which looks at what dependencies are on the class path and configure their requirements automatically
			//by matching their requirements and configuring them.
		}
	}

}

