package Task_Feb5;

public class Naturalno_forloop {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            sum+=i;

        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}

/*
output:
1
2
3
4
5
6
7
8
9
10
Sum of first 10 natural numbers: 55
 */