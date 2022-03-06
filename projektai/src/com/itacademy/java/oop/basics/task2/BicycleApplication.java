package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle mbike = new MountainBike();
        mbike.applyBrakes(15);

        mbike.speedUp(95);

        mbike.getIncrement();





        try {
            mbike.changeGear(20, 1);
        } catch (ToFastException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(" ");

        Bicycle rbike = new RoadBike();

        try {
            rbike.applyBrakes(7);
        } catch (ToFastException e) {
            System.out.println(e.getMessage());
        }

        try {
            rbike.speedUp(49);
        } catch (ToFastException e) {
            System.out.println(e.getMessage());
        }

        try {
            rbike.changeGear(10, 2);
        } catch (ToFastException e) {
            System.out.println(e.getMessage());
        }


        /* nesu tikras kaip istikruju padaryti sita taska su enum*/
        if(mbike.getIncrement()>rbike.getIncrement()){
            System.out.println("Winner is " + Bike.MOUNTAIN);
        }
        else System.out.println("Winner is " + Bike.ROAD);





    }
}
