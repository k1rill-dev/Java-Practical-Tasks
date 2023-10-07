package com.booking.models;

public class Bill {
    private int _amount;

    public Bill(int amount) {
        _amount = amount;
    }

    public int get_amount() {
        return _amount;
    }

    public void set_amount(int amount) {
        _amount = amount;
    }

}
