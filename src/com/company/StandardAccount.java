package com.company;

public class StandardAccount implements IAccount{

    protected int accountNumber;
    protected double creditLimit;
    protected double currentBalance;

    public StandardAccount (int accountNumber, double creditLimit){
        this.accountNumber=accountNumber;
        this.creditLimit=creditLimit;
        this.currentBalance = 0;
        if (this.creditLimit > 0) {
            this.creditLimit=0;

        }
    }
    @Override
    public void Deposit(double amount) {
        this.currentBalance+=amount;

    }

    @Override
    public double Withdraw(double amount) {
        if (this.currentBalance-amount<this.creditLimit && this.currentBalance != this.creditLimit)
        {
            double draw =this.currentBalance +-this.creditLimit;
            this.currentBalance-=draw;
            return draw;
        }
        else
        {
            this.currentBalance-=amount;
            return amount;
        }


    }

    @Override
    public double GetCurrentBalance() {
        return this.currentBalance;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }
}
