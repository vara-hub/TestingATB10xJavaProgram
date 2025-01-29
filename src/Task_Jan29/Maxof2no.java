package Task_Jan29;

import java.util.Scanner;

public class Maxof2no {
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
        else if (n1>n2)

        {
            System.out.println("The Number n1 is MAX " +n1);
        }
else
        {
            System.out.println("The Number n2 is MAX " +n2);
        }
    }
}


//output:
//Enter the number n1
//2
//Enter the number n2
//2
//The Number n1 and n2 are equal

//Enter the number n1
//3
//Enter the number n2
//4
//The Number n2 is MAX 4

//Enter the number n1
//344
//Enter the number n2
//56
//The Number n1 is MAX 344