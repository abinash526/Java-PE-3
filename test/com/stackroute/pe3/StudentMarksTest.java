package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks ob;

    @Before
    public void setUp() throws Exception {
    ob=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
    ob=null;
    }

    @Test
    public void checsValidkMarks() {
        int[] marks={12,43,32,87};
        int res=ob.checkMarks(4,marks);
        assertEquals(1,res);
    }
    @Test
    public void checsInalidkMarks() {
        int[] marks={123,43,32,87};
        int res=ob.checkMarks(4,marks);
        assertEquals(0,res);
    }
    @Test
    public void checsInalidkMarksNotNull() {
        int[] marks={123,43,32,87};
        int res=ob.checkMarks(4,marks);
        assertNotNull(res);
    }
}