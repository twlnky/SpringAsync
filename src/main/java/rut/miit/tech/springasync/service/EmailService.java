package rut.miit.tech.springasync.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Async()
   public void sendUserRegConfirmition(String email){
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println("Письмо с подтверждением регистрации отправлено");
    }
}
