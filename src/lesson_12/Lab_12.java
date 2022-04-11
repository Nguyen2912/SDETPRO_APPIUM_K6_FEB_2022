package lesson_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
The main purpose of this lab is to explore Comparable and Comparator interfaces.
@Model

Please create a standard class for Book with below class fields:
ISBN
year
title
author

@Controller

Please create one (or more) methods to sort a List for below fields (ASC or DESC)
ISBN
year
title
author
 */
public class Lab_12 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book(17,2001,"Enchanted","Nguyen");
        Book book2 = new Book(12,2004,"Beauty and the Beast","Lan");
        Book book3 = new Book(14,2002,"Cong chua ngu trong rung","Ngoc Ngan");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        System.out.println("-----------List before sort --------------");
        printSortedBooks(bookList);
        initSort(EnumBook.SORTBYISBN,bookList);
        initSort(EnumBook.SORTBYYEAR,bookList);

    }
    private static void printSortedBooks(List<Book> bookList){
        for(Book book:bookList){
            System.out.println(book);
        }
    }
    private static void initSort(EnumBook enumBook,List<Book> bookList){
        switch (enumBook){
            case SORTBYISBN:
                System.out.println("-----------List after sort ISBN-----------");
                Collections.sort(bookList);
                printSortedBooks(bookList);
                break;
            case SORTBYYEAR:
                System.out.println("-----------List after sort Year-----------");
                Collections.sort(bookList, new BookAgeComparator());
                printSortedBooks(bookList);
                break;
            }
        }
    }

