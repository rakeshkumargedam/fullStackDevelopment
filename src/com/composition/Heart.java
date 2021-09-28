package com.composition;

public class Heart {
    private String function;
        private int HeartRate;
        private  int age;
        private  String gender;

        public String getFunction() {
            return function;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        public int getHeartRate() {
            return HeartRate;
        }

        public void setHeartRate(int heartRate) {
            HeartRate = heartRate;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
}