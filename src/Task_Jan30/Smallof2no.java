package Task_Jan30;

import java.util.Scanner;

public class Smallof2no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number n1" );
        int n1= sc.nextInt();

        System.out.println("Enter the number n2");
        int n2= sc.nextInt();

        if(n1==n2)
        {
            System.out.println("The Number n1 and n2 are equal");

        }
        else if (n1<n2)

        {
            System.out.println("The smallest number is: " +n1);
        }
        else
        {
            System.out.println("The smallest number is:" +n2);
        }
    }
}


//output:
//Enter the number n1
//22
//Enter the number n2
//22
//The Number n1 and n2 are equal

//Enter the number n1
//344
//Enter the number n2
//232
//The smallest number is:232

