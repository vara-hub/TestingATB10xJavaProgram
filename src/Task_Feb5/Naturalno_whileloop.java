package Task_Feb5;

public class Naturalno_whileloop {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            sum+=i;
            i++;
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