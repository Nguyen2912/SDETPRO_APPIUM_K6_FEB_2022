package lesson_03;
/*
    Lab3.2: Finding maximum value/minimum value from an integer array
        int[] intArr = {1, 2, 3, 4, 5};
        Minimum: 1
        Maximum: 5
 */

public class Lab_3_2 {
    public static void main(String[] args) {
        int intarray[] = {12,3,1,5,56};
        int max = intarray[0];
        int min = intarray[0];
        for(int i = 0;i < intarray.length;i++){
            if(max < intarray[i]){
                max = intarray[i];
            }
            if(min > intarray[i]){
                min = intarray[i];
            }
        }
        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);

    }
}
