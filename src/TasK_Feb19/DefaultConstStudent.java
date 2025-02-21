package TasK_Feb19;

public class DefaultConstStudent {

    int age;

    // DefaultConstructor (No-argument)
    DefaultConstStudent()
    {
        age =10;
        System.out.println ("Default Constructor Student age is " + age);
    }

    public static void main(String[] args) {
        DefaultConstStudent obj = new DefaultConstStudent();
    }
}

//ouput:
//Default Constructor Student age is 10