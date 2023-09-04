package sources.UpcastingDowncasting;

import sources.Polymorphism.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }

    public void bark(){
        System.out.println("Bark!");
    }
}
