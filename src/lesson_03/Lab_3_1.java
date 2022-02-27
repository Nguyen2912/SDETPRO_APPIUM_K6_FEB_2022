package lesson_03;
/*
    Lab3.1: Count how many odd, even number(s) in an integer array
    int[] intArr = {1, 2, 3, 4, 5};
    Even numbers: 2
    Odd numbers: 3
 */
public class Lab_3_1 {

    public static void main(String[] args) {
        int count_even = 0;
        int count_odd = 0;
        int intarray[] = {1, 12, 3, 5, 56};
        for (int i = 0;i < intarray.length; i++) {
            if(intarray[i] % 2 == 1){
                count_odd = count_odd + 1;
            }
            else {
                count_even = count_even + 1;
            }
        }
        System.out.println("Having " + count_odd + " ODD numbers " + count_even + " EVEN number");
    }
}
