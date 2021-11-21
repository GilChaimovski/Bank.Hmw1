package com.company;

public class PremiumAccount extends StandardAccount{
    public PremiumAccount(int accountNumber){
        super(accountNumber,0);


    }
    @Override
    public double Withdraw(double amount) {
        this.currentBalance-=amount;
        return amount;

    }


}
