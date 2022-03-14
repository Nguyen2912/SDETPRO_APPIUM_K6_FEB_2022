package Lesson_06;
/*
LAB 6.1
Given input string: "2hrs and 5 minutes"
Please calculate how many minutes in total
 */

public class Lab_6_1 {
    public static void main(String[] args){
        String stringinput = "2hrs and 5 minutes";
        String [] newstringinput = stringinput.split("and");
        String strhour = newstringinput[0].replaceAll("[^0-9]","");
        String strminute = newstringinput[1].replaceAll("[^0-9]","");
        int hour = Integer.parseInt(strhour);
        int minute = Integer.parseInt(strminute);
        int total_minutes = hour*60 +minute;
        System.out.println("Total minutes is: " + total_minutes);
    }
}
