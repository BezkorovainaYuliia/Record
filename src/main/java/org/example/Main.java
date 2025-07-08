package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Species foodMiura = new Species("Josera",200);
    Animal miura = new Animal(1,"Miura", "Cat", 5, foodMiura);


    Species foodBeily = new Species("Josera Dogs",500);
    Animal beily = new Animal(2,"Beily", "Dog", 2,  foodBeily);
    Species foodBarsik = new Species("MixCat Oldcats",300);
    Animal barsik = new Animal(3,"Barsik", "Cat", 8, foodBarsik);
    Species foodMolly = new Species("Josera Dogs",430);
    Animal molly = new Animal(4,"Molly", "Dog", 12, foodMolly);
    Species foodDexter = new Species("Josera OldCats",250);
    Animal dexter = new Animal(5,"Dexter", "Cat", 15, foodDexter);
    Species foodTom = new Species("MixCat",200);
    Animal tom = new Animal(6,"Tom", "Cat", 10, foodTom);
    System.out.println(miura.equals(beily));
        System.out.println(miura);
        System.out.println(beily);

        Set<Animal> setAnimals = new HashSet<>();
        setAnimals.add(miura);
        setAnimals.add(beily);
        System.out.println(setAnimals);
        System.out.println("---------");
        miura = miura.withAge(2);
        System.out.println(miura);


        List<Animal> cats = new ArrayList<>();
        cats.add(dexter);
        cats.add(tom);
        cats.add(barsik);
        Owner sonja = new Owner("Sonja", 45, "Bardowick", cats);
        System.out.println("Owner N1");
        System.out.println(sonja);
        List<Animal> cat = new ArrayList<>();
        cat.add(miura);
        Owner yuliia = new Owner("Yulia", 40, "Lüneburg", cat);
        System.out.println("Owner N2");
        System.out.println(yuliia);
        List<Animal> dogs = new ArrayList<>();
        dogs.add(beily);
        dogs.add(molly);
        Owner robert = new Owner("Robert", 42, "Rottorf (Winsen Luhe)", dogs);
        System.out.println("Owner N3");
        System.out.println(robert);

        System.out.println("---------");
        foodMiura = foodMolly.withFoodProDay(180);
        System.out.println(yuliia);

        miura = miura.withFoodProDay(foodMiura);
        System.out.println(yuliia);

        cat.clear();
        cat.add(miura);
        yuliia = new Owner("Yulia", 45, "Bardowick", cat);
        System.out.println(yuliia);

        System.out.println("------------------");
         List<Animal> listAnimal = new ArrayList<>();
         listAnimal.add(beily);
         listAnimal.add(tom);
         listAnimal.add(dexter);
         listAnimal.add(barsik);
         listAnimal.add(molly);
         listAnimal.add(miura);

         Zoo zoo = new Zoo(listAnimal);
        zoo.getNameZoo();
        System.out.println("All animals in Zoo need " +
                zoo.calculateFood() + " gramm food");

    }
}