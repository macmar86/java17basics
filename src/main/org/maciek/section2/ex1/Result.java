package main.org.maciek.section2.ex1;

public class Result {

//exercise1
    //1. Create a new Java project and try modeling a domain you’re comfortable with. It could be
    //something like: Sports, Business, Mathematics, Online Shopping, etc. For example, if you
    //modeled online shopping, you might create classes to represent: Customer, Product, Order,
    //etc. These classes would likely have properties and you may think

    public static void main(String[] args) {
        Person tomek = new Person("Tomek", "Kowalski", 34, 55);
        Person kasia = new Person("Kasia", "Gmurowska", 28, 70);
        Person suma = new Person();

        System.out.println(tomek);
        System.out.println(kasia);
        System.out.println("Suma czasów: " + suma.addTime(tomek.time, kasia.time) + "min");

    }
}
