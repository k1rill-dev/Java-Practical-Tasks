package com.booking.models;

public class Hotel {
    private String _name;
    private Room[] _rooms;

    public Hotel(String name, Room[] rooms) {
        _name = name;
        _rooms = rooms;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        _name = name;
    }

    public Room[] get_rooms() {
        return _rooms;
    }

    public void set_rooms(Room[] rooms) {
        _rooms = rooms;
    }

}
