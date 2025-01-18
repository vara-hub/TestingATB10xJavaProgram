package ATB10x_03_Jan18;

public class Lab07_Logical_Operators {
    public static void main(String[] args) {

        //Logical NOT (!)  eg: !a
        // Logical AND (&&)  eg: a&&b
        //Logical OR (||) eg: a||b

        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);


        boolean c= true || false;
        System.out.println(c);
        boolean c1= false || false;
        System.out.println(c1);

        boolean d= true && false;
        boolean d1= true && true;
        System.out.println(d);
        System.out.println(d1);


        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // || - OR

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

    }
}
