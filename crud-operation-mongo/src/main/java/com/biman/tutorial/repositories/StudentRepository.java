package com.biman.tutorial.repositories;

import com.biman.tutorial.dbos.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {

  void deleteByRollNo(long rollNo);

  void deleteByName(String name);

  void deleteByMarks(int marks);

  Student findByRollNo(long rollNo);

  Student findByName(String name);

  Student findByMarks(int marks);

}
