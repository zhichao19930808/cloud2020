package xin.zcglory.springCloud.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplictionContextConfig  {


    @Bean
    public RestTemplate getRestTempLate() {
        return new RestTemplate();
    }


}
