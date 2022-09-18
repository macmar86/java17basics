package main.org.maciek.section2.ex8;

class Vault {
    //klasa "Class Vault" jest "package protected" więc nie jest widoczna przez klasę Customer, która znajduje się w innym folderze

     private double depozyt = 1000000000.12;

     public double getDepozyt() {
        return depozyt;
    }
}
