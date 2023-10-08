package com.animals;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeNoise() {
        System.out.println("ну типо кот опять валерьянки напился");
    }

    @Override
    void eat() {
        System.out.println("ммм вкусный корм для котов/кошек");
    }

    @Override
    String getDescription() {
        return "я небинарная кот/кошка/кошк";
    }
}
