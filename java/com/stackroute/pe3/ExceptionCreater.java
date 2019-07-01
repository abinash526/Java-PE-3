package com.stackroute.pe3;

public class ExceptionCreater {
    public static void main(String[] args) {
        try{
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
