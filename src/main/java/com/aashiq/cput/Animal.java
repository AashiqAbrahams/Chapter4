package com.aashiq.cput;

public class Animal extends Mammal implements Herbivore{

    private String name;
    private String species;
    private int day;
    private int month;
    private int year;

    Animal()
    {

    }

    Animal(String name, String species, int day, int month, int year)
    {
        this.name = name;
        this.species = species;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Animal(String name, String species, int day, int month, int year, int noOfLegs)
    {
        this.name = name;
        this.species = species;
        this.day = day;
        this.month = month;
        this.year = year;
        this.noOfLegs = noOfLegs;
    }


    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString()
    {
        return String.format("My name is %s %s, my birthday is %d/%d/%d", name, species, day, month, year);
    }

}
