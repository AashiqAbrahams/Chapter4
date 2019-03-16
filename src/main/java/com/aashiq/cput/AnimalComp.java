package com.aashiq.cput;

public class AnimalComp {

    private AnimalName name;
    private DateOfRegistration dor;

    AnimalComp()
    {

    }

    AnimalComp(AnimalName name, DateOfRegistration dor)
    {
        this.name = name;
        this.dor = dor;
    }

    public String toString()
    {
        return ("My name is " + name.toString() +", my registration date is " + dor.toString());
    }

}
