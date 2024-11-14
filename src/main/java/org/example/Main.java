package org.example;
public class Main {
    public static void main(String[] args) {
        TransactionAccount ali =   new TransactionAccount("Ali",10,2000);
        TransactionAccount reza =   new TransactionAccount("akbar",11,1000);
        Swap.transfer(ali,reza,5050);
    }
}
