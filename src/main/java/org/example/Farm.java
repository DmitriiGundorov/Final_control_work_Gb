package org.example;

import java.util.*;

import org.example.Pack_animal.*;
import org.example.Pet_animal.*;

public class Farm<T> {
    private static List<Animal> animals;

    public Farm() {
        animals = new ArrayList();
    }

    public boolean add(Animal animal) {
        return animals.add(animal);
    }

    public Farm<Animal> release(Farm<Animal> animalFarm) {
        if (animals.contains(animalFarm)) {
            animals.remove(animalFarm);
            return animalFarm;
        }
        return null;
    }

    public static <A> Farm<A> create() {
        return new Farm<A>();
    }

    public static <A> boolean adopt(Farm<A> farm, Animal animal) {
        return farm.add(animal);
    }

    public void printOnlyThisClass(int animalClass) {
        switch (animalClass) {
            case 1:
                printCollection(Pet.class);
                break;
            case 2:
                printCollection(Pack.class);
                break;
        }
    }

    public void printCollection(Class<?> choiseClass) {
        for (Animal animal : animals) {
            if (choiseClass.isInstance(animal)) {
                System.out.println(animal.toString());
            }
        }
    }

    public static void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}