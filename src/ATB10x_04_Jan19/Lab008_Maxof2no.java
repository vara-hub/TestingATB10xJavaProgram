package ATB10x_04_Jan19;

public class Lab008_Maxof2no {
    public static void main(String[] args) {
        // Take inputs from CLI options

        String n1_string = args[0]; //32
        int num1 = Integer.parseInt(n1_string);


        String n2_string = args[1]; //89
        int num2 = Integer.parseInt(n2_string);

        int Max= (num1>num2)?num1:num2;
        System.out.println("The Maximum no  between "+num1+" and "+num2+" is " + Max);

        //output: The Maximum no  between 32 and 89 is 89
    }
}
