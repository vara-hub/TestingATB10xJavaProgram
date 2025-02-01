package Task_Jan31;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the salary of the person");
        double salary= sc.nextInt();
        System.out.println("Enter the Years of experience of the person");
        float years= sc.nextFloat();

        double Bonus = 0;

        if (years<0)
        {
            System.out.println("Years should be in Positive or valid one");
        }
        else if(years<1)
        {
            System.out.println("No Bonus");
            Bonus=0;
        }
        else if(years>=1 && years<=3)
        {
            System.out.println("Bonus is 5% of the salary.");
            Bonus =salary * 0.05;
        }
        else if(years>=4 && years<=6)
        {
            System.out.println("Bonus is 10% of the salary.");
            Bonus =salary * 0.10;
        }
        else
        {
            System.out.println("Bonus is 15% of the salary.");
            Bonus =salary * 0.15;
        }

        System.out.println("Bonus of the person according to salary and years " +Bonus);
    }
}

//output:



//Enter the salary of the person
//4000
//Enter the Years of experience of the person
//3
//Bonus is 5% of the salary.
//Bonus of the person according to salary and years 200.0

//Enter the salary of the person
//500000
//Enter the Years of experience of the person
//5
//Bonus is 10% of the salary.
//Bonus of the person according to salary and years 50000.0


//Enter the salary of the person
//34344
//Enter the Years of experience of the person
//8
//Bonus is 15% of the salary.
//Bonus of the person according to salary and years 5151.599999999999


//Enter the salary of the person
//344
//Enter the Years of experience of the person
//0.9
//No Bonus
//Bonus of the person according to salary and years 0.0

//Enter the salary of the person
//3000
//Enter the Years of experience of the person
//1
//Bonus is 5% of the salary.
//Bonus of the person according to salary and years 150.0


//Enter the salary of the person
//23432
//Enter the Years of experience of the person
//-1
//Years should be in Positive or valid one
//Bonus of the person according to salary and years 0.0

