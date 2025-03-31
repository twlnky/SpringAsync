package rut.miit.tech.springasync.configuration;

import jakarta.annotation.PreDestroy;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Executors;

@Configuration
public class EventConfig {
    @Bean
    public ApplicationEventMulticaster applicationEventMulticaster() {
        SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
        return eventMulticaster;
    }

    @Bean
    public SimpleAsyncTaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor executor = new SimpleAsyncTaskExecutor();
        executor.setConcurrencyLimit(5);
        return executor;
    }

    @Async
    @PreDestroy
    @SneakyThrows
    public void preDestroy() {
        Executors.newSingleThreadExecutor().submit();
        Thread.sleep(5000);
    }
}
