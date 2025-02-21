package Task_Feb20_Feb21;



public class Abstraction {

    public static void main(String[] args) {
        MyBook PrintBook = new MyBook("Harry Potter", "J.k. Rowling", 120);
        PrintBook.getdetails();
    }
}

abstract class Book {
    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getdetails();
}

class MyBook extends Book {
    public MyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    void getdetails() {
        System.out.println("Name:"+name+ " \n Author :" +author+ " \n  price:" +price);
    }

}

/*
output:
Name:Harry Potter
 Author :J.k. Rowling
  price:120.0
 */