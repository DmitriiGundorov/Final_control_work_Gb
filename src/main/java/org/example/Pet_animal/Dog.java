package org.example.Pet_animal;

public class Dog extends Pet{

    public Dog(int id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate, thoroughbred);

    }

    public static void Comands(){
        System.out.println("Животное выполняет команды:");
    }
}
