package com.biman.tutorial.databaseObject;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private long rollNo;
    private String name;
    private int marks;

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
