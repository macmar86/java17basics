package main.org.maciek.section2;

public class Ex7 {

//exercise 7
    //7. Model a Car, create an instance of it, pass it to System.out.println() so that its properties will
    //be printed.

    private String brand = "Ferrari";
    private String type = "sport";
    private String colour = "red";
    private int doors = 2;

    public static void main(String[] args) {
        Ex7 car1 = new Ex7();
        System.out.println(car1.brand + ", " + car1.type + ", "+ car1.colour + ", " + car1.doors);
    }
}
