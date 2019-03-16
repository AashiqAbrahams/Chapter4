package com.aashiq.cput;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateOfRegTest {

    DateOfRegistration dor;

    @Before
    public void setUp()
    {
        dor = new DateOfRegistration(13,11,1994);
    }

    @Test
    public void tesToString() throws Exception {

        assertEquals("13/11/1994", dor.toString());
    }

}