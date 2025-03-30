package rut.miit.tech.springasync;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rut.miit.tech.springasync.service.EmailService;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    void testAsyncEmailSending() throws InterruptedException {
        long start = System.currentTimeMillis();
        emailService.sendUserRegConfirmition("test1@example.com");
        emailService.sendUserRegConfirmition("test2@example.com");
        emailService.sendUserRegConfirmition("test3@example.com");
        Thread.sleep(4000);
        long duration = System.currentTimeMillis() - start;
        System.out.println("Total time: " + duration);
    }
}