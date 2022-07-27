package service;

import compoent.logini;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("service.impl")
@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {

    @Bean
    public logini logini(){
        return new logini();
    }
}
