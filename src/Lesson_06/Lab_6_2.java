package Lesson_06;

import java.util.Scanner;

/*
LAB 6.2
String myPassword = "password123";
Allow user to input maximum 3 times
 */
public class Lab_6_2 {
    public static void main(String[] args){
        String myPassword = "password123";
        String strinput;
        int numberofTime=0;
        Scanner scanner = new Scanner(System.in);
        while (numberofTime <3){
            System.out.print("You only have 3 times to login, Please enter your Password: ");
            strinput = scanner.next();
            if(strinput.equals(myPassword)){
                System.out.println("Correct Password");
                break;
            }
            else {
                System.out.println("Wrong Password");
            }
            numberofTime++;
        }

    }
}
