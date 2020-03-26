package com.biman.tutorial.dbos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("student")
public class Student {

  @Id
  @JsonIgnore
  private String id;

  private long rollNo;

  private String name;

  private int age;

  private int marks;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }
}
