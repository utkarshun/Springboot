package com.telusko;

public class Dev {
    private Computer com;
//    int age;
//    private int age;
    private int salary;
    public Dev(){
        System.out.println("Dev Constructor");
    }

//    public Dev(int age,int salary) {
//        this.age = age;
//        this.salary=salary;
//        System.out.println("Dev 1 constructor");
//    }
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
////        this.salary=salary;
//        System.out.println("Dev 1 constructor");
//}

//    public int getAge() {
//        return age;
//    }

//    public Dev(int salary) {
//        this.salary = salary;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("working on Awesome project");
        com.compile();
    }
}
