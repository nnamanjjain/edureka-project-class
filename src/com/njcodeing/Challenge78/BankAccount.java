package com.njcodeing.Challenge78;

public class BankAccount {
    private String accountNum;
    private String accountName;
    private double accountBal;

    public BankAccount(String accountNum, String accountName) {
        this.accountNum = accountNum;
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNum='" + accountNum + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
    public void deposit(double money){
        accountBal+=money;
        System.out.println("Your Account balance is Updated!!");
    }
    public void withdrawal(double money){
        if(money<=0) {
            System.out.println("Please Enter Valid Amount to Withdraw.");
        }else if(money<=accountBal){
                accountBal-=money;
                System.out.println("You have Withdraw Rs: "+money);
                System.out.println("Your Account balance is also now Updated!!");
        }else{
            System.out.println("Sorry!! Low Balance in Account!!");
        }
    }
}
