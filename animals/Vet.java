package com.animals;

public class Vet {
    public void treetAnimal(Animal animal){
        System.out.println("Пришел " + animal.getName() + " и вот его описание: " + animal.getDescription());
    }
}
