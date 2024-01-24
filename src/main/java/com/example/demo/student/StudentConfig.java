package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student claire = new Student( // right now this is a static list worry later
                    1L,
                    "Claire",
                    "claire.shen@gmail.com",
                    LocalDate.of(2003, Month.JANUARY, 5)
            );

            Student alan = new Student(
                    2L,
                    "Alan",
                    "alan.wang@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 9)
            );

            Student mark = new Student(
                    3L,
                    "Mark",
                    "mark.smith@gmail.com",
                    LocalDate.of(1999, Month.MARCH, 20)
            );

            repository.saveAll(
                    List.of(claire, alan, mark)
            );
        };
    }

}
