package ATB10x_03_Jan18;

public class Lab09_Concatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b); // Math

        String name1 = "Varam";
        String name2 = "Chellam";
        System.out.println(name1+name2); // Concatenation


        // + -> behave differently with the data type.
        // + -> operator overloading

        System.out.println(name1 + name2 + a + b); //first operator - + performed as Concatenation
        System.out.println(name1 + name2 + (a + b)); // BODMAS - Bracket of Div, mul, add, sub
        System.out.println(a + b + name1 + name2);
    }
}
