package Task_Feb7;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to print inverted pyramid");
        int no = sc.nextInt();
        System.out.println("---------------------------------------");

        for (int i = no; i >= 1; i--)       // Outer loop
        {
            for (int j =1; j <=(no - i); j++)    // Inner loop for spaces
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++)  // Inner loop for stars
            {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("---------------------------------------");
    }
}


/*
output:

enter number to print inverted pyramid
4
---------------------------------------
*******
 *****
  ***
   *
---------------------------------------


 */