package Task_Feb1;

import java.util.Scanner;

public class Seniorcitizen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age=sc.nextInt();

        if(age<0)
        {
            System.out.println("Age should be in Positive integer");

        }
        else if(age>=0 && age<=12)
        {
            System.out.println("CHILD is "  +age);
        }
        else if(age>=13 && age<=19)
        {
            System.out.println("TEENAGER is "  +age);
        }
        else if(age>=20 && age<=64)
        {
            System.out.println("ADULT is "  +age);
        }
        else
        {
            System.out.println("SENIOR CITIZEN is  "  +age);
        }


    }
}


//output:
/*
Enter the age of the person
-1
Age should be in Positive integer

Enter the age of the person
0
CHILD is 0


Enter the age of the person
13
TEENAGER is 13

Enter the age of the person
32
ADULT is 32

Enter the age of the person
65
SENIOR CITIZEN is  65

Enter the age of the person
100
SENIOR CITIZEN is  100


 */