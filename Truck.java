//package com.company;

public class Truck extends GasVehicle {
    double bedSize;

    public Truck(String name, String color, double cost, int numberOfSeats, int horsePower,
                 double tankSize, double MPG, double bedSize) {
        super(name, color, cost, numberOfSeats, horsePower, tankSize, MPG);
        setBedSize(bedSize);
    }

    public double getBedSize() {
        return bedSize;
    }

    public void setBedSize(double bedSize) {
        if((bedSize > 0) && (bedSize < 100)) {
            this.bedSize = bedSize;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.bedSize = 5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", bed size: " + bedSize + " ft";
    }
}
