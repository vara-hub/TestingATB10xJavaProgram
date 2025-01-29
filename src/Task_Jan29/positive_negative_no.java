package Task_Jan29;

import java.util.Scanner;

public class positive_negative_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Positive or Negative");
        int n= sc.nextInt();

        if (n==0)
        {
            System.out.println("this number is zero " +n);
        }
        else if(n>0)
        {
            System.out.println("This Number is Positive " +n);
        }
        else
        {
            System.out.printf("This Number is Negative " +n);
        }



    }
}

//output:
//Enter the number to check whether it is Positive or Negative
//3
//This Number is Positive 3

//Enter the number to check whether it is Positive or Negative
//-9
//This Number is Negative -9

//Enter the number to check whether it is Positive or Negative
//0
//this number is zero 0