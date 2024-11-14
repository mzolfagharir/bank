package org.example;
public class Account {
    private String owner;
    private int id;
    private int balance;

    public Account(String owner, int id, int balance) {
        this.owner = owner;
        this.id = id;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int balance){
        if(this.balance>=balance) this.balance += balance;
        else {
            System.out.println("Not enough money");
            return;
        }

    }    public void deposit(int balance){
        if(this.balance>=balance) this.balance -= balance;
        else System.out.println("Not enough money");
    }
}