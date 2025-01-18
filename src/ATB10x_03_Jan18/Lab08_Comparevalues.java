package ATB10x_03_Jan18;

public class Lab08_Comparevalues {
    public static void main(String[] args) {
        // == ?  Compare the values
        System.out.println( 10 == 10);
        System.out.println( 10 < 10);
        System.out.println( 10 == 20);
        System.out.println( 10 <= 10);
        // 10 < 10 or 10 = 10
        System.out.println( 10 >= 10); //  10> 10 or 10 = 10

        System.out.println(!(10>20));
        //System.out.println((30>90)!);
        System.out.println(!!!!(30>90));

        System.out.println((9 * 3 / 9 + 1) * 3);
        System.out.println((27 / 9 + 1) * 3);

        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);
    }
}
