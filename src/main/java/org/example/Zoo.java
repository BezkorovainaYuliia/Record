package org.example;

import java.util.List;

public record Zoo(List<Animal> animals) {

    private final static String NAME_ZOO = "Hagen Tier Hamburg";

    public int calculateFood() {
        int food = 0;
        for (Animal animal : animals) {
            System.out.println(animal.name() + " eats " + animal.species().foodProDay() + " gram of food");
            food += animal.species().foodProDay();
        }
        return food;
    }

    public void getNameZoo() {
        System.out.println("Welkom to " + NAME_ZOO);
    }

    public Zoo withAnimal(Animal newAnimal){
        if (newAnimal == null) throw new IllegalArgumentException("animal cannot be null");
        animals.add(newAnimal);
        return new Zoo(animals);
    }
}
