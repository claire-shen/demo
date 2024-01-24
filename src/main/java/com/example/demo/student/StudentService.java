package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service //This is a service class
public class StudentService {
    public List<Student> getStudents() {
        return List.of( // now we have a get mapping for our student controller
                new Student( // right now this is a static list worry later
                        1L,
                        "Claire",
                        "claire.shen@gmail.com",
                        LocalDate.of(2003, 05, 05),
                        20
                )
        ); // this class will get converted to a JSON object on local host
    }
}
