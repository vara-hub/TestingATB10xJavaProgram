package Task_Jan31;

import java.util.Scanner;

public class Visa {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the age of the person");
            int age= sc.nextInt();

        //Age Validation and Eligibility :
        if(age<0)
        {
            System.out.println("Age Should be greater than or equal to 18 to be eligible to travel.");

        }
   else if(age>=18)
        {
            System.out.println("age is 18 or older ,visa status is valid, the person can travel.");
        }
        else
        {
            System.out.println("Age limit should be MIN so the person cannot travel.");

        }

        // VISA checking true/false:
        System.out.println("Enter the visa status whether its true ro false");
        boolean visa = sc.nextBoolean();

       if( visa ==true ) {
           System.out.println("valid visa.");
       }

else {

           System.out.println("invalid visa.");
       }

    }
}

//output:
//Enter the age of the person
//18
//age is 18 or older ,visa status is valid, the person can travel.
//Enter the visa status whether its true ro false
//true
//valid visa.


//Enter the age of the person
//44
//age is 18 or older ,visa status is valid, the person can travel.
//Enter the visa status whether its true ro false
//false
//invalid visa.

//Enter the age of the person
//-1
//Age Should be greater than or equal to 18 to be eligible to travel.
//Enter the visa status whether its true ro false
//false
//invalid visa.