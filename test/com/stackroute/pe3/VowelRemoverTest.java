package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemoverTest {
    VowelRemover ob;

    @Before
    public void setUp() throws Exception {
        ob=new VowelRemover();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void vowelRemover1(){
        String res=ob.vowelRemover("India");
        assertEquals("Ind",res);
    }
    @Test
    public void vowelRemover2(){
        String res=ob.vowelRemover("United States");
        assertEquals("Untd Stts",res);
    }
    @Test
    public void vowelRemover3(){
        String res=ob.vowelRemover("Germany");
        assertEquals("Grmny",res);
    }

}