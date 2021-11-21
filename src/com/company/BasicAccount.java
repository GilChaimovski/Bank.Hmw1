package com.company;

public class BasicAccount extends StandardAccount {
    protected double Withdrawlimit;
    public BasicAccount (int AccountNum, double Withdrawlimit){
        super(AccountNum,0);
        this.Withdrawlimit=Withdrawlimit;


    }
    @Override
    public double Withdraw(double amount) {
            if (this.currentBalance-amount<this.creditLimit && this.currentBalance != this.creditLimit )
            {
                double draw =this.currentBalance +-this.creditLimit;
                if (draw> this.Withdrawlimit) {
                    draw=this.Withdrawlimit;
                }
                this.currentBalance-=draw;
                return draw;
            }
            else
            {
                if (amount> this.Withdrawlimit)

                this.currentBalance-=Withdrawlimit;
                return Withdrawlimit;
            }

        }



    }

