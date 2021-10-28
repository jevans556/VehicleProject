//package com.company;

public class ElectricVehicle extends Vehicle {
    protected double batterySize;
    protected double milesPerCharge;

    public ElectricVehicle(String name, String color, double cost, int numberOfSeats,
                           int horsePower, double batterySize, double milesPerCharge) {
        super(name, color, cost, numberOfSeats, horsePower);
      setBatterySize(batterySize);
      setMilesPerCharge(milesPerCharge);
    }

    public double getBatterySize() {
        return batterySize;
    }

    public double getMilesPerCharge() {
        return milesPerCharge;
    }

    public void setBatterySize(double batterySize) {
        if((batterySize > 0) && (batterySize < 200)) {
            this.batterySize = batterySize;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.batterySize = 20;
        }

    }

    public void setMilesPerCharge(double milesPerCharge) {
        if((milesPerCharge > 0) && (milesPerCharge < 300)) {
            this.milesPerCharge = milesPerCharge;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.milesPerCharge = 100;
        }
    }

    @Override
    public void CalculateMilesPerTrip() {
        System.out.println(name + " can go " + milesPerCharge + " on a single charge");
    }


    @Override
    public String toString() {
        return super.toString() + ", battery size: " + batterySize+ ", miles per charge: " + milesPerCharge +" miles";
    }
}
