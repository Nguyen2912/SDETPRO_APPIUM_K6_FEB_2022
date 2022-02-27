package lesson_03;
/*
    Lab 3.3: Sort an integer array from min to max
    Input: {12, 34, 1, 16, 28}
    Expected output: {1, 12, 16, 28, 34}
 */
public class Lab_3_3 {
    public static void main(String[] args) {
        int [] intarray = {12, 34, 1, 16, 28};
        int min,temp;
        for(int i = 0;i < intarray.length-1;i++){
            min = intarray[i];
            for(int j = i+1;j < intarray.length;j++){
                if(min > intarray[j]){
                    temp = min;
                    min = intarray[j];
                    intarray[i]= min;
                    intarray[j]= temp;
                }
            }
        }
        for(int i = 0;i < intarray.length;i++){
            System.out.println(intarray[i]);
        }
    }
}
