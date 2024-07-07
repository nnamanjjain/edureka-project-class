package com.njcodeing.Challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount("NjX1234","Naman Jain" );
        System.out.println(acc);

        acc.deposit(500);
        acc.withdrawal(1000);
        acc.withdrawal(100);
        acc.deposit(500);
        acc.withdrawal(900);
        acc.withdrawal(0);
        acc.withdrawal(-6);

    }
}
