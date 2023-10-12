package org.example.Pet_animal;

public class Cat extends Pet {

    public Cat(int id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate, thoroughbred);
    }

    public static void Comands(){
        System.out.println("Животное выполняет команды:");
    }
}
