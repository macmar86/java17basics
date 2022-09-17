package main.org.maciek.section2;

public class Ex5 {

    //exercise 5
    //5. Write a method that allows you to pass any number of Strings as parameter inputs without
    //using an array.

    public static void main(String[] args) {

       showInfo( "wzrost: 190cm", "waga: 90kg", "wiek: 30lat");
       showInfoVar("wzrost: 190cm", "waga: 90kg", "wiek: 30lat");
       addVar(1,2,3);

    }
    //przykład metody wyświetlającej argumenty
    public static void showInfo(String wzrost, String waga, String wiek){
        System.out.println("dane osoby: " + wzrost + ", " + waga + ", " + wiek);
    }

    //odp. metody varrgs:
    public static void showInfoVar(String... parameters){
        for (int i = 0; i < parameters.length; i++){
            System.out.println(parameters[i]);
        }
    }
    public static void addVar(int... num){
        for (int i =0; i < num.length; i++){
                System.out.println(num[i]);
            }

    }

}
