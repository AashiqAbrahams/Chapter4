package com.aashiq.cput;

public class AnimalName {

    private String name;
    private String species;

    AnimalName()
    {

    }

    AnimalName(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

    public String toString()
    {
        return (name + " " + species);
    }
}
