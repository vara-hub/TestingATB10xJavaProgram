package Task_Jan30;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the alphabets");
       char c= sc.next().charAt(0);

// Condition ->
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            System.out.println(c + " is an alphabet.");
        } else {
            System.out.println(c + " is not an alphabet.");
        }

    }
}

//output:
//Enter the alphabets
//0
//0 is not an alphabet.

//Enter the alphabets
//H
//H is an alphabet.