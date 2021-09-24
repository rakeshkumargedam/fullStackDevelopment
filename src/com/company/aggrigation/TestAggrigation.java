package com.company.aggrigation;

import java.util.ArrayList;
import java.util.List;

public class TestAggrigation {
    public TestAggrigation() {
    }

    public static void main(String[] args) {
        Guest G1 = new Guest("rashmi", 453, "single", "maharastrian food");
        Guest G2 = new Guest("sahil", 555, "Quad", "northindian food");
        Guest G3 = new Guest("amit", 666, "single", "seafood food");
        Guest G4 = new Guest("vinod", 444, "Quad", "mongolian food");
        List<Guest> GuestsSingle = new ArrayList();
        GuestsSingle.add(G1);
        GuestsSingle.add(G3);
        List<Guest> GuestsQuad = new ArrayList();
        GuestsSingle.add(G2);
        GuestsSingle.add(G4);
        RoomType R1 = new RoomType("single", GuestsSingle);
        RoomType R2 = new RoomType("Quad", GuestsQuad);
        List<RoomType> roomTypes = new ArrayList();
        roomTypes.add(R1);
        roomTypes.add(R2);
        Hotel hotel = new Hotel("Grand Extend", roomTypes);
        System.out.println("total Guest in hotel on 21-09-2021 Tuesday:    ");
        System.out.println(hotel.getTotalGuestInHotel());
    }
}

