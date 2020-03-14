package com.biman.tutorial.services;

import com.biman.tutorial.controller.accessDataJPA.StudentRepository;
import com.biman.tutorial.databaseObject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StudentService {

  @Autowired
  StudentRepository studentRepository;

  public List<Student> getAllStudents() {
    List<Student> students = StreamSupport
        .stream(studentRepository.findAll().spliterator(), false)
        .collect(Collectors.toList());
    return students;
  }

  public Boolean updateStudent(long id, Student student){

    Student studentupdated;
    studentupdated = studentRepository.findById(id).orElse(new Student());
    studentupdated.setName(student.getName());
    studentupdated.setMarks(student.getMarks());
    studentupdated.setRollNo(id);
    studentRepository.save(studentupdated);
    return true;
  }

  public Boolean deleteByRollNo(long rollNo) {
    studentRepository.deleteByRollNo(rollNo);
    return true;
  }

  public Boolean deleteByName(String name) {
    if (studentRepository.findByName(name) == null)
      return false;
    studentRepository.deleteByName(name);
    return true;
  }

  public Boolean deleteByMarks(int marks) {
    if (studentRepository.findByMarks(marks) == null)
      return false;
    studentRepository.deleteByMarks(marks);
    return true;
  }

  public Boolean addStudent(Student student) {
    studentRepository.save(student);
    return true;
  }

  public Student getStudent(long id) {
    return studentRepository.findById(id).orElse(new Student());
  }
}
