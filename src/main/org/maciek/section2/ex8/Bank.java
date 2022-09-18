package main.org.maciek.section2.ex8;

import main.org.maciek.section2.ex8.customer_ex9.Customer;

public class Bank {

    //exercise 8
    //8. Model a Bank with the ability to access the vault. Model a BankManager and a Customer
    //too. Ensure the Customer can not access the Bank’s vault directly but the BankManager
    //can.

    public static void main(String[] args) {

        Vault v1 = new Vault();
        System.out.println("Depozyt: " + v1.getDepozyt() + " PLN");

        Employee e1 = new Employee();
        System.out.println("Pracownik: " + e1.bankManager);

        Customer c1 = new Customer("Jan Kowalski", 1432143429, 5000);
        System.out.println("Klient: " + c1.getName() + ", " + "depozyt: " + c1.getDeposit() + "PLN");



    }
}
