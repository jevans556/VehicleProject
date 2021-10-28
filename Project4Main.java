//package com.company;
import java.util.ArrayList;

public class Project4Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        GasVehicle gv1 = new GasVehicle("Honda","Grey",18000,5,150,
                10,30);
        ElectricVehicle e1 = new ElectricVehicle("Leaf","Blue", 20000, 5,
                100,30,150);
        Truck t1 = new Truck("Ford F150", "yellow", 30000, 2, 300,
                20,10, 8);
        Car c1 = new Car("Mazda 3", "red", 22000, 5,180,
                15,22,8);
        Hybrid hyb1 = new Hybrid("Prius","blue",28000,5,130,
                60,45, 12,45);

        vehicleList.add(gv1);
        vehicleList.add(e1);
        vehicleList.add(t1);
        vehicleList.add(c1);
        vehicleList.add(hyb1);


        for(int i = 0; i < vehicleList.size(); i++){
            vehicleList.get(i).CalculateMilesPerTrip();
            vehicleList.get(i).CalculateCostToOwn();
           System.out.println(vehicleList.get(i).toString());
           System.out.println();
        }
        // test equals method
        System.out.println("testing equals method...");
       System.out.println(t1.equals(t1));
        System.out.println(t1.equals(c1));

        System.out.println("testing getters and setters");

        hyb1.setTankSize(10000);
        hyb1.setTankSize(13);
        hyb1.setMPG(38);
        hyb1.setName("Insight");
        hyb1.setColor("Purple");
        System.out.println(hyb1.toString());
    

    }
}

/* Answer to part 2

       Abstract classes and interfaces have similar uses but have a few key differences. One main difference
    is that an abstract class is a class that, while it can not have objects created from it, can have its own
    fields and methods which can either be abstract or have their own method bodies. An interface, on the other
    hand usually only has an abstract method, although it can also have constants as well.

       Abstract classes are useful when you want to force all of your base classes to have certain fields or
    implement a certain method. Abstract methods are also useful when combines with collections. A collection
    of the abstract type can be created to hold different subclasses of that class.  Interfaces are useful
    when other people try to use your code. If they know that your class implements an interface, then they
    know for sure that the class uses that method defined by the interface.

/* Answer to part 3

    Abstraction- Abstraction is a concept that is not exclusive to programming. Abstraction is basically just
           being able to use something with out exactly knowing how it works. We do this all the time when we use
           a car or a computer. We way not exactly how a car works but we are still able to use it. It is the same
           with programming. We can use a class or a method that another programmer with out knowing exactly
           how they programmed it

    Encapsulation- Encapsulation build upon the idea that code that is related should be kept together. In non
           object oriented languages, data and functions are kept separate, but in object oriented programming,
           related data and functions are pulled together into a class. Classes are built off of the idea that
           real world objects have descriptions a well as functions.

    Inheritance- Inheritance is another idea closely related to real life. Inheritance is the idea that
           something can have most or all of the features of another item and then have its own unique
           features as well, similar to how the classification of animals works. In programming, a class
           can establish some base functionality and subclasses can extend the base class and inherit all of
           its code without having to rewrite it. The subclass can also add its own fields and methods or even
           override the superclass methods.

    Polymorphism- Polymorphism is the idea that the same method from different classes can get chosen to run based on
           data and context. For example, if a method is over ridden from a super class, then the program
           can decide which method to run based on the parameter type or which object is calling it. There is
           compile time polymorphism, which the program can decide which function to call when the program is
           compiled. There is also run time polymorphism, which it is not clear which method to call based on
           how the program is written and the program must be run to datetime which method to call. A good
           example of this is the loop in the main method of my code. It is not clean which method to call
           when it is compiled and it is not until the loop runs that it becomes clear.
 */

