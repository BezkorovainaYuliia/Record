package org.example;
/*
Erstelle ein neues Projekt in IntelliJ und lege den Grundstein für das Java Record Zoo Projekt.

Erstelle einen Java Record “Animal”,
der Eigenschaften für ID, Name, Spezies und Alter haben soll. Wähle passende Feldnamen.
 */
public record Animal(int id, String name, String species, int age, Species foodProDay) {
    public Animal withSpecies(String species) {
        if (species == null) throw new IllegalArgumentException("species cannot be null");
        return new Animal(id, name, species, age, foodProDay);
    }

    public Animal withAge(int age) {
        if (age < 0) throw new IllegalArgumentException("age cannot be negative");
        return new Animal(id, name, species, age, foodProDay);
    }
    public Animal withFoodProDay(Species newFoodProDay) {
        if (newFoodProDay == null) throw new IllegalArgumentException("foodProDay cannot be null ");
        return new Animal(id,name,species,age, newFoodProDay);
    }
}
