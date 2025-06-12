package com.telusko;


 // Spring will create a bean of this class
public class Dev {
//    private Laptop laptop;
    private Computer com;
//     private int age;
//     private int Salary;

//     public Dev(int age,int Salary,Laptop laptop) {
//         this.age = age;
//         this.Salary=Salary;
//         this.laptop=laptop;
//         System.out.println("Dev 1 Constructor: age=" + age + ", Salary=" + Salary);
//     }

//     public int getAge() {
//         return age;
//     }
//     public int getSalary(){
//         return Salary;
//     }

//     public void setAge(int age,int Salary) {
//         this.age = age;
//         this.Salary=Salary;
//
//     }
//    public Dev(Laptop laptop){
//         this.laptop=laptop;
//        System.out.println("Dev 1 Constructor");
//    }

//     public Laptop getLaptop() {
//         return laptop;
//     }

//     public void setLaptop(Laptop laptop) {
//         this.laptop = laptop;
//         System.out.println("Laptop has been set via setter injection");
//     }
    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com=com;
    }
    public Dev(){
        System.out.println("Dev Constructor");
    }
    public void build() {
        System.out.println("Working On Awesome Project");
        com.compile();
    }

}
