package Lesson_06;
/*
LAB 6.3
String myStr = "100 minutes";
NOT using REGEX, extract digit character from that String
Expected output: "100".
EX: "12345nabc678" -> "12345678"
 */
public class Lab_6_3 {
    public static void main(String[] args){
        String myStr = "12345nabc678";
        String newtring = "";
        char [] passwordCharacter = myStr.toCharArray();
        for(char character:passwordCharacter){
            if(character == '0'|| character == '1'|| character == '2'|| character == '3'||character == '4'
            || character == '5'||character == '6'|| character == '7'|| character == '8'|| character == '9'){
                newtring = newtring + character;
            }
        }
        System.out.println(newtring);
    }
}
