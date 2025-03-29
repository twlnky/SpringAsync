package rut.miit.tech.springasync.configuration;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;
@Getter
public class UserRegistrationEvent extends ApplicationEvent {
    private final String email;

    public UserRegistrationEvent(Object source, Clock clock, String email) {
        super(source, clock);
        this.email = email;
    }

    public UserRegistrationEvent(Object source, String email) {
        super(source);
        this.email = email;
    }

}
