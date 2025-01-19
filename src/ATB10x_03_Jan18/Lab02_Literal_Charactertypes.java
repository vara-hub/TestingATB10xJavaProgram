package ATB10x_03_Jan18;

public class Lab02_Literal_Charactertypes {
    public static void main(String[] args) {

        // Characters Literals
        char c1 = 'A';
        // char c2 = "A"; // String - bunch of char(multiple chars)
        char c2 = 'B';
        char c3 = '*';
        char c4 = '_';
        char c5 = '8';
        char c6 = '%';
        char c7 = '(';
        char c8 = ' '; // blank space

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
        System.out.println("sarankarthik");
        System.out.println("saran1" + new_line + "karthik");
        System.out.println("saran2" + tab_line +  "karthik");
        System.out.println("saran3"+ back_space +  "karthik");
        System.out.println("saran4" + carriage_return + "karthik");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (universal code)
        System.out.println(c10);
        char ruppes = '₹';
        System.out.println("pramod has "+ruppes+10);


        //Unicode characters
        char c11  = '\u1F60';
        char c12 = '\u0041';
        System.out.println(c11);
        System.out.println(c12);

        //Octal Characters
        char octal = '\101'; // Octal value for 'A'
        System.out.println(octal);

        //ASCII characters
        char ch2 = 65; // ASCII value for 'A'
        System.out.println(ch2);

        char ch3434 = '3';
        System.out.println(ch3434);
    }
}
