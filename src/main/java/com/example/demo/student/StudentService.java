package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service //This is a service class
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getStudents() {
        return studentRepository.findAll();
//        return List.of( // now we have a get mapping for our student controller
//                new Student( // right now this is a static list worry later
//                        1L,
//                        "Claire",
//                        "claire.shen@gmail.com",
//                        LocalDate.of(2003, 05, 05),
//                        20
//                )
//        ); // this class will get converted to a JSON object on local host
    }

    public void addNewStudent(Student student){
        Optional<Student> studentOptional =
            studentRepository.findStudentByEmail(student.getEmail());

        if (studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        studentRepository.save(student);
        System.out.println(student);
    }

    public void deleteStudent(Long studentId){
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("student with id " + studentId + " does not exist");
        }
        studentRepository.deleteById(studentId);
    }



}
