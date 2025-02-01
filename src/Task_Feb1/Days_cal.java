package Task_Feb1;

import java.util.Scanner;

public class Days_cal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of Days");
        int tdays= sc.nextInt();

        int years = tdays / 365; //Calculate the number of years by dividing by 365.
        System.out.println("Number of years : " +years);

        int remaindays =tdays % 365; //Find the remaining days using modulus (% 365).

        int months = remaindays / 30; //Calculate the months by dividing the remaining days by 30.
        System.out.println("Number of months : " +months);

        int days=remaindays % 30; //remaining days using modulus (% 30).
        System.out.println("Number of days: "  +days);

        System.out.println("The Total Days of " +tdays+  "="   + years + " years, " + months + " months, and " + days + " days.");

    }
}


//output:
/*
Enter the number of Days
5930
Number of years : 16
Number of months : 3
Number of days: 0
The Total Days of 5930=16 years, 3 months, and 0 days.


Enter the number of Days
56
Number of years : 0
Number of months : 1
Number of days: 26
The Total Days of 56=0 years, 1 months, and 26 days.


Enter the number of Days
2500
Number of years : 6
Number of months : 10
Number of days: 10
The Total Days of 2500=6 years, 10 months, and 10 days.
 */