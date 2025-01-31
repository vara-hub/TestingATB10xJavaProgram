package Task_Jan30;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the score of the student");
    int score= sc.nextInt();

    if (score<0 || score>100)
    {
        System.out.println("this is invalid score, enter correct score/marks (ensure they are between 0 and 100)");
    }
    else if(score>=90 && score<=100)
        {

            System.out.println("The Grade is A+");
        }

    else if(score>=80 && score<=89)
    {
        System.out.println("The Grade is A");
    }

    else if(score>=70 && score<=79)
    {
        System.out.println("The Grade is B");
    }

    else if(score>=60 && score<=69)
    {
        System.out.println("The Grade is C");
    }
    else if(score>=50 && score<=59)
    {
        System.out.println("The Grade is D");
    }
    else if(score>=40 && score<=49)
    {
        System.out.println("The Grade is E");
    }
    else {
        System.out.println("fail");
    }
}
}

//output:
//Enter the score of the student
//89
//The Grade is A

//Enter the score of the student
//101
//this is invalid score, enter correct score/marks (ensure they are between 0 and 100)

//Enter the score of the student
//-1
//this is invalid score, enter correct score/marks (ensure they are between 0 and 100)

//Enter the score of the student
//44
//The Grade is E

//Enter the score of the student
//100
//The Grade is A+


//Enter the score of the student
//39
//fail