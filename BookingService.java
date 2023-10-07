package com.booking.businessLogic;

import com.booking.models.Bill;
import com.booking.models.Client;
import com.booking.models.Hotel;
import com.booking.models.Room;

public class BookingService {
    private static boolean _checkFreeRooms(Room[] rooms){
        for (Room room: rooms) {
            if(room.get_isFree()) {
                return true;
            }
            else return false;
        }
        return false;
    }
    public static void booking(Client client, Hotel hotel, int countPeople){
        if(_checkFreeRooms(hotel.get_rooms())){
            for (Room room: hotel.get_rooms()) {
                if(room.get_countPeople() == countPeople && room.get_isFree()){
                    System.out.println("Комната найдена");
                    if(client.get_bill().get_amount() >= room.get_price()){
                        Bill clientBalance = client.get_bill();
                        clientBalance.set_amount(clientBalance.get_amount() - room.get_price());
                        System.out.println("Ваш баланс - " + clientBalance.get_amount());
                    }
                    else{
                        System.out.println("У вас нет деняк");
                        return;
                    }
                }
                else{
                    System.out.println("Таких комнат нет");
                    return;
                }
            }
        }
        else{
            System.out.println("Нет свободных комнат");
            return;
        }

    }
}
