package com.stackroute.pe3;

public class MatrixSum {
    public String matrixSum(int row,int column,int[][] matrix1, int[][] matrix2)
    {
        int counter1,counter2,sum=0;
        String outp="";
        System.out.println("--------------------------");
        System.out.println("Sum is");
        System.out.println("--------------------------");
        for(counter1=0;counter1<row;counter1++)
        {
            for(counter2=0;counter2<column;counter2++)
            {
                sum=sum+matrix1[counter1][counter2]+matrix2[counter1][counter2];
                System.out.print(sum+" ");
                outp=outp+sum+ " ";
            }
            System.out.println();
            outp=outp+"\n";
            sum=0;
        }
        return outp;
    }
}
