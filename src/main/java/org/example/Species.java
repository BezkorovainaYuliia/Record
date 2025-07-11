package org.example;

public record Species(String typeOfAnimal, int foodProDay) {
    public Species withFoodProDay(int foodProDay) {
        if (foodProDay < 0) throw new IllegalArgumentException("foodProDay is negative");
        return new Species(typeOfAnimal,foodProDay);
    }
}
