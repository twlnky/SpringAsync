package rut.miit.tech.springasync.configuration;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncExample {
    @Autowired
    private AnotherExample anotherExample;

    public void doWork(){
        this.doWorkAsync();
        System.out.println("Work done");
    }

    @Async
    @SneakyThrows
    public void doWorkAsync(){
        Thread.sleep(3000);
    }

}

@Component
class AnotherExample{
    @Async
    @SneakyThrows
    public void doWork(){
        Thread.sleep(3000);
    }
}
