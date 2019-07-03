package com.stackroute.pe3;

public class StudentMarks {
    public int checkMarks(int n,int[] marks)
    {
        int i;
        for( i=0;i<n;i++)
        {
            //Validity Check
            if(marks[i]<0||marks[i]>100)
            {
                System.out.println("Invalid Input");
                return 0;
            }
        }
        if(i==n)
        {
            return 1;
        }
        return 0;
    }
}
