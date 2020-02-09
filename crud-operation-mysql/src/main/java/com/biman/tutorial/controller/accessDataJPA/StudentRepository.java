package com.biman.tutorial.controller.accessDataJPA;

import com.biman.tutorial.databaseObject.Student;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface StudentRepository extends CrudRepository<Student, Long> {
    @Transactional
    void deleteByRollNo(long rollNo);
}
