package Task_Jan30;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of triangle of A");
        int a = sc.nextInt();

        System.out.println("Enter side of triangle of B");
        int b = sc.nextInt();

        System.out.println("Enter side of triangle of C");
        int c = sc.nextInt();

        if ((a+b>c) && (a+c>b) && (b+c>a))
        {
            System.out.println("this is valid triangle");
        }
        else
        {
            System.out.println("this is not a valid triangle");
        }

    }
}

//output:
//Enter side of triangle of A
//2
//Enter side of triangle of B
//3
//Enter side of triangle of C
//4
//this is valid triangle



//Enter side of triangle of A
//1
//Enter side of triangle of B
//1
//Enter side of triangle of C
//5
//this is not a valid triangle