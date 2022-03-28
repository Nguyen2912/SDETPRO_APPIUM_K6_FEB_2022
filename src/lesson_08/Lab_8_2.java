package lesson_08;

import java.util.ArrayList;
import java.util.List;

/*
Racing animal simple version*
Horse: Max 75 km/h
Tiger: Max 100 Km/h
Dog: Max 60 KM/h*

Create an Animal class with a method speed() which return a random speeds
Create 3 objects for those 3 animal type
Run and see which animal is winner for racing
Bonus: Default name with Class variable
Format: Winner is <Animal name>, with speed: <speed>
Hints:* * Class name can get from: object.getClass().getSimpleName();
int randomSpeed = new SecureRandom().nextInt(50);
 */
public class Lab_8_2 {
    public static void main(String[] args){
        animal horse = new Horse();
        animal tiger = new Tiger();
        animal dog = new Dog();

        List<animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);
        int max = animalList.get(0).getSpeed();
        String Winner = "Horse";
        for(animal l:animalList){
            if(max < l.getSpeed()){
                max = l.getSpeed();
                Winner = l.getClass().getSimpleName();
            }
        }
        System.out.println("Winner is: " + Winner);
    }
}
