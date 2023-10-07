package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double _maxWeightOnBoard;
    public Lorry(String autoMark, String carClass, double weight, Driver driver, Engine engine,double maxWeightOnBoard) {
        super(autoMark, carClass, weight, driver, engine);
        _maxWeightOnBoard = maxWeightOnBoard;
    }

    public double get_maxWeightOnBoard() {
        return _maxWeightOnBoard;
    }

    public void set_maxWeightOnBoard(double maxWeightOnBoard) {
        _maxWeightOnBoard = maxWeightOnBoard;
    }
}
