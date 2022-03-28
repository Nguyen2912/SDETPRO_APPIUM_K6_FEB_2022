package lesson_09;
import java.util.ArrayList;
import java.util.List;
/*
Racing animal with builder design pattern (adding attribute flyable)
Eagle, Falcon, Tiger, Snake....
Animal tiger = new Animal.Builder().whithWings(false).....build();
Animal falcon = new Animal.Builder().whithWings(true).....build();
 */
public class TestAnimalBuilder {
    public static void main(String[] args){
        animalWithBuilder.Builder horse = new animalWithBuilder.Builder();
        horse.Withwings(false);
        horse.withMaxspeed(75);
        horse.withName("Horse");
        animalWithBuilder animalWithBuilder_horse = horse.build();

        animalWithBuilder.Builder tiger = new animalWithBuilder.Builder();
        tiger.Withwings(false);
        tiger.withMaxspeed(100);
        tiger.withName("Tiger");
        animalWithBuilder animalWithBuilder_tiger = tiger.build();

        animalWithBuilder.Builder dog = new animalWithBuilder.Builder();
        dog.Withwings(false);
        dog.withMaxspeed(60);
        dog.withName("Dog");
        animalWithBuilder animalWithBuilder_dog = dog.build();

        animalWithBuilder.Builder hawk = new animalWithBuilder.Builder();
        hawk.Withwings(true);
        hawk.withMaxspeed(80);
        hawk.withName("Hawk");
        animalWithBuilder animalWithBuilder_hawk = hawk.build();

        animalWithBuilder.Builder eagle = new animalWithBuilder.Builder();
        eagle.Withwings(true);
        eagle.withMaxspeed(75);
        eagle.withName("Eagle");
        animalWithBuilder animalWithBuilder_eagle = eagle.build();

        List<animalWithBuilder> animalbuilderList = new ArrayList<>();
        animalbuilderList.add(animalWithBuilder_horse);
        animalbuilderList.add(animalWithBuilder_tiger);
        animalbuilderList.add(animalWithBuilder_dog);
        animalbuilderList.add(animalWithBuilder_hawk);
        animalbuilderList.add(animalWithBuilder_eagle);


        List<animalWithBuilder> competed_animal_list = new ArrayList<>();
        for (animalWithBuilder list:animalbuilderList){
            if(!(list.isWithwings())){
                competed_animal_list.add(list);
            }
        }

        int max = competed_animal_list.get(0).getSpeed();
        String winner = "Horse";
        for (animalWithBuilder list_animal : competed_animal_list){
            if(max < list_animal.getSpeed()){
                max = list_animal.getSpeed();
                winner = list_animal.getName();
            }
        }

        System.out.println("Winner is: " + winner);
    }
}
