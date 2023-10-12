package org.example;

import org.example.Pack_animal.*;
import org.example.Pet_animal.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Farm<Animal> animalFarm = new Farm<>();

        animalFarm.add(new Dog(1, "Bella", "2021-01-01", false));
        animalFarm.add(new Dog(2, "Rex", "2019-09-10", false));
        animalFarm.add(new Cat(3, "Badger", "2010-09-01", true));
        animalFarm.add(new Cat(4, "Leopold", "2016-05-17", true));
        animalFarm.add(new Hamster(5, "Jim", "2022-11-28", false));
        animalFarm.add(new Hamster(6, "Mike", "2021-04-19", false));

        animalFarm.add(new Horse(7, "Diane", "2007-08-16", 120));
        animalFarm.add(new Horse(8, "Yakhont", "2017-03-24", 110));
        animalFarm.add(new Camel(9, "Lancelot", "2012-05-05", 280));
        animalFarm.add(new Camel(10, "Agatha", "2017-03-18", 240));
        animalFarm.add(new Donkey(11, "Robingud", "2016-06-17", 70));
        animalFarm.add(new Donkey(12, "Dobrynya", "2013-02-28", 90));


        try {
            while (true) {

                Menu.showMainMenu();
                try (
                        Scanner sc = new Scanner(System.in)) {
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            Farm.printAnimals();
                            break;
                        case 2:
                            Menu.printOnlyThisClass(animalFarm);
                            break;
                        case 3:
                            Menu.Comands();
                            break;
                        case 4:
                            Menu.newComand();
                            break;
                        case 5:
                            Menu.newAnimal();
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect input! Repeat the input:");
        }
    }
}
