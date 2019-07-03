/*
* Write a program to create a ChessBoard pattern with the help of multidimensional array, where
WWrepresents white color and BB represents Black color.
Output:
My Chess Board
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|*/
package com.stackroute.pe3;

public class ChessBoardPrinter {
    public String chessBoardPattern()//Checking for white and black
    {
        String[][] matrixChecker=new String[8][8];
        String pattern="";
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if((i+j)%2==0)//Checking for White
                {
                    matrixChecker[i][j]="WW|";
                }
                else //Checking for black
                {
                    matrixChecker[i][j]="BB|";
                }
            }
        }
        System.out.println("---------CHESS BOARD-----------");
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(matrixChecker[i][j]);
                pattern=pattern+matrixChecker[i][j];
            }
            System.out.println();
            pattern=pattern+"\n";
        }

        return pattern;
    }
}
