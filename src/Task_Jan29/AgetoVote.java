package Task_Jan29;

import java.util.Scanner;

public class AgetoVote {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age of the person to check whether eligible to vote");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("This person able to vote, hence the age is  "  +age);
        } else
        {
            System.out.println("This person NOT eligible to  vote, hence the age is "  +age);
        }
    }
}

//output:
//Enter the age of the person to check whether eligible to vote
//17
//This person NOT eligible to  vote, hence the age is 17


//Enter the age of the person to check whether eligible to vote
//18
//This person able to vote, hence the age is  18


//Enter the age of the person to check whether eligible to vote
//19
//This person able to vote, hence the age is  19