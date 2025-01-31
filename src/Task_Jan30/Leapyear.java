package Task_Jan30;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year to find whether its leap year or not");
        int n= sc.nextInt();

        if(n%4==0 && n%100!=0 || n%400==0)
        {

            System.out.println( "This  "   +n+  "  is a leap year");
        }

        else
        {
            System.out.println("This  "  +n+ "  is NOT a leap year");
        }

    }
}

//output:
//Enter the year to find whether its leap year or not
//2024
//This  2024  is a leap year

//Enter the year to find whether its leap year or not
//1993
//This  1993  is NOT a leap year