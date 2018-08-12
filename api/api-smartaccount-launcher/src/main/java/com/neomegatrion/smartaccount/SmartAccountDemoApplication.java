package com.neomegatrion.smartaccount;

import com.neomegatrion.smartaccount.model.Movement;
import com.neomegatrion.smartaccount.services.IMovementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Slf4j
@SpringBootApplication
public class SmartAccountDemoApplication {

    @Autowired
    private IMovementService movementService;

    public static void main(String[] args) {

        SpringApplication.run(SmartAccountDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            Movement m = new Movement();
            m.setDescription("hello world");
            m.setAmount(new BigDecimal(100));
            m.setSign(true);
            m.setEffectDate(new Date());

            movementService.save(m);

            List<Movement> all = movementService.findAll();

            all.forEach(movement -> log.info(movement.toString()));

//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }

        };
    }
}
