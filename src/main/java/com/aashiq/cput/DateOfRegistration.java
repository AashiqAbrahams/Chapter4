package com.aashiq.cput;

public class DateOfRegistration {

    private int day;
    private int month;
    private int year;

    DateOfRegistration() { }

    DateOfRegistration(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString()
    {
        return String.format("%d/%d/%d", day, month, year);
    }
}
