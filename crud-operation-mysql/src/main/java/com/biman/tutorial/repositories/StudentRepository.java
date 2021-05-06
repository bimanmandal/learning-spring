package com.biman.tutorial.repositories;

import com.biman.tutorial.dbos.Student;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface StudentRepository extends CrudRepository<Student, Long> {
    @Transactional
    void deleteByRollNo(long rollNo);  // naming as - deleteBy<column-name>

    @Transactional
    void deleteByName(String name);

    @Transactional
    void deleteByMarks(int marks);

    @Transactional
    Student findByRollNo(long rollNo);  // naming as - deleteBy<column-name>

    @Transactional
    Student findByName(String name);

    @Transactional
    Student findByMarks(int marks);
}
