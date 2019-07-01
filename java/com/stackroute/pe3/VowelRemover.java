package com.stackroute.pe3;

public class VowelRemover {
    public String vowelRemover(String input)
    {
        String outp="";
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
            {
                continue;
            }
            outp=outp+input.charAt(i);
        }
        System.out.println("---------------");
        System.out.println(outp);
        System.out.println("---------------");
        return outp;
    }
}
