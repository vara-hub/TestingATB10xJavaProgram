package TasK_Feb19;

public class ParamContStudent {

        int x;

        // Parameterized constructor
        ParamContStudent(int value)
        {
            x = value;
            System.out.println("Parameterized Constructor value of x is " + x);
        }

        public static void main(String[] args) {
            ParamContStudent obj = new ParamContStudent(50);
        }
    }

//output:
//Parameterized Constructor value of x is 50