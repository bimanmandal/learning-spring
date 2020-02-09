package com.biman.tutorial.controller;

import com.biman.tutorial.controller.accessDataJPA.StudentRepository;
import com.biman.tutorial.databaseObject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
public class EndPointController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/list")
    public ResponseEntity getAllStudents() {
        List<Student> students = StreamSupport
                .stream(studentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return ResponseEntity.ok(students);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateStudent(@PathVariable long id, @RequestBody Student student){
        Student studentFromRepository = studentRepository.findById(id).orElse(new Student());
        studentFromRepository.setName(student.getName());
        studentFromRepository.setMarks(student.getMarks());
        studentFromRepository.setRollNo(id);
        studentRepository.save(studentFromRepository);

        return ResponseEntity.ok("Student data saved successfully!!");
    }

    @DeleteMapping("/delete/{rollNo}")
    public ResponseEntity deleteStudent(@PathVariable long rollNo){
        System.out.println(rollNo);
        studentRepository.deleteByRollNo(rollNo);
        return ResponseEntity.ok("Student deleted Successfully");
    }

    @PostMapping("/add")
    public ResponseEntity saveStudent(@RequestBody Student student){
        studentRepository.save(student);

        return ResponseEntity.ok("Student saved successfully!!");
    }


}
