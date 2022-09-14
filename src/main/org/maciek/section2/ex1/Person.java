package main.org.maciek.section2.ex1;

public class Person {

//exercise1
    //1. Create a new Java project and try modeling a domain you’re comfortable with. It could be
    //something like: Sports, Business, Mathematics, Online Shopping, etc. For example, if you
    //modeled online shopping, you might create classes to represent: Customer, Product, Order,
    //etc. These classes would likely have properties and you may think

    private String firstName;
    private String lastName;
    int age;
    int time;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, int time) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.time = time;
    }

    public String toString(){
        return firstName + " " + lastName + ", " + "wiek: " + age + ", " + "czas: " + time +"min";
    }

    public int addTime(int t1, int t2){
        return t1 + t2;
    }


}
