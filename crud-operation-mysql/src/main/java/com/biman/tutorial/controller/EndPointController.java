package com.biman.tutorial.controller;

import com.biman.tutorial.databaseObject.Student;
import com.biman.tutorial.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EndPointController {

  @Autowired
  StudentService studentService;


  @GetMapping("/list")
  public ResponseEntity getAllStudents() {
    List<Student> students = studentService.getAllStudents();
    return ResponseEntity.ok(students);
  }

  @GetMapping("/list/{id}")
  public ResponseEntity getStudent( @PathVariable long id) {
    Student student = studentService.getStudent(id);
    return ResponseEntity.ok(student);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity updateStudent(@PathVariable long id, @RequestBody Student student) {

    return (studentService.updateStudent(id, student))
        ? ResponseEntity.ok("Student updated successfully!!")
        : ResponseEntity.badRequest().body("Student not updated");
  }

  @DeleteMapping("/delete1/{rollNo}")
  public ResponseEntity deleteStudent(@PathVariable long rollNo) {
    studentService.deleteByRollNo(rollNo);
    return ResponseEntity.ok("Student deleted Successfully");
  }

  @DeleteMapping("/delete2/{name}")
  public ResponseEntity deleteStudentByName(@PathVariable String name) {
    return (studentService.deleteByName(name))
        ? ResponseEntity.ok("Student deleted Successfully")
        : ResponseEntity.notFound().build();
  }

  @DeleteMapping("/delete3/{marks}")
  public ResponseEntity deleteStudentByMarks(@PathVariable int marks) {
    return (studentService.deleteByMarks(marks))
        ? ResponseEntity.ok("Student deleted Successfully")
        : ResponseEntity.notFound().build();
  }

  @PostMapping("/add")
  public ResponseEntity saveStudent(@RequestBody Student student) {
    studentService.addStudent(student);
    return ResponseEntity.ok("Student saved successfully!!");
  }


}
