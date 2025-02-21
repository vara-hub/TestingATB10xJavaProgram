package Task_Feb20_Feb21;

public class Inheritance {

        public static void main(String[] args) {
            Child ch = new Child();
            ch.display1();
            ch.display();
        }
    }
    class Father
    {
        void display()
        {
            System.out.println("Parent class!");
        }
    }
    class Child extends Father
    {
        void display1()
        {
            System.out.println("Child class!");
            System.out.println("Son class!");
        }
    }

    /*
    output:
Child class!
Son class!
Parent class!
     */