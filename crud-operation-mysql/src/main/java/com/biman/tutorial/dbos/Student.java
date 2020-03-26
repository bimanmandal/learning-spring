package com.biman.tutorial.dbos;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    // it looks for column name except for primary key and _
    @Id
    private long rollNo;  // column-name in table is roll_no - underscore removed and next letter is capital. valid for primary key only.
    private String name;  /// order need not be same as in table. column-names should match
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
