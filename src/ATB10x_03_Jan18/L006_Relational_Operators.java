package ATB10x_03_Jan18;

public class L006_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

            int a = 10;
            int b = 30;
            int d=30;
            boolean c = a > b; // 10> 30
            boolean c1 = a < b;
            boolean c2 = a==b;
            System.out.println(c);
            System.out.println(c1);
            System.out.println(c2);


            int saran = 34;
            int karthik = 35;

            boolean result = saran >= karthik;
            boolean result2 = saran <= karthik;
            boolean result3 = saran != karthik;

            System.out.println(result);
            System.out.println(result2);
            System.out.println(result3);
    }
}
