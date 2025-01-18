package ATB10x_03_Jan18;

public class Lab12_Important {
    public static void main(String[] args) {
        int a = 10;
        boolean b = (10 == 11); // == -> Comparison 2 values
        System.out.println(a);
        System.out.println(b);

        long l = 10l; // Bits - 64, Byte? - 8
        String s = "name"; //  8 Byte, 64 Bits

        char a1 = 'A'; // ASCII -> 65
        char b1 = 'B'; // 66
        System.out.println(a1 + b1); //AB
        // a1+b1 - 65+66 -> 131
        // Rule - concatenation of Strings -> char -> int calculation
        // a1+b1 - 65+66 -> 131



        System.out.println('A' == 65); // == char -> ASCII - 65


        short s1 = 10;
        char c = 'A'; //A -> 65
        System.out.println(c+s1);
        System.out.println(c);
        // When you do the + concat then only ASCII values are used.
    }
}
