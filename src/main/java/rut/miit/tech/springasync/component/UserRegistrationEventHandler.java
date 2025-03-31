package rut.miit.tech.springasync.component;

import jakarta.annotation.PreDestroy;
import lombok.SneakyThrows;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import rut.miit.tech.springasync.configuration.UserRegistrationEvent;
import rut.miit.tech.springasync.service.UserRegistrationService;

@Component
public class UserRegistrationEventHandler {
    private final UserRegistrationService userRegistrationService;

    public UserRegistrationEventHandler(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @Async
    @EventListener
    public void handleUserRegisration(UserRegistrationEvent userRegistrationEvent) {
        System.out.println("Получено письмо регистрации пользователя - " + userRegistrationService);
    }

    @Async
    @PreDestroy
    @SneakyThrows
    public void preDestroy() {
        Thread.sleep(5000);
    }
}
