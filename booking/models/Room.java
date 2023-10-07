package com.booking.models;

public class Room {
    private int _countPeople;
    private int _price;
    private boolean _isFree;

    public Room(int countPeople, int price, boolean isFree) {
        _countPeople = countPeople;
        _price = price;
        _isFree = isFree;
    }

    public int get_countPeople() {
        return _countPeople;
    }

    public void set_countPeople(int countPeople) {
        _countPeople = countPeople;
    }

    public int get_price() {
        return _price;
    }

    public void set_price(int price) {
        _price = price;
    }

    public boolean get_isFree() {
        return _isFree;
    }

    public void set_isFree(boolean isFree) {
        _isFree = isFree;
    }
}
