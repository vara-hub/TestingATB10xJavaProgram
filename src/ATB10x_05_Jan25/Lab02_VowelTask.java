package ATB10x_05_Jan25;
import java.util.Scanner;
public class Lab02_VowelTask {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2,
        // constants - 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the person");
        String word = sc.next();
        int vowel =0;
        int conletter=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
            {
                vowel++;
            }

            else
            {
                conletter++;
            }
        }
        System.out.println("Now Count the Vowel letters: "+vowel);
        System.out.println("Now Count the Consonant letters: "+conletter);


    }
}

//OUPUT:
//Enter the Name of the person
//varalakshmi
//Now Count the Vowel letters: 4
//Now Count the Consonant letters: 7


//Enter the Name of the person
//pramod
//Now Count the Vowel letters: 2
//Now Count the Consonant letters: 4