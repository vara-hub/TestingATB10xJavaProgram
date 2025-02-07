package Task_Feb7;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
        System.out.println("enter the factorial number");
    int no= sc.nextInt();

    long fact =1;
        for(int i=1; i<=no; i++)
        {
    fact= fact*i;


}
        System.out.println("The result of the factorial number of  " +no+ "! =" +fact);
}
}

/*
output:
enter the factorial number
8
The result of the factorial number of  8! =40320
 */