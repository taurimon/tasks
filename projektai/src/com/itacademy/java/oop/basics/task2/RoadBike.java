package com.itacademy.java.oop.basics.task2;


public class RoadBike implements Bicycle{
    int gear;
    int speed;
    public int increment;

    @Override
    public void changeGear(int newGear, int change) {
        if(newGear>10 || newGear<0){
            throw new ToFastException("Gear value can't be lower than 0 and more than 10");
        }
        if(change!=1 && change!=2 && change!=-1 && change!=-2){
            int numbers[] = {-2,-1,1,2};

            int distance = Math.abs(numbers[0] - change);
            int idx = 0;
            for(int i = 1; i < numbers.length; i++){
                int cdistance = Math.abs(numbers[i] - change);
                if(cdistance < distance){
                    idx = i;
                    distance = cdistance;
                }
            }
            int theNumber = numbers[idx];

            throw new ToFastException("Value of " + change + " is not valid, try using " + theNumber);
        }

        if(change==1){
            newGear++;
            if(newGear>10){
                throw new ToFastException("Gear value can't be more than 10!");
            }
            System.out.println("Gear increased by 1, now it's gear is " + newGear);
        }
        if(change==-1){
            newGear--;
            if(newGear<0){
                throw new ToFastException("Gear value can't be lower than 0!");
            }
            System.out.println("Gear decreased by 1, now it's gear is " + newGear);
        }
        if(change==2){
            newGear=newGear+2;
            if(newGear>10){
                throw new ToFastException("Gear value can't be more than 10!");
            }
            System.out.println("Gear increased by 2, now it's gear is " + newGear);
        }
        if(change==-2){
            newGear=newGear-2;
            if(newGear<0){
                throw new ToFastException("Gear value can't be lower than 0!");
            }
            System.out.println("Gear decreased by 2, now it's gear is " + newGear);
        }

    }

    @Override
    public void speedUp(int increment) {
        if(increment < 0){
            throw new ToFastException("You can only apply speed using positive values");
        }
        if(increment == 50){
            System.out.println("The maximum speed was reached. Max speed is 50");
        } else if (increment > 50){
            System.out.println("Speed is too high, max speed is 50");
        } else System.out.println("Your speed now is " + increment);

        this.increment = increment;
    }

    public int getIncrement(){
        return increment;
    }

    @Override
    public void applyBrakes(int speed) {
        if(speed > 0){
            throw new ToFastException("You can only apply brakes using negative values");
        }
        System.out.println("Brake speed is " + Math.abs(speed));

    }
}
