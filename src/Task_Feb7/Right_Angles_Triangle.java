package Task_Feb7;

import java.util.Scanner;

public class Right_Angles_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to show right angled triangle");
        int no = sc.nextInt();


        for (int i = 1; i <= no; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
output:
enter number to show right angled triangle
7
*
**
***
****
*****
******
*******
 */