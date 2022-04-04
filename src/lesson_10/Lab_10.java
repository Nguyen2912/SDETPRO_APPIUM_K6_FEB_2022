package lesson_10;

import java.util.Arrays;
import java.util.List;

/*
Get lab 8.1 done with abstraction!
Create a class Employee with a method salary to return employee’s salar
There are 2 types of employee: Full time employee and contract employee
Full time employee has salary is 50000 and contract employee has salary 40000
Write a method to accept a list of Employee and calculate total salary
For example, company has 3 FTE and 2 contractor
 */
public class Lab_10 {
    public static void main(String[] args) {
        int TOTAL = 0;
        Employee FTE1 = new FTE();
        Employee FTE2 = new FTE();
        Employee FTE3 = new FTE();

        Employee CT1 = new Contract();
        Employee CT2 = new Contract();

        List<Employee> employeeList = Arrays.asList(FTE1, FTE2, FTE3, CT1, CT2);
        for(Employee employee:employeeList){
            TOTAL = TOTAL + employee.getSalary();
        }
        System.out.println("The Salary is: "+ TOTAL);
    }
}
