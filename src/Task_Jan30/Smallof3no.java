package Task_Jan30;

import java.util.Scanner;

public class Smallof3no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number n1" );
        int n1= sc.nextInt();

        System.out.println("Enter the number n2");
        int n2= sc.nextInt();

        System.out.println("Enter the number n3");
        int n3= sc.nextInt();

        if(n1<n2 && n1<n3)
        {
            System.out.println("The smallest number is: " +n1);

        }
        else if (n2<n3)

        {
            System.out.println("The smallest number is: "  +n2);
        }
        else
        {
            System.out.println("The smallest number is: " +n3);
        }

    }
}

//output:
//Enter the number n1
//2
//Enter the number n2
//3
//Enter the number n3
//4
//The smallest number is: 2

//Enter the number n1
//4
//Enter the number n2
//45
//Enter the number n3
//1
//The smallest number is: 1