import java.util.Scanner;

class Member {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    String address;
    String pnum;
    double salary;

    void getData() {
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.println("Enter address:");
        address = sc.nextLine();
        System.out.println("Enter phone number:");
        pnum = sc.nextLine();
        System.out.println("Enter salary:");
        salary = sc.nextDouble();
        sc.nextLine(); 
    }

    void putData() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
        System.out.println("Phone number:" + pnum);
    }

    void printSalary() {
        System.out.println("Salary :" + salary);
    }
}

class Employee extends Member {
    String spec;
    String dept;

    void get() {
        System.out.println("Enter specialization:");
        spec = sc.nextLine();
        System.out.println("Enter department:");
        dept = sc.nextLine();
    }

    void put() {
        System.out.println("Specialization: " + spec);
        System.out.println("Department: " + dept);
    }
}

class Manager extends Member {
    String dept;
    String spec;

    void get() {
        System.out.println("Enter specialization:");
        spec = sc.nextLine();
        System.out.println("Enter department:");
        dept = sc.nextLine();
    }

    void put() {
        System.out.println("Specialization: " + spec);
        System.out.println("Department: " + dept);
    }
}

public class p17 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        System.err.println("Enter deails of employee");
        e.getData();
        e.get();
       
        System.err.println("Enter deails of manager");
        m.getData();
        m.get();
        System.out.println("Deatils:");
        e.putData();
        e.put();
        m.putData();
        m.put();
    }
}