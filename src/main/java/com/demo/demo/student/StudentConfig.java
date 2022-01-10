package com.demo.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student a=new Student(
                    "Abhinav",
                    "9743502844",
                    "abhinav@gmail.com",
                    "01/09/2001"
            );
            Student b=new Student(
                    "Anurag",
                    "9743dsf2844",
                    "abhinasdgmail.com",
                    "01/09/001"
            );
            repository.saveAll(List.of(a,b));
        };
    }

}
