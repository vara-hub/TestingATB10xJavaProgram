package ATB10X_06_Jan26;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab02_Task_Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to find for Fibonacci series");
        int n= sc.nextInt();

        int a=0;
        int b=1;
for (int i=1; i<=n; i++)
        {
            System.out.println("Fibonacci series = "  +a);
           int sum= a+b;
           a=b;
           b=sum;
            System.out.println();
        }
    }
}
