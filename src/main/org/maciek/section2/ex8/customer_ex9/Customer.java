package main.org.maciek.section2.ex8.customer_ex9;

//exercise 9
//How can you ensure that a Customer instance can not be created without a name and an
//initial deposit?

public class Customer {

    private String name;
    private double deposit;

    public Customer(String name, long accountNum, double deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public String getName(){
        return name;
    }

    public double getDeposit() {
        return deposit;
    }

}
