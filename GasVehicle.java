//package com.company;

public class GasVehicle extends Vehicle {
    private double tankSize;
    private double MPG;

    public GasVehicle(String name, String color, double cost, int numberOfSeats, int horsePower,
                      double tankSize, double MPG) {
        super(name, color, cost, numberOfSeats, horsePower);
        setMPG(MPG);
        setTankSize(tankSize);
    }

    public double getTankSize() {
        return tankSize;
    }

    public double getMPG() {
        return MPG;
    }

    public void setTankSize(double tankSize) {
        if((tankSize > 0) && (tankSize < 200)) {
            this.tankSize = tankSize;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.tankSize = 15;
        }
    }

    public void setMPG(double MPG) {
        if((MPG > 0) && (MPG < 300)) {
            this.MPG = MPG;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.MPG = 30;
        }
    }

    public void CalculateMilesPerTrip() {
        double milesPerTank = MPG * tankSize;
         System.out.println(this.name + " Can go " + milesPerTank + " miles on one tank of gas");


    }

    @Override
    public void CalculateCostToOwn() {
        double totalCost;
        totalCost = (avgYearsOwned * avgInsuranceCost) + (MPG * tankSize * gasCost) + cost + avgMaintenanceCost;
        System.out.println(name + " really cost $" + totalCost +" to own");
    }

    public String toString(){
         return super.toString() + ", tank size: " + tankSize + ", miles per gallon:  "  + MPG;
    }
}
