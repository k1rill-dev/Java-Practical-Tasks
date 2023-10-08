package com.animals;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Бобик");
        Animal cat = new Cat("Кэт");
        Animal bear = new Bear("Алеша");
        Vet vet = new Vet();
        Animal[] animals = {
                dog, cat, bear
        };
        for (Animal animal : animals) {
            vet.treetAnimal(animal);
        }
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }
    }
}
