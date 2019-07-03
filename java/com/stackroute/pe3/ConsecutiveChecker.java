/*
*A program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a ​ string​ and use split()
Input: 98,96,95,94,93
Output: 98,96,95,94,93 non consecutive numbers
Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers
Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers*/
package com.stackroute.pe3;

public class ConsecutiveChecker {
    public String consecutiveChecker(int input)
    {
        String strInp=Integer.toString(input);
        String[] arrStringInp=strInp.split("");
        int counter;
        for(counter=0;counter<arrStringInp.length-1;counter++)
        {
            if(Math.abs(arrStringInp[counter].charAt(0)-arrStringInp[counter+1].charAt(0))==1){//Subtracting the consecutive numbers
                continue;

            }
            else
                break;
        }
        if(counter==arrStringInp.length-1){
            System.out.println(input+" contains consecutive numbers");
            return input+" contains consecutive numbers";}
        else
        {
            System.out.println(input+" doesn't contains consecutive numbers");
            return input+" doesn't contains consecutive numbers";}
        //return "hello";
    }
}
