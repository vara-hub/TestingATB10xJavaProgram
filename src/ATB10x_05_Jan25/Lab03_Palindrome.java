package ATB10x_05_Jan25;
import java.util.Scanner;
public class Lab03_Palindrome {
    public static void main(String[] args) {
        //Palindrome of String (chatAt()) - naman, →
        // reverse - naman , madam ( string = rev(str)



        Scanner word = new Scanner(System.in);
        System.out.println("Enter the name to verify palindrome");
        String name = word.next();
        String rev ="";
        for(int i=name.length()-1;i>=0;i--)
        {
            rev = rev +name.charAt(i);
        }
        if(name.equals(rev))
        {
            System.out.println("This name contains palindrome: "+rev);
        }
        else
        {
            System.out.println("This name is not a palindrome: "+rev);
        }
    }
}

//OUPPUT:
//Enter the name to verify palindrome
//naman
//This name contains palindrome: naman

//Enter the name to verify palindrome
//madam
//This name contains palindrome: madam

//Enter the name to verify palindrome
//saran
//This name is not a palindrome: naras