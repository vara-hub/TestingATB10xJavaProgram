package Task_Feb7;

import java.util.Scanner;

public class Invert_RT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to show inverted right angled triangle");
        int no = sc.nextInt();


        for (int i = no; i >=1; i--)  // Outer loop for rows (starting from n to 1)
        {
            for (int j = 1; j <= i; j++)       // Inner loop for stars (i stars in each row)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/*
output:

enter number to show inverted right angled triangle
5
*****
****
***
**
*

 */