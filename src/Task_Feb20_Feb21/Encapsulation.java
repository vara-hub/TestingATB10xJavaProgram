package Task_Feb20_Feb21;

public class Encapsulation  {

public static void main(String[] args) {

    HDFCBank vara = new HDFCBank("vara",100);
    System.out.println(vara.getBal());

    boolean isCashier  = true;
    vara.setBal(5000, isCashier);
    System.out.println(vara.getBal());
    System.out.println(vara.bank_name);

}


}

class HDFCBank {


    private String name;
    private long bal;
    public String bank_name = "HDFC BANK";

    public HDFCBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the Bal");
        }
    }
}

/*
output:
100
5000
HDFC BANK
 */