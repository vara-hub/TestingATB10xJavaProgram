package ATB10x_04_Jan19;

public class Lab02_In_de {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);  //output is 34
        System.out.println(a); //output is 13

        int b = 20;
        System.out.println(--b + b++ + b--); //output is 58
        System.out.println(b); //output is 19


    }
}
