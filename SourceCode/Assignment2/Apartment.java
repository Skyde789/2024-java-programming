package oop;

/*
Create a class called Apartment based on the UML class diagram in the repository

Pay attention to the access modifiers for each member variable or method

As you see, contructor with two parameters is needed: the number of tenants as the 1st parameter and the area of the apartment as the 2nd parameter.

Add method heatingCost which takes the electricity price kw/h as parameter of type Float. Method calculates the heating as numOfTenants * area * price and returns it. 
*/

public class Apartment {
    private Integer numOfTenants = 0;
    private Integer area = 0;

    public Apartment(Integer _numOfTenants, Integer _area){
        this.numOfTenants = _numOfTenants;
        this.area = _area;
    }

    public Float heatingCost(Float cost){
        double x = cost * area * numOfTenants;
        double y = Math.round(x * 10.0) / 10.0; // => 1.2
        return (float)y;
    }
}