package Task_Feb5;

public class Mult7_whileloop {
    public static void main(String[] args) {

        int n=7;
        int i=1;
        while(i<=12) {
            int total = n * i;
            System.out.println("Multiplication table of 7 is " + i + "*" + n + "=" + total);
            i++;



        }
    }
}

/*
output:
Multiplication table of 7 is 1*7=7
Multiplication table of 7 is 2*7=14
Multiplication table of 7 is 3*7=21
Multiplication table of 7 is 4*7=28
Multiplication table of 7 is 5*7=35
Multiplication table of 7 is 6*7=42
Multiplication table of 7 is 7*7=49
Multiplication table of 7 is 8*7=56
Multiplication table of 7 is 9*7=63
Multiplication table of 7 is 10*7=70
Multiplication table of 7 is 11*7=77
Multiplication table of 7 is 12*7=84
 */