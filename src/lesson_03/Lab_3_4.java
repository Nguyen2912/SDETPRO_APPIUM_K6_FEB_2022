package lesson_03;
/*
    Lab3.4: Merge 2 SORTED integer array into one SORTED array
    Array 01: {1, 12, 16, 28, 34}
    Array 02: {1, 13, 16, 27, 99}
    Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
 */

public class Lab_3_4 {
    public static void main(String[] args) {
        int[] array01 = {1, 12, 16, 28, 34};
        int[] array02 = {1, 13, 16, 27, 99};
        int[] array = new int[array01.length + array02.length];
        int min,temp;
        for (int i = 0; i < 5; i++) {
            array[i] = array01[i];
        }

        for (int j = 0; j < array02.length; j++) {
            array[array01.length + j] = array02[j];
        }
        for(int i = 0;i < array.length-1;i++){
            min = array[i];
            for(int j = i+1;j < array.length;j++){
                if(min > array[j]){
                    temp = min;
                    min = array[j];
                    array[i]= min;
                    array[j]= temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
