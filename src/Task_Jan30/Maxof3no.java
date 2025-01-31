package Task_Jan30;

import java.util.Scanner;

public class Maxof3no {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the number n1" );
            int n1= sc.nextInt();

            System.out.println("Enter the number n2");
            int n2= sc.nextInt();

            System.out.println("Enter the number n3");
            int n3= sc.nextInt();

            if(n1>n2 && n1>n3)
            {
                System.out.println("The Number n1 is MAX " +n1);

            }
            else if (n2>n3)

            {
                System.out.println("The Number n2 is MAX " +n2);
            }
            else
            {
                System.out.println("The Number n3 is MAX " +n3);
            }
        }
    }


    //output:
//Enter the number n1
//434
//Enter the number n2
//344
//Enter the number n3
//22
//The Number n1 is MAX 434

//Enter the number n1
//666
//Enter the number n2
//777
//Enter the number n3
//444
//The Number n2 is MAX 777

//Enter the number n1
//2
//Enter the number n2
//3
//Enter the number n3
//4
//The Number n3 is MAX 4