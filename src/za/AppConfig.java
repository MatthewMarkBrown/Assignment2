package src.za;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean(name="calc")
public App getService(){
    return new AppCalcImpl();
}


}
