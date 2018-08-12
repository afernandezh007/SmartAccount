package com.neomegatrion.smartaccount.configuration;

import com.neomegatrion.smartaccount.audit.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.neomegatrion.smartaccount.repositories")
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class DataConfiguration {

    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }
}
