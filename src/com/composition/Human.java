package com.composition;

import com.sun.org.apache.bcel.internal.generic.NEW;

    public class Human {
        private  Heart heart;

        public Human() {

            this.heart = new Heart();
            heart.setFunction(" Pumping oxygenated blood to the other body parts ");
            heart.setAge(50);
            heart.setHeartRate(90);
            heart.setGender("MALE");
        }
        public  int getHeartRate()
        {
            return heart.getHeartRate();
        }
        public String getGender()
        {
            return heart.getGender();

        }

        public String getFunction()
        {
            return heart.getFunction();
        }

        public  int getAge()
        {
            return heart.getAge();
        }
    }