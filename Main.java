package com.booking;

import com.booking.models.Bill;
import com.booking.models.Client;
import com.booking.models.Hotel;
import com.booking.models.Room;

public class Main {
    public static void main(String[] args) {
        Client kate = new Client(
                "Kate",
                "qwe",
                "+6574384911",
                "user@example.com",
                new Bill(10000));

        Client billy = new Client(
                "Billy",
                "Harrington",
                "+54029592940",
                "user1@example.com",
                new Bill(6000));

        Client lexa = new Client(
                "Aleksiy",
                "Kolka",
                "+6783464373",
                "user2@example.com",
                new Bill(50000));

        Room[] roomsRadisson = {
                new Room(2, 5000, true),
                new Room(1, 2500, true),
                new Room(3, 15000, false),
        };
        Hotel radisson = new Hotel("Radisson",roomsRadisson);

        Room[] roomsProvince = {
                new Room(3, 10000, true),
                new Room(1, 1000, true),
                new Room(4, 12500, true),
        };
        Hotel province = new Hotel("Province",roomsProvince);


    }
}