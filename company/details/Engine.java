package com.company.details;

public class Engine {
    private double _power;
    private String _manufacturer;

    public Engine(double power, String manufacturer) {
        _power = power;
        _manufacturer = manufacturer;
    }

    public double get_power() {
        return _power;
    }

    public void set_power(double power) {
        _power = power;
    }

    public String get_manufacturer() {
        return _manufacturer;
    }

    public void set_manufacturer(String manufacturer) {
        _manufacturer = manufacturer;
    }
}
