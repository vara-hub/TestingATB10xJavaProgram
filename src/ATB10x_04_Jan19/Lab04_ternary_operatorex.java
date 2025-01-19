package ATB10x_04_Jan19;

public class Lab04_ternary_operatorex {
    public static void main(String[] args) {
        //Result=condition?expression1 : expression2
        int age=18;
        String vote = age>= 18 ? "yes, you can vote" : "No, you can't vote";
        System.out.println(vote);

        int num=10;
        String result= num>=0?"The number 10 is positive":"The number 10 is negative";
        System.out.println(result);

        int num2=10;
        String result2= num2>=0?"The number -10 is positive":"The number -10 is negative";
        System.out.println(result2);

        // Find the maximum number between two numbers.
        // X and Y -> Max X, y -> Ternary Op.
        int x = 10;
        int y  = 20;
        String max = x > y ? "X is max" : "Y is max";
        System.out.println(max);

//Even or Odd
        int n = 10;
        int m=5;
        String EO1 = (n%2==0) ? "The number 10 is Even" : "The number 10 is Odd";
        String EO2 = (m%2==0) ? "The number 5 is Even" : "The number 5 is Odd";
        System.out.println(EO1);
        System.out.println(EO2);

    }
}
