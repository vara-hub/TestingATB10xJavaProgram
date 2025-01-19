package ATB10x_04_Jan19;

public class Lab03_Largest3 {
    public static void main(String[] args) {
        //Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
        int a=12;
        int b=56;
        int c=89;
        String max= (a>b && a<c)?"Print A is max":(b>c)?"Print B is max":"Print C is max";
        System.out.println(max);
//output:
        //Print C is max


        //Another set of examples
     int a1=34;
     int b1=67;
     int c1=45;
        int max2= (a1>=b1)?((a1>=c1)?a1:c1):((b1>=c1)?b1:c1);
        System.out.println("The MAX number is " + max2);

        //output:
        //The MAX number is 67
    }
}
