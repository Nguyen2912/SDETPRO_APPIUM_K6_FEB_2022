package lesson_02;
import java.util.Scanner;
/*
 Lab2.2: Allow user to input a number, print out it’s an odd or even number
 */
public class Lab_2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        if(number == 0){
            System.out.println("O is not an ODD number and EVEN number");
        }
        else if(number % 2 == 1){
            System.out.println("This is an ODD number");
        }
        else {
            System.out.println("This is an EVEN number");
        }
    }
}
