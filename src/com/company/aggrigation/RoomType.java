package com.company.aggrigation;

import java.util.List;

    public class RoomType {
        private String type;
        private List<Guest> name;

        public RoomType(String type, List<Guest> name) {
            this.type = type;
            this.name = name;
        }

        public List<Guest> getName() {
            return this.name;
        }
    }

