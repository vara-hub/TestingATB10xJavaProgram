package Task_Feb7;

import java.util.Scanner;

public class Factotail_while {
    public static void main(String[] args) {


            Scanner sc= new Scanner(System.in);
            System.out.println("enter the factorial number");
            int no= sc.nextInt();

           long fact =1;
            int i=1;
            while( i<=no)
            {
                fact= fact*i;
                i++;

            }
            System.out.println("The result of the factorial number of " +no+ "! =" +fact);


    }
}

/*
output:
enter the factorial number
5
The result of the factorial number of 5! =120
 */