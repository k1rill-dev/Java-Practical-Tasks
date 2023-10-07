package com.booking.models;

public class Client {
    private String _name;
    private String _surname;
    private String _phoneNumber;
    private String _email;
    private Bill _bill;

    public Client(String name, String surname, String phoneNumber, String email, Bill bill) {
        _name = name;
        _surname = surname;
        _phoneNumber = phoneNumber;
        _email = email;
        _bill = bill;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public String get_surname() {
        return _surname;
    }

    public void set_surname(String surname) {
        _surname = surname;
    }

    public String get_phoneNumber() {
        return _phoneNumber;
    }

    public void set_phoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String email) {
        _email = email;
    }

    public Bill get_bill() {
        return _bill;
    }

    public void set_bill(Bill bill) {
        _bill = bill;
    }
}
