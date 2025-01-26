package ATB10X_06_Jan26;

import java.util.Scanner;

public class Lab01_Task_Factorial {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the factorial number");
        int no= sc.nextInt();

int fact =1;
        for(int i=1; i<=no; i++)
            fact= fact*i;
        System.out.println("The result of the factorial number=" +fact);

    }
}

//output:
//enter the factorial number
//5
//The result of the factorial number=120