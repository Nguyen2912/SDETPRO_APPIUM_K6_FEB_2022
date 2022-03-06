package lesson_05;
/*
Create a simple menu
1. Input student info
2. Find Student by ID
0. Exit!
Option 01...
Student Name:
Student ID:
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> studentList = new HashMap<>();
        System.out.println("============MENU===========");
        System.out.println("1. Input student info: ID - Name");
        System.out.println("2. Find Student by ID");
        System.out.println("0. Exit!");
        System.out.print("Please choose Option: ");
        String Name;
        int ID;
        int choose = scanner.nextInt();
        while (choose != 0){
            switch (choose){
                case 1:
                    System.out.print("Please input ID:");
                    ID = scanner.nextInt();
                    System.out.print("Please input Name:");
                    Name = scanner.next();
                    while(ID != -1){
                        studentList.put(ID,Name);
                        System.out.print("Please input ID:");
                        ID = scanner.nextInt();
                        System.out.print("Please input Name:");
                        Name = scanner.next();
                    }
                    break;
                case 2:
                    System.out.print("Please enter ID to find student: ");
                    ID = scanner.nextInt();
                    System.out.print("Name of student is: ");
                    System.out.println(studentList.get(ID));
                    break;
            }
            System.out.println("============MENU===========");
            System.out.println("1. Input student info: ID - Name");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit!");
            System.out.println("Please choose Option: ");
            choose = scanner.nextInt();
        }
    }
}
