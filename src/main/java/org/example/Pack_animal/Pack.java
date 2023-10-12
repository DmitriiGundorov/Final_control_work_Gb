package org.example.Pack_animal;

import org.example.Animal;

public class Pack extends Animal implements Employable {
    private int loadCapacity;

    public Pack(int id, String name, String birthdate, int loadCapacity) {
        super(id, name, birthdate);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity(){
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void employ() {
    }

    @Override
    public String toString() {
        return String.format("Number id: %d\nName: %s\nBirthday: %s\nLoad capacity, kg: %s\n", getId(), getName(), getBirthdate(), this.loadCapacity);
    }

}
