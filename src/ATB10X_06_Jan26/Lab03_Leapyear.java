package ATB10X_06_Jan26;

import java.util.Scanner;

public class Lab03_Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to find whether its leap year or not");
        int n=sc.nextInt();

        if (n%4==0)
        {
            if(n%400==0 && n%100!=0) {

                System.out.println( "This is a leap year");
            }
        }
        else
        {
            System.out.println(" This is NOT a leap year");
        }
    }
}
