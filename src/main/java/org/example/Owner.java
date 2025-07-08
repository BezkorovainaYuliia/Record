package org.example;

import java.util.List;

public record Owner(String nameOwner, int age, String address, List<Animal> animals) {
    public Owner withNewAnimal(Animal animal) {
        if (animal == null) throw new IllegalArgumentException("animal is null");
        animals.add(animal);
        return new Owner(nameOwner, age, address, animals);
    }

    public Owner withoutAnimal(Animal animal) {
        if (animal == null) throw new IllegalArgumentException("animal is null");
        animals.remove(animal);
        return new Owner(nameOwner, age, address, animals);
    }

    public Owner withNewAddress(String newAddress) {
        if (newAddress == null) throw new IllegalArgumentException("newAddress is null");
        return new Owner(nameOwner, age, newAddress, animals);
    }
}
