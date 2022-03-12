package com.imooc.algorithms.sort.basic;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int score;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        score = 0;
    }

    @Override
    public int compareTo(Student stu) {
        int lastName = this.lastName.compareTo(stu.lastName);
        return lastName == 0 ? this.firstName.compareTo(stu.firstName) : lastName;
    }

    @Override
    public String toString() {
        return "{Stu: " + this.firstName + ", " + this.lastName + "}";
    }
}
