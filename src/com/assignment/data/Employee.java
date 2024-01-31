package com.assignment.data;

public class Employee {
    private final String name;
    private final int yearOfJoining;
    private final int salary;
    private final String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}
