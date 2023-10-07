package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private double _maxSpeed;
    public SportCar(String autoMark, String carClass, double weight, Driver driver, Engine engine, double maxSpeed) {
        super(autoMark, carClass, weight, driver, engine);
        _maxSpeed = maxSpeed;
    }

    public double get_maxSpeed() {
        return _maxSpeed;
    }

    public void set_maxSpeed(double maxSpeed) {
        _maxSpeed = maxSpeed;
    }
}
