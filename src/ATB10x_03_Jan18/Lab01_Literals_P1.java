package ATB10x_03_Jan18;

public class Lab01_Literals_P1 {
    public static void main(String[] args) {

        // Literal
        int age = 32;
        age = 66;
        System.out.println(age);

        // Constant
        final int saran_age = 2;
        //saran_age = 19; (cannot modify the final value)
        System.out.println(saran_age);


        int Enum = 9;
        //int enum=9; (identifiers cannot have datatype name)
        System.out.println(Enum); //interview QA

        //Boolean Literals
        boolean saran_is_good_boy =true;
        boolean lilly_is_good_girl =false;
                ;
        // First Type - Boolean  values - true or false
        System.out.println(saran_is_good_boy);
        System.out.println(lilly_is_good_girl);


        // Binary Literals
        int binary_num = 0b1010; // Decimal System - 10

        // Octal base -> 8
        int octal = 0101; //output is 65

        // Hexadecimal Literals
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745
        long largeNumber = 123456789L;

        System.out.println(binary_num);
        System.out.println(octal);
        System.out.println(hex);
        System.out.println(largeNumber);

        //Floating literals
        float pi = 3.14f;
        float pi2 = 3.14F;
        float f = 129.8763e2F;
        double dd=6.45455;
        double d1 = 129.8763e+2;
        double d2 = 12987.63e-2;
        System.out.println(f);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(dd);
        System.out.println(pi);
        System.out.println(pi2);

        //String Literals
        String greeting = "HelloWorld!";
        System.out.println(greeting);

        //Null Liertals
        String sname=null;
        System.out.println(sname);

        // Non Primitive  (String - bunch of char, multiple chars)
        String name = null; // Size (Bits) -> 64
        // boolean s = null; // Size (Bits) -> NA switch off,switch on
        int age1  = 90; // Size Bits( 32)


    }
}
