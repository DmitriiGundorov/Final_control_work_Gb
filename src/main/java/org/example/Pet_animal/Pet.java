package org.example.Pet_animal;

import org.example.Animal;

public class Pet extends Animal {
    boolean thoroughbred;

    public Pet(int id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate);
        this.thoroughbred = thoroughbred;
    }

    public boolean getThoroughbred() {
        return thoroughbred;
    }

    public void setThoroughbred(boolean thoroughbred) {
        this.thoroughbred = thoroughbred;
    }

    @Override
    public String toString() {
        return String.format("Number id: %d\nName: %s\nBirthday: %s\nPedigree: %s\n",
               getId(), getName(), getBirthdate(), this.thoroughbred);
    }
}