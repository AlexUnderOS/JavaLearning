package sources.Generic.WildCards;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        //test(listOfDogs);
                         // Animal                ERROR
                         // ? extends Animal      Ok?
        //idk
    }
    private static void test(List<Animal/*? extends Animal*/> list){
        for(Animal animal : list){
            animal.eat();
        }
    }
}
