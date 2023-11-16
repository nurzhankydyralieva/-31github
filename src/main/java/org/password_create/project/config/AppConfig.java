package org.password_create.project.config;

import com.epam.project.service.ProfileService;
import com.epam.project.storage.Storage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.epam.project")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean(initMethod = "initBean", destroyMethod = "destroyBean")
    public Storage storage() {
        return new Storage();
    }

    @Bean
    public ProfileService profileService() {
        return new ProfileService();
    }

}
