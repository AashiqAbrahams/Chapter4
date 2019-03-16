package com.aashiq.cput;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalCompTest {

    AnimalName name;
    DateOfRegistration dor;
    AnimalComp alex;

    @Before
    public void setUp()
    {
        name = new AnimalName("Alex", "Lion");
        dor = new DateOfRegistration(22, 2, 2003);
        alex = new AnimalComp(name, dor);
    }

    @Test
    public void testToString()
    {
        assertEquals("My name is Alex, my date of registration is 22/2/2003", alex.toString());
    }

}
