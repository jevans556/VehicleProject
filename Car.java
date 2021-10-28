//package com.company;

public class Car extends GasVehicle {
    protected int trunkSpace;

    public Car(String name, String color, double cost, int numberOfSeats, int horsePower, double tankSize,
               double MPG, int trunkSpace) {
        super(name, color, cost, numberOfSeats, horsePower, tankSize, MPG);
        setTrunkSpace(trunkSpace);
    }

    public int getTrunkSpace() {
        return trunkSpace;
    }

    public void setTrunkSpace(int trunkSpace) {
        if((trunkSpace > 0) && (trunkSpace < 30)) {
            this.trunkSpace = trunkSpace;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.trunkSpace = 5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", trunk space: " + trunkSpace + " sq ft";
    }
}
