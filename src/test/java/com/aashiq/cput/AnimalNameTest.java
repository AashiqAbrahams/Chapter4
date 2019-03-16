package com.aashiq.cput;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalNameTest {

    AnimalName name;

    @Before
    public void setUp()
    {
        name = new AnimalName("Melman", "Giraffe");
    }

    @Test
    public void tesToString() throws Exception {
        assertEquals("Melman Giraffe", name.toString());
    }

}
