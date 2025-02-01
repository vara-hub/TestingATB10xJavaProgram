package Task_Feb1;

import java.util.Scanner;

public class Div5and11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number");
        int n= sc.nextInt();

        if(n%5==0 && n%11==0)
        {
            System.out.println("This " +n+  " number is divisible by both 5 and 11");
        }
        else
        {
            System.out.println("This " +n+  " number is NOT divisible by both 5 and 11");
        }
    }
}

//output:
/*
Enter the number
55
This 55 number is divisible by both 5 and 11

Enter the number
25
This 25 number is NOT divisible by both 5 and 11
 */