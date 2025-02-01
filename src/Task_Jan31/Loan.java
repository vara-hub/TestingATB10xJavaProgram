package Task_Jan31;

import javax.swing.*;
import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the age of the person");
        int age= sc.nextInt();
        //Age Validation
        if(age<0)
        {
            System.out.println("Age should be in Positive integer");

        }
        else if(age>=18 && age<=80)
        {
            System.out.println("Age is validated - successful");
        }
        else
        {
            System.out.println("Age limit should be MIN is 18 and MAX  age is 80");

        }

        System.out.println("Enter the salary of the person");
        double salary= sc.nextInt();

//Salary Validation:
        if (salary<0)
{
    System.out.println("Salary should be in Positive number");
}
else if (salary>=30000)
        {
            System.out.println("Salary is validated - successful");
        }else
        {
            System.out.println("minimum salary threshold (e.g., 30,000)");
        }

//Credit score Validation:
        System.out.println("Enter the credit score of the person");
        int credit= sc.nextInt();

        if(credit<0)
        {
            System.out.println("credit score should be in Positive integer");

        }
        else if(credit>=650 && credit<=850)
        {
            System.out.println("credit score are validated- successful");
        }
        else
        {
            System.out.println("credit score threshold is MIN is 650 and MAX is 850");

        }
    }
}

//output:
//Enter the age of the person
//18
//Age is validated - successful
//Enter the salary of the person
//32000
//Salary is validated - successful
//Enter the credit score of the person
//700
//credit score are validated- successful


//Enter the age of the person
//-1
//Age should be in Positive integer
//Enter the salary of the person
//-1
//Salary should be in Positive number
//Enter the credit score of the person
//-1
//credit score should be in Positive integer

//Enter the age of the person
//4
//Age limit should be MIN is 18 and MAX  age is 80
//Enter the salary of the person
//29000
//minimum salary threshold (e.g., 30,000)
//Enter the credit score of the person
//649
//credit score threshold is MIN is 650 and MAX is 850


//Enter the age of the person
//81
//Age limit should be MIN is 18 and MAX  age is 80
//Enter the salary of the person
//394
//minimum salary threshold (e.g., 30,000)
//Enter the credit score of the person
//900
//credit score threshold is MIN is 650 and MAX is 850