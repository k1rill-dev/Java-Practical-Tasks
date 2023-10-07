package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public abstract class Car {
    private String _autoMark;
    private String _carClass;
    private double _weight;
    private Driver _driver;
    private Engine _engine;

    public Car(String autoMark, String carClass, double weight, Driver driver, Engine engine) {
        _autoMark = autoMark;
        _carClass = carClass;
        _weight = weight;
        _driver = driver;
        _engine = engine;
    }

    public String get_autoMark() {
        return _autoMark;
    }

    public void set_autoMark(String autoMark) {
        _autoMark = autoMark;
    }

    public String get_carClass() {
        return _carClass;
    }

    public void set_carClass(String carClass) {
        _carClass = carClass;
    }

    public double get_weight() {
        return _weight;
    }

    public void set_weight(double weight) {
        _weight = weight;
    }

    public Driver get_driver() {
        return _driver;
    }

    public void set_driver(Driver driver) {
        _driver = driver;
    }

    public Engine get_engine() {
        return _engine;
    }

    public void set_engine(Engine engine) {
        _engine = engine;
    }

    public void start(){
        System.out.println("START");
    }
    public void stop(){
        System.out.println("STOOPPPP");
    }
    public void turnLeft(){
        System.out.println("LEFTTTTTTT");
    }
    public void turnRight(){
        System.out.println("RIGHTTTTTT");
    }
}
