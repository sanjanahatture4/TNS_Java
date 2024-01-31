package com.sanjana;

public class MultiArray {
    public static void main(String[] args) {
        int c[][]= {{12,45},{34,87},{7,2}};//new int [3][4]
        Array.printArray(c);

    }

}
class Array
{
    static void printArray(int c[][])
    {
        System.out.println("Array elements are as follows:");
        for(int i=0;i<=c.length;i++)
        {
            for(int j=0;j<=c[i].length;j++)
            {
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
    }
}
