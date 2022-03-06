package lesson_04;
/*
=====MENU======
1. Add number into ArrayList
2. Print numbers
3. Get maximum number
4. Get minimum number
Optional: Add option number 5 to find a number -> index
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> Listnumber = new ArrayList<>();
        System.out.println("================MENU================");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("Please choose the option (Exist 0):");
        int number = 0;
        int choose = scanner.nextInt();
        while(choose != 0 ) {
            switch (choose) {
                case 1:
                    System.out.println("Please add number into arraylist (Exit -1):");
                    number = scanner.nextInt();
                    while (number != -1) {
                        Listnumber.add(number);
                        number = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Arraylist:");
                    for (int value : Listnumber) {
                        System.out.print(value + " ");
                    }
                    break;
                case 3:
                    int max = Listnumber.get(0);
                    for(int value:Listnumber){
                        if(max < value){
                            max = value;
                        }
                    }
                    System.out.println("Maximum value is: " + max);
                    break;
                case 4:
                    int min = Listnumber.get(0);
                    for(int value:Listnumber){
                        if(min > value){
                            min = value;
                        }
                    }
                    System.out.println("Minimum value is: " + min);
                    break;
            }
            System.out.println("\n================MENU================");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("Please choose the option (Exist 0):");
            choose = scanner.nextInt();
        }
    }
}
