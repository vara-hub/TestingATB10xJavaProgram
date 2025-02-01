package Task_Jan31;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of units consumed");
        int units = sc.nextInt();
        double TotalBill = 0;

        if(units<0)
        {

            System.out.println("Units should be in Positive integer");

        }
else if (units>=1 && units<=100)
{
    TotalBill = units*0.50;
    System.out.println("Rate is 0.50Rs per unit");

}
else if (units>=101 && units<=200)
{
    TotalBill = units*0.75;
    System.out.println("Rate is 0.75Rs per unit");
}
else if (units>=201 && units<=300)
{
    TotalBill = units*1.20;
    System.out.println("Rate is 1.20Rs per unit");
}
else
{
    TotalBill = units*1.50;
    System.out.println("Rate is 1.50Rs per unit");
}

        System.out.println("Total electricity bill : "+TotalBill);

    }

}

//output:
//Enter the number of units consumed
//-11
//Units should be in Positive integer

//Enter the number of units consumed
//1
//Rate is 0.50Rs per unit
//Total electricity bill : 0.5

//Enter the number of units consumed
//100
//Rate is 0.50Rs per unit
//Total electricity bill : 50.0

//Enter the number of units consumed
//450
//Rate is 1.50Rs per unit
//Total electricity bill : 675.0