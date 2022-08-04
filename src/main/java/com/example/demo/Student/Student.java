package com.example.demo.Student;

import jdk.jfr.Enabled;
import org.springframework.core.style.ToStringStyler;

import javax.persistence.*;

@Entity
@Table(name = "contacts")

public class Student {

    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "std_id")
    private Integer id;
    @Column(name = "std_name")
    private String name;
    @Column(name = "std_age")
    private Integer age;
    @Column(name = "std_number")
    private Integer number;


    public  Student(){
    }
    public Student (Integer id, String name, Integer age, Integer number){
        this.id = id;
        this.name = name;
        this.age = age;
        this.number = number;
    }
    public Student (String name, Integer age, Integer number){
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }
}
