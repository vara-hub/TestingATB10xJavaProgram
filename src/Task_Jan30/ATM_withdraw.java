package Task_Jan30;

import javax.swing.*;
import java.util.Scanner;

public class ATM_withdraw {
    public static void main(String[] args) {
        int ac = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw from ATM");
        int n = sc.nextInt();


        if (n <= 0)
        {
            System.out.println("enter enter amount greater than zero.");

        }
        else if (n > ac)
        {
            System.out.println("insufficient balance");
        }
        else if (n % 100 != 0)
        {
            System.out.println("amount should be multiples of 100");
        }
        else
        {
            ac =ac-n;
            System.out.println("ATM withdraw successful");
            System.out.println("current account balance is " + ac);
        }


    }
}

//output:
//Enter the amount to withdraw from ATM
//250
//amount should be multiples of 100

//Enter the amount to withdraw from ATM
//10001
//insufficient balance

//Enter the amount to withdraw from ATM
//-1
//enter enter amount greater than zero.

//Enter the amount to withdraw from ATM
//0
//enter enter amount greater than zero.

//Enter the amount to withdraw from ATM
//7000
//ATM withdraw successful
//current account balance is 3000