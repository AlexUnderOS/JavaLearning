package sources.UpcastingDowncasting;

import sources.Polymorphism.Animal;

public class UpDown_casting {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Upcasting
        Animal animal = dog;


        //Downcasting
        Dog dog2 = (Dog)animal;

        dog.bark();

/*      Animal animal1 = new Animal();
        Dog dog3 = (Dog) animal1;
        dog3.bark();    //ERROR
*/
    }
}
