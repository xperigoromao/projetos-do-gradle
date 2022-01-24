package one.digitalinnovation.gof.controller;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

public class ConfigPort {
	
	
@Component
public abstract class ServerPortCustomizer 
implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
 @Override
public void customize(ConfigurableWebServerFactory factory) {
	     factory.setPort(8090);
	   }
	}
	
	

}
