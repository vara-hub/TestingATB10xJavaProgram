package Task_Feb20_Feb21;

public class Poly_overload {
    public static void main(String[] args) {
        Addition ad = new Addition();
        ad.add(12,34,88, 101);
    }
}

class Addition
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }

    void add(int a,int b,int c, int d)
    {
       // @overload
        int sum=a+b+c+d;
        System.out.println("total sum = " +sum);
    }


}

/*
output:
total sum = 235
 */