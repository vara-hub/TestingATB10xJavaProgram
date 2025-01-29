package Task_Jan29;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to verify for even or odd");
        int n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("the number is even = " +n);
        } else
        {
            System.out.println("the number is odd = " +n);
        }
    }
}

//output
//Enter the number to verify for even or odd
//4
//the number is even = 4

//Enter the number to verify for even or odd
//5
//the number is odd = 5