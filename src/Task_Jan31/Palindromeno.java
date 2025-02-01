package Task_Jan31;

import java.util.Scanner;

public class Palindromeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check if palindrome or not");
        int n = sc.nextInt();
        int p=n;
        int reverse=0;

        while (p > 0) {
            int digit = p % 10;  // Extract last digit
            reverse = reverse * 10 + digit; //Build the reversed number
            p = p / 10;     // Remove last digit

            System.out.println("Reversed Number: " + reverse);
        }

        if (n==reverse)
        {
            System.out.println("this number is palindrome");
        }
        else {
            System.out.println("this number is NOT a palindrome");
        }
    }
}
//Original: 123
//Reverse process:
//    Step 1: 0 * 10 + 3 = 3
//    Step 2: 3 * 10 + 2 = 32
//    Step 3: 32 * 10 + 1 = 321
//Final reversed number = 321

//--output--
//enter the number to check if palindrome or not
//123
//Reversed Number: 3
//Reversed Number: 32
//Reversed Number: 321
//this number is NOT a palindrome


//enter the number to check if palindrome or not
//121
//Reversed Number: 1
//Reversed Number: 12
//Reversed Number: 121
//this number is palindrome