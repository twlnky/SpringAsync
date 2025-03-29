package rut.miit.tech.springasync.service;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import rut.miit.tech.springasync.configuration.UserRegistrationEvent;

@Service
@RequiredArgsConstructor
public class UserRegistrationService {

    private final Faker faker;
    private final ApplicationEventPublisher eventPublisher;

    @Scheduled(fixedRate = 1000, initialDelay = 3000)
    public void generateUserRegistration() {
        String email = faker.internet().emailAddress();
        UserRegistrationEvent event = new UserRegistrationEvent(this, email);
        eventPublisher.publishEvent(event);
        System.out.println("Сгенерирован email: " + email);
    }
}
