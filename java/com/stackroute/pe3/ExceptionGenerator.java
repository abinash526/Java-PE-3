/*
* Write a program that will generate ​ exceptions​ of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.*/
package com.stackroute.pe3;

public class ExceptionGenerator {
    public static void main(String[] args) {//Main method
        try{//try catch block
            throw new NegativeArraySizeException("Negative Array size exception is created and handled");
        }
        //catch for negativeArraySize
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }
        try{
            throw new IndexOutOfBoundsException("Index out of bound exception is created and handled");
        }
        //catch for IndexOutOfBound
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        try{
            throw new NullPointerException("Null Pointer Exception exception is created and handled");
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
