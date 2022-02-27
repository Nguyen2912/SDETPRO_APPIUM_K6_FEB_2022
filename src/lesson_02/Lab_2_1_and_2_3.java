package lesson_02;
import java.util.Scanner;
import java.text.DecimalFormat;
/* Lab2.1
    Get input from user about height(m) and weight(kg) then calculate BMI
    Underweight = <18.5
    Normal weight = 18.5 – 24.9
    Overweight = 25–29.9
    Obesity = BMI of 30 or greater
    BMI = weight / (height x 2)
    Lab2.3: Lab 2.1 + Suggest user to increase/decrease weight
     */
public class Lab_2_1_and_2_3 {

    public static void main(String[] args){
        float bmi;
        double w1;
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Height(m): ");
        float height = scanner.nextFloat();
        System.out.println("Please enter Weight(Kg): ");
        float weight = scanner.nextFloat();
        bmi = weight / (height*2);
        w1 = 18.5*(height*2);

        if(bmi < 18.5){
            System.out.println("Underweight with IMB "+ decimalFormat.format(bmi));
            System.out.println("Need to increase "+ decimalFormat.format(w1 - weight)+" Kg");
        }
        else if(bmi < 24.9){
            System.out.println("Normal weight with IMB "+ decimalFormat.format(bmi));
        }
        else if(bmi < 29.9){
            System.out.println("Overweight with IMB "+ decimalFormat.format(bmi));
            System.out.println("Need to decrease "+ decimalFormat.format(weight-w1)+" Kg");
        }
        else{
            System.out.println("Obesity with IMB "+ decimalFormat.format(bmi));
            System.out.println("Need to decrease "+ decimalFormat.format(weight-w1)+"Kg");
        }

    }
}
