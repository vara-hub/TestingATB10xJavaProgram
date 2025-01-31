package Task_Jan30;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if s prime or not");
        int n = sc.nextInt();
        ;

        if (n <= 1)  // 1 and negative numbers are not prime
        {
            System.out.println("This is not prime number");
        }
            //if (n == 2 || n == 3)  // 2 and 3 are prime
        //if (n%2==0 && n>2)
       else {

            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0) {
                    System.out.println("not prime");
                    break;
                }
                else
                {
                    System.out.println("prime");
                    break;
                }

            }
        }

    }
}



//output:
//Enter the number to check if s prime or not
//1
//This is not prime number

//Enter the number to check if s prime or not
//-1
//This is not prime number

//Enter the number to check if s prime or not
//0
//This is not prime number

//Enter the number to check if s prime or not
//37
//prime

//Enter the number to check if s prime or not
//46
//not prime