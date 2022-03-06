package com.itacademy.java.oop.basics.task2;

public enum Bike {
    MOUNTAIN("MOUNTAIN BIKE"),
    ROAD("ROAD BIKE");

    private final String desc;

    Bike(String description){
        desc = description;
    }

    public String getDesc(){
        return desc;
    }


}
