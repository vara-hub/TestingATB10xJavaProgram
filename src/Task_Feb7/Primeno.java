package Task_Feb7;

import java.util.Scanner;

public class Primeno
{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check if s prime or not");
    int n = sc.nextInt();
    ;

    if (n <= 1)  // 1 and negative numbers are not prime
    {
        System.out.println("This is not prime number");
    }

    else {

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                System.out.println("This number "  +n+  " is a not prime no ");
                break;
            }
            else
            {
                System.out.println("This number "  +n+  " is a prime no");
                break;
            }

        }
    }

}
}

/*
Output:
Enter the number to check if s prime or not
7
This number 7 is a prime no

Enter the number to check if s prime or not
1
This is not prime number

Enter the number to check if s prime or not
-8
This is not prime number

Enter the number to check if s prime or not
0
This is not prime number

Enter the number to check if s prime or not
56
This number 56 is a not prime no

 */