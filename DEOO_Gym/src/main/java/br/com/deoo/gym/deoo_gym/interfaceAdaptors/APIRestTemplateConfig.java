package br.com.deoo.gym.deoo_gym.interfaceAdaptors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class APIRestTemplateConfig {

    @Bean
    @Qualifier("APIRestTemplate")
    public RestTemplate APIRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add((request, body, execution) -> execution.execute(request, body));
        return restTemplate;
    }
}
