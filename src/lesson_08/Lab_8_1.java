package lesson_08;
import java.util.ArrayList;
import java.util.List;
/*
Create a class Employee with a method salary to return employee’s salar
There are 2 types of employee: Full time employee and contract employee
Full time employee has salary is 50000 and contract employee has salary 40000
Write a method to accept a list of Employee and calculate total salary
For example, company has 3 FTE and 2 contractor
 */
public class Lab_8_1 {
    public static void main(String[] args){
        int totalSalary = 0;
        Employee FTE1 = new FullTimeEmployee();
        Employee FTE2 = new FullTimeEmployee();
        Employee FTE3 = new FullTimeEmployee();

        Employee CT1 = new contractEmployee();
        Employee CT2 = new contractEmployee();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(FTE1);
        employeeList.add(FTE2);
        employeeList.add(FTE3);
        employeeList.add(CT1);
        employeeList.add(CT2);

        for(Employee list:employeeList){
            totalSalary = totalSalary + list.getSalary();
        }
        System.out.println("Total salary is: " + totalSalary);
    }
}
