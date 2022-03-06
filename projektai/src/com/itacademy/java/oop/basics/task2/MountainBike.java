package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    int gear;
    int speed;
    public int increment;

    @Override
    public void changeGear(int newGear, int change) {
        if(newGear==20 || newGear==0){
            throw new ToFastException("Gear value can't be lower than 0 and more than 20");
        }
        if(change!=1 && change!=0 && change!=-1){
            throw new ToFastException("Value of " + change + " is not valid, try using 1 or -1");
        }
        if(change==1){
            newGear++;
            System.out.println("Gear increased by 1, now it's gear is " + newGear);
        }
        if(change==-1){
            newGear--;
            System.out.println("Gear decreased by 1, now it's gear is " + newGear);
        }
    }

    @Override
    public void speedUp(int increment) {
        if(increment < 0){
            System.out.println("Try using positive numbers");
        }
        if(increment > 100) {
            System.out.println("Max limit reached (100), you can't increase speed anymore");

        } else {
            System.out.println("Your speed is " + increment);
        }

        this.increment = increment;
    }

    public int getIncrement(){
        return increment;
    }

    @Override
    public void applyBrakes(int speed) {
        if (speed < -10) {
            System.out.println("Value is too high, max braking speed is -10, your speed " + speed);
        }
        if (speed < 0 ){
            System.out.println("Braking speed cannot be negative, try using positive numbers");
        }
        System.out.println("All good, brake speed " + speed);
    }

}
