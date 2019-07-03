package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPrinterTest {
    ChessBoardPrinter ob;

    @Before
    public void setUp() throws Exception {
        ob=new ChessBoardPrinter();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void chessBoardPattern() {
        String res=ob.chessBoardPattern();
        assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n",res);

    }
}