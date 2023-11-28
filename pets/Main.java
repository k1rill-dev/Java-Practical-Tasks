package pets;

import java.util.HashMap;

public class Main {
//    1 Создайте класс Pet и его наследников Cat, Dog, Parrot.
//    2 Создайте отображение (Map) из домашних животных, где в качестве ключа
//    выступает имя животного, а в качестве значения класс Pet.
//    3 Добавьте в отображение разных животных. Создайте метод выводящий на
//    консоль все ключи отображения.
    public static void main(String[] args) {
        Pet cat = new Cat("Cassey", 4);
        Pet dog = new Cat("Rocky", 2);
        Pet parrot = new Cat("Kesha", 1);

        HashMap<String, Pet> pets = new HashMap<>();
        pets.put(cat.geName(), cat);
        pets.put(dog.geName(), dog);
        pets.put(parrot.geName(), parrot);

        for (String key:
             pets.keySet()) {
            System.out.println(key);
        }
        for (Pet pet:
                pets.values()) {
            System.out.println(pet);
        }
    }
}
