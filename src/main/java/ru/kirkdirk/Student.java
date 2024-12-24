package ru.kirkdirk;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int age;
    transient double GPA;

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

    public Student(String name, int age, double GPA) {
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }
}
