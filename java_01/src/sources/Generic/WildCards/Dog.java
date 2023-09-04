package sources.Generic.WildCards;

import sources.Polymorphism.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating!");
    }
}
