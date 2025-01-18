package ATB10x_03_Jan18;

public class Lab13_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid - > Implicit Casting
        int a1 = (int)b; // Valid - > Explicit Casting
        System.out.println(a);
        System.out.println(a1);

        //Narrowing in Implicit and explicit
        int val  = 200;
//        byte b1 = val; // // Invalid - Implicit Casting narrowing is not allowed
        byte b2 = (byte)val; // // // Valid -> Explicit Casting -  allowed
        // Data Loss:
        System.out.println(b2);



        long phone_no = 9876543210l;
        //short s = phone_no; // implicit
        short s = (short) phone_no; // Explicit
        System.out.println(s);

        int course = 100;
        float GST = 18.45f;
//        int total_int = course+GST; // Narrowing - Implicit
        int total_int = course+(int)GST; // Narrow - Explicit
        float total = course+GST; // Widenning - implicit
        float total2 = (float) course+GST; // Widenning - Explicit
        System.out.println(total);


    }
}
