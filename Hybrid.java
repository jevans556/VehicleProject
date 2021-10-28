//package com.company;

public class Hybrid extends ElectricVehicle {
    protected double tankSize;
    protected double MPG;

    public Hybrid(String name, String color, double cost, int numberOfSeats, int horsePower,
                  double batterySize, double milesPerCharge, int tankSize, double MPG) {
        super(name, color, cost, numberOfSeats, horsePower, batterySize, milesPerCharge);
        setMPG(MPG);
        setTankSize(tankSize);

    }

    public double getTankSize() {
        return tankSize;
    }

    public double getMPG() {
        return MPG;
    }

    public void setTankSize(int tankSize) {
        if((tankSize > 0) && (tankSize < 100)) {
            this.tankSize = tankSize;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.tankSize = 15;
        }
    }

    public void setMPG(double MPG) {
        if((MPG > 0) && (MPG < 200)) {
            this.MPG = MPG;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.MPG = 45;
        }
    }

    @Override
    public void CalculateMilesPerTrip() {
        double tripMiles = milesPerCharge + (MPG * tankSize);
        System.out.println(name + " Can go " + tripMiles + " miles on a single tank of gas");

    }

    @Override
    public void CalculateCostToOwn() {
        double totalCost;
        totalCost = (avgYearsOwned * avgInsuranceCost ) + (MPG * tankSize * gasCost) + cost + avgMaintenanceCost;
        System.out.println(name + " really cost $" + totalCost +" to own");
    }

    @Override
    public String toString() {
        return super.toString() + ", tankSize: " + tankSize + ", miles per gallon: " + MPG;
    }
}
