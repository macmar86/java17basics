package main.org.maciek.section2;

public class Ex6 {

 //exercise6
    //6. How can you create a method that can be called without creating an instance of its class?

    static void callWithoutInstance(){
        System.out.println("Metoda bez instancji");
    }

    public static void main(String[] args) {
        callWithoutInstance();
    }
}
