package com.company.aggrigation;

import com.letchlab.training.oops.inheritance.aggregation.Student;

import java.util.Iterator;
import java.util.List;

public class Hotel {
    private String hotelName;
    private List<RoomType> roomType;

    public Hotel(String hotelNames, List<RoomType> roomType) {
        this.hotelName = hotelNames;
        this.roomType = roomType;
    }

    public int getTotalGuestInHotel() {
        int total = 0;
        List<Guest> name;
        for (RoomType room : roomType) {
            name = room.getName();

            for (Guest G : name) {
                total++;
            }

        }
        return total;
    }
}

