package Feb2_task;

import java.util.Arrays;

public class Task1S {
    public static void main(String[] args) {
        String str1 = "Hello";                    // Creates or reuses "Hello" in the String pool
        String str2 = "Hello";                    // Reuses the "Hello" from the String pool
        String str3 = new String("Hello"); // Creates a new object on the heap

        System.out.println(str1 == str2);  // true, both refer to the same object in the pool
        System.out.println(str1 == str3);  // false, str3 is a new object in the heap
        System.out.println(str1.equals(str3));  // true, because the content is the same

        // Practice
        String name = "Sonal";
        String name2 = "Sonal Patel";

        // 1. charAt()
        System.out.println(name.charAt(3));

        // 2. concat()
        System.out.println(name.concat(" Patel"));

        // 3. contains()
        System.out.println(name.contains("Sonal"));

        // 4. equals()
        System.out.println(name.equals("Sonal"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        // 6. indexOf()
        System.out.println(name.indexOf('o'));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 9. split()

        String name4 = "Sonal Harish";
        String[] split = name4.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        System.out.println(split[1]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 13. replaceAll()
        System.out.println(name2.replaceAll(" ", " Harish "));

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. isEmpty()
        System.out.println(name.isEmpty());

        // 17. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Sonal"));

        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("sonal"));

        // 20. lastIndexOf()
        System.out.println(name.lastIndexOf("a"));

        // 21. repeat()
        System.out.println(name.repeat(2));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append("Patel");
        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);


    }
}
