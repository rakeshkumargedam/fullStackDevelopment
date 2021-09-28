package com.company.aggrigation;

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
        Iterator var3 = this.roomType.iterator();

        while(var3.hasNext()) {
            RoomType room = (RoomType)var3.next();
            List<Guest> name = room.getName();

            for(Iterator var5 = name.iterator();

                var5.hasNext(); ++total) {
                Guest g = (Guest)var5.next();
            }
        }

        return total;
    }
}

