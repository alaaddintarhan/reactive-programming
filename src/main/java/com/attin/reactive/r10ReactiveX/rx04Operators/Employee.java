package com.attin.reactive.r10ReactiveX.rx04Operators;

public class Employee {

    double salary, raiting;
    private Integer id;
    private String name;

    public Employee(Integer id, String name, double salary, double raiting) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.raiting = raiting;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", raiting=" + raiting +
                '}';
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }
}
