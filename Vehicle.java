//package com.company;

public abstract class Vehicle implements CostToOwn{
    protected String name;
    protected String color;
    protected double cost;
    protected int numberOfSeats;
    protected int horsePower;

    //Base Constructor. Each class has its own constructor which also calls this one using the super keyword
    // and then adds to it. The constructor also calls the setter methods to make sure that no invalid
    //parameters are passed

    public Vehicle(String name, String color, double cost, int numberOfSeats, int horsePower) {
       setName(name);
       setColor(color);
       setCost(cost);
       setNumberOfSeats(numberOfSeats);
       setHorsePower(horsePower);
    }

    public String getName() {  // getters
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setName(String name) { //setters
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // all setters that have number inputs check to make sure that the numbers are in proper range.
    // If an invalid range is entered, then an average input is used instead
    public void setCost(double cost) {
        if(cost > 0) {
            this.cost = cost;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.cost = 18000.00;
        }
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if((numberOfSeats > 0 ) && (numberOfSeats < 30)) {
            this.numberOfSeats = numberOfSeats;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.numberOfSeats = 5;
        }
    }

    public void setHorsePower(int horsePower) {
        if((horsePower > 0) && (horsePower < 4000)) {
            this.horsePower = horsePower;
        }
        else{
            System.out.println("That is an invalid range. Using the average as the default");
            this.horsePower = 150;
        }
    }
    // abstract method to calculate the number of miles a car can go before it has to be refilled or the
    //battery has to be recharged, the method differs on whether or not it is a gas car or an electric or
    //hybrid class that is implementing the method

    public abstract void CalculateMilesPerTrip();

    //base method implemented by the interface. Gas and hybrid cars have their own implementations
    // and the electric car class has no implementation of its own so that class will call this method
    public void CalculateCostToOwn(){
        double totalCost;
        totalCost = (avgYearsOwned * avgInsuranceCost) + cost + avgMaintenanceCost;
        System.out.println(name + " really cost $" + totalCost +" to own");
    }

    @Override
    //over ridden base toSting and equals method. Equals method compares the names of two classes
    //Each class has its own toString method which adds on to this base method

    public String toString(){
        return "Name: " + name + ", color: " + color + ", cost: $" + cost + ", number of seats: "
                + numberOfSeats + ", horse power: " + horsePower + " hp";
    }

    public boolean equals(Vehicle v){
        if(this.name == v.name){
            return true;
        }
        else {
            return false;
        }
    }


}
