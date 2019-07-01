package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    MatrixSum ob;
    @Before
    public void setUp() throws Exception {

        ob=new MatrixSum();
    }

    @After
    public void tearDown() throws Exception {

        ob=null;
    }

    @Test
    public void matrixSumtest() {
        int[][] Matrix1={{1,2,4},{1,2,4}};
        int[][] Matrix2={{12,2,6},{5,2,4}};

        String res=ob.matrixSum(2,3,Matrix1,Matrix2);
        assertEquals("13 17 27 \n" +
                "6 10 18 \n",res);
    }
    @Test
    public void matrixSumtest2() {
        int[][] Matrix1={{1,2,4},{1,2,4},{3,5,1}};
        int[][] Matrix2={{12,2,6},{5,2,4},{4,6,1}};

        String res=ob.matrixSum(3,3,Matrix1,Matrix2);
        assertEquals("13 17 27 \n" +
                "6 10 18 \n" +
                "7 18 20 \n",res);
    }
}