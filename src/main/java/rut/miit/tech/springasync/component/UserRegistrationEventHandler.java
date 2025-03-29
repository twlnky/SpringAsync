package rut.miit.tech.springasync.component;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import rut.miit.tech.springasync.configuration.UserRegistrationEvent;
import rut.miit.tech.springasync.service.UserRegistrationService;

@Component
public class UserRegistrationEventHandler {
    private final UserRegistrationService userRegistrationService;

    public UserRegistrationEventHandler(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @EventListener
    public void handleUserRegisration(UserRegistrationEvent userRegistrationEvent) {
        System.out.println("Получено письмо регистрации пользователя - " + userRegistrationService);
    }
}
