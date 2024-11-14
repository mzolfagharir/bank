package org.example;

public class Swap {
    public static void transfer(TransactionAccount a1, TransactionAccount a2, int amount) {
        if (a1.getBalance() <= (amount - 50)) {
            System.out.println("At least 50 Toman shouldbe in your account");
            return;
        }

        a1.deposit(amount);
        System.out.println(a1.getOwner() + ":" + a1.getBalance());
        System.out.println(a2.getOwner() + ":" + a2.getBalance());
    }
    }
