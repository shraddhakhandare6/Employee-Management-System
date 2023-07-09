package Employee_management_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoInterface dao=new EmployeeDaoImple();
        System.out.println("Welcome to Employee Management System!!");
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1. Add Employee\n"+
                    "2. Show Employee\n"+
                    "3. Show Employee ID\n"+
                    "4. Update The Employee\n"+
                    "5. Delete The Employee\n");

            System.out.println("Enter choice: ");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    Employee emp=new Employee();
                    System.out.println("Enter ID: ");
                    int id= sc.nextInt();
                    System.out.println("Enter Name: ");
                    String name= sc.next();
                    System.out.println("Enter Salary: ");
                    double salary= sc.nextDouble();
                    System.out.println("Enter Age: ");
                    int age= sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.getSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    System.out.println("Thank you!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice!");
                    break;


            }

        }while (true);
    }
}
