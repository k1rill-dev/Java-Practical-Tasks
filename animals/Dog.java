package com.animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("woof");
    }

    @Override
    public void eat() {
        System.out.println("ммм вкусный корм для собак");
    }

    @Override
    public String getDescription() {
        return "я собака ты собака я собака ты собака я собака ты собака я собака ты собака я собака ты собака я собака ты собака я собака ты собака я собака ты собака я собака ты собака ";
    }
}
