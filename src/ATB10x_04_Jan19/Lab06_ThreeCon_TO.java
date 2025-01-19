package ATB10x_04_Jan19;

public class Lab06_ThreeCon_TO {
    public static void main(String[] args) {
        //  Finding the Largest Number , n1, n2, 3 => max(n1,n2,n3)

        // Step 1 : Find inputs /oupts
        // n1,n2,n3 -> data type -> int
        // o/p ->  int
        // 100,34,10 ->  100

        // Step 2 :  rough logic
//        n1 >= n2  -> Y1 :  N1
//        Y1 ->  n1 >= n3 : Y (n1) : N (n3)
//        N1 ->  n2 > n3  : Y (n2) : N (n3)

        int n1 = 2, n2 = 9, n3 = -11;

        //  100,34,10 ->  100

        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3) ;
        System.out.println("Largest Number: " + largest);

        //output
        // Largest Number: 9



//Age Calculation
        int age=32;
        System.out.println("The Age is " +age);

        // Adult, Minor, Senior
        //  Senior > 65,
        // Minor < 18
        // Adult > 18


        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println("The Person is " + result);

//output
        //The Age is 32
        //The Person is Adult
    }
}
