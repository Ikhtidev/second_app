package uz.ikhtidev.second_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.sql.Time;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SecondAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondAppApplication.class, args);
    }

//    @Scheduled(fixedRate = 1000L)
//    public void startRate() {
//        System.out.println("New rate: " + new Date());
//    }

//    @Scheduled(fixedDelay = 1000L)
//    public void startDelay() {
//        System.out.println("New delay: " + new Date());
//    }

//    @Scheduled(cron = "0 15 16 * * *")
//    public void startCron() {
//        System.out.println("New cron: " + new Date());
//    }

}
