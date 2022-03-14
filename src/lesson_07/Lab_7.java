package lesson_07;
/*
LAB 7
Create a simple menu
1. Input book
2. Find book by ISBN
0. Exit!
Book object
String ISBN
String title
String authorName
String/int year
Please override toString method to print out the found book.
If there is no matched book, please print out book not found
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_7 {
    public static void main(String[] args){
        System.out.println("========MENU========");
        System.out.println("1. Input book");
        System.out.println("2. Find book by ISBN");
        System.out.println("0. Exit!");
        Scanner scanner = new Scanner(System.in);
        List<Book> listbook = new ArrayList<>();

        String isbn;
        String title;
        String authorName;
        String year;
        String choose = scanner.nextLine();
        while (!choose.equals("0")){
            switch (choose){
                case "1":
                    System.out.println("Please input the book info");
                    System.out.println("Enter ISBN:");
                    isbn = scanner.nextLine();
                    System.out.println("Enter title:");
                    title = scanner.nextLine();
                    System.out.println("Enter authorName:");
                    authorName = scanner.nextLine();
                    System.out.println("Enter Year:");
                    year = scanner.nextLine();
                    while (!isbn.equals("-1")){
                        Book book = new Book(isbn,title,authorName,year);
                        listbook.add(book);
                        System.out.println("Enter ISBN:");
                        isbn = scanner.nextLine();
                        System.out.println("Enter title:");
                        title = scanner.nextLine();
                        System.out.println("Enter authorName:");
                        authorName = scanner.nextLine();
                        System.out.println("Enter Year:");
                        year = scanner.nextLine();
                    }
                    break;
                case "2":
                    System.out.println("Please enter ISBN: ");
                    isbn = scanner.nextLine();
                    for(Book b:listbook){
                        if(b.getISBN().equals(isbn)){
                            System.out.println(b);
                        }
                    }
                    break;
            }
            System.out.println("========MENU========");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("0. Exit!");
            choose = scanner.nextLine();
        }
    }
}
