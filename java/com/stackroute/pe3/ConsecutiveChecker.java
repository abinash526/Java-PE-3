package com.stackroute.pe3;

public class ConsecutiveChecker {
    public String consecutiveChecker(int input)
    {
        String strInp=Integer.toString(input);
        String[] arrStringInp=strInp.split("");
        int counter;
        for(counter=0;counter<arrStringInp.length-1;counter++)
        {
            if(Math.abs(arrStringInp[counter].charAt(0)-arrStringInp[counter+1].charAt(0))==1){
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
