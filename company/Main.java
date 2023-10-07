package com.company;

import com.company.details.Engine;
import com.company.professions.Person;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Person vasya = new Person("Ivanov Vasya", 14);
        Person petya = new Person("Petkov Petr", 2);

        Engine ferrariEngine = new Engine(200, "Ferrari");
        Engine manEngine = new Engine(100, "MAN");

        Lorry man = new Lorry("MAN", "Lorry",2.5, vasya, manEngine, 200);
        SportCar ferrari = new SportCar("Ferrari", "Sport car", 2, petya, ferrariEngine, 344);
        
    }
}