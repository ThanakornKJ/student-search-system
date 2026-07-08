package com.example.backend.model;

public class Student {

    private int id;
    private String studentCode;
    private String fullName;
    private String major;
    private int year;
    private String email;

    public Student() {
    }

    public Student(int id, String studentCode, String fullName, String major, int year, String email) {
        this.id = id;
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.major = major;
        this.year = year;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }
}