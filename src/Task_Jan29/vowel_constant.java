package Task_Jan29;

import java.util.Scanner;

public class vowel_constant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the letter to check whether its vowel or constant");
        char n=sc.next().charAt(0);
        n = Character.toLowerCase(n);

        if(n=='a'|| n=='e'|| n=='i'|| n=='o'||n=='u'){
            System.out.println("This character is Vowels " +n);
        }
        else{
            System.out.println("This character is Consonants " +n);
        }

    }
}


//output:
//Enter the letter to check whether its vowel or constant
//F
//This character is Consonants f

//Enter the letter to check whether its vowel or constant
//a
//This character is Vowels a