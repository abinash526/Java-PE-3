package com.stackroute.pe3;

public class ExceptionGenerator {
    public static void main(String[] args) {
        try{
            throw new NegativeArraySizeException("Negative Array size exception is created and handled");
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }
        try{
            throw new IndexOutOfBoundsException("Index out of bound exception is created and handled");
        }
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
