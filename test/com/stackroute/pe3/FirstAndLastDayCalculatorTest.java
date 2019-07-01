package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayCalculatorTest {
    FirstAndLastDayCalculator ob;

    @Before
    public void setUp() throws Exception {
        ob=new FirstAndLastDayCalculator();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void testFirstAndLastDay() {
        String res=ob.firstAndLastDay("6/3/2019");
        assertEquals("First day is:- 3 Jun 2019\n" +
                "Last day is:- 9 Jun 2019",res);

    }
    @Test
    public void testFirstAndLastDay2() {
        String res=ob.firstAndLastDay("6/30/2019");
        assertEquals("First day is:- 24 Jun 2019\n" +
                "Last day is:- 30 Jun 2019",res);

    }
}