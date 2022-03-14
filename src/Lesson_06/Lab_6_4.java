package Lesson_06;
import java.util.Scanner;

/*
LAB 6.4
String url = "https://google.com";
Check http OR https; domain name, .com OR .net
 */
public class Lab_6_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter url: ");
        String url = scanner.next();

        int position_com = url.indexOf(".com");
        int position_net = url.indexOf(".net");
        if(position_com != -1){
            System.out.println("https");
        }
        if(position_net != -1){
            System.out.println("http");
        }
    }
}
