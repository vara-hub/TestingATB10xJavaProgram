package Task_Feb7;

public class Sumof1to100 {
    public static void main(String[] args) {

        int sum=0;

        for (int i=1; i<=100; i++)
        {

            sum+=i;

        }
        System.out.println("Sum of numbers from 1 to 100 = " +sum);
    }
}

/*
output:
Sum of numbers from 1 to 100 = 5050
 */