package TasK_Feb19;

public class ConstOverload
 {

    int x;
    String name;

    // Default constructor
    ConstOverload() {
        x = 0;
        name = "Checking";
        System.out.println("Default Constructor: x = " + x + ", name = " + name);
    }

    // Parameterized constructor with one parameter
    ConstOverload(int a) {
        x = a;
        name = "New";
        System.out.println("One-parameter Constructor: x = " + x + ", name = " + name);
    }

    // Parameterized constructor with two parameters
    ConstOverload(int a, String n) {
        x = a;
        name = n;
        System.out.println("Two-parameter Constructor: x = " + x + ", name = " + name);
    }
    public static void main(String[] args) {
        ConstOverload obj1 = new ConstOverload();
        ConstOverload obj2 = new ConstOverload(10);
        ConstOverload obj3 = new ConstOverload(30, "Vara");
    }
}

/*
output:
Default Constructor: x = 0, name = Checking
One-parameter Constructor: x = 10, name = New
Two-parameter Constructor: x = 30, name = Vara
 */