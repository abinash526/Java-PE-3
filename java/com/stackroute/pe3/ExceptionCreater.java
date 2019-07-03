/*
* Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a ​ String​ argument.
b. Catch the exception inside a catch clause and print the ​ String​ argument.
c. Add a finally clause and print a message to prove you were there.*/
package com.stackroute.pe3;

public class ExceptionCreater {
    public static void main(String[] args) {
        try{//Exception is Created through string message
            throw new Exception("This is a new exception that is thrown");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("All exceptions are handled");
        }
    }
}
