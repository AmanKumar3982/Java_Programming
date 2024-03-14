// Q1.Design a class Employee with attributes like employeeId, name, and salary. Derive classes Manager and Clerk with additional attributes.


import java.util.*;

class Employee{
    int employeeId;
    String name;
    int salary;

    Scanner sc = new Scanner(System.in);
    public void loadData(){
        System.out.print("Enter EID : ");
        employeeId = sc.nextInt();
        System.out.print("Enter Name : ");
        sc.next();
        name = sc.nextLine();
        System.out.print("Enter Salary : ");
        salary = sc.nextInt();
    }
}

class Manager extends Employee{
    int yoe;
    int workperday;

    public void loadExtraData(int yoe, int workperday){
        this.yoe = yoe;
        this.workperday = workperday;
    }

    public void printData(){
        System.err.println("EID : " + employeeId);
        System.err.println("Name : " + name);
        System.err.println("Salary : " + salary);
        System.err.println("Year of Experience : " + yoe);
        System.err.println("Work per Day : " + workperday);

    }
}

class Clerk extends Employee{
    int yoe;
    int workperday;

    public void loadExtraData(int yoe, int workperday){
        this.yoe = yoe;
        this.workperday = workperday;
    }

    public void printData(){
        System.err.println("EID : " + employeeId);
        System.err.println("Name : " + name);
        System.err.println("Salary : " + salary);
        System.err.println("Year of Experience : " + yoe);
        System.err.println("Work per Day : " + workperday);

    }
}


class E5Q1{
    public static void main(String[] args) {
        Manager mg = new Manager();
        mg.loadData();
        mg.loadExtraData(5, 2);

        System.out.println();

        Clerk cl = new Clerk();
        cl.loadData();
        cl.loadExtraData(2, 8);

        mg.printData();
        cl.printData();
    }
}