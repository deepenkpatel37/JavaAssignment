package com.assignment.data;

public class Student {
    private final String name;
    private final int enrollmentNo;

    public Student(String name, int enrollmentNo){
        this.name = name;
        this.enrollmentNo = enrollmentNo;
    }

    public Student(int enrollmentNo){
        this.name = "Unknown";
        this.enrollmentNo = enrollmentNo;
    }

    @Override
    public String toString(){
        return "name: " + this.name + ", enrollmentNo: " + this.enrollmentNo;
    }
}
