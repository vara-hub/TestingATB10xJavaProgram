package ATB10X_06_Jan26;

import java.util.Scanner;

public class Lab04_Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check for reverse scenarios");
        int n=sc.nextInt();

        int reverse=0; // Variable to store the reversed number
        for(int i=n; i!=0; i/=10) // Use a for loop to reverse the number
        {
            int last = i % 10; // Extract the last digit
            reverse = reverse * 10 + last;   // Update the reversed number
        }
            System.out.println("Reverse number is " +reverse);

    }
}

//OUTPUT:
//Enter the number to check for reverse scenarios
//273893
//Reverse number is 398372