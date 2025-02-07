package Task_Feb7;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print for Multiplication table");
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int total = n * i;
            System.out.println("Multiplication table of 5 is " + i + "*" + n + "=" + total);
        }
    }
}

/*
output:
enter the number to print for Multiplication table
5
Multiplication table of 5 is 1*5=5
Multiplication table of 5 is 2*5=10
Multiplication table of 5 is 3*5=15
Multiplication table of 5 is 4*5=20
Multiplication table of 5 is 5*5=25
Multiplication table of 5 is 6*5=30
Multiplication table of 5 is 7*5=35
Multiplication table of 5 is 8*5=40
Multiplication table of 5 is 9*5=45
Multiplication table of 5 is 10*5=50
 */