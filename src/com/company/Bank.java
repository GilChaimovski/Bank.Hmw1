package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{
    protected List<IAccount> AList ;

    public Bank() {
        AList = new ArrayList<IAccount>();


    }

    @Override
    public void OpenAccount(IAccount account) {
        if(!this.AList.contains(account)){
            this.AList.add(account);
            System.out.println("Account added");
        }
        

    }

    @Override
    public void CloseAccount(int accountNumber) {
        for (int i = 0; i < this.AList.size(); i++) {
            IAccount Check = this.AList.get(i);
            if (Check.GetAccountNumber() == accountNumber) {
                if (Check.GetCurrentBalance() < 0) {
                    System.out.println("You can't close an Account in Debt");

                } else {
                    this.AList.remove(i);
                    System.out.println("Account " + accountNumber + "Has been succesfully removed");
                }
            }

        }
    }


    @Override
    public List<IAccount> GetAllAccounts() {
        return AList;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List <IAccount> InDebtList= new ArrayList<IAccount>();
        for (int i=0;i<AList.size();i++){
            if(this.AList.get(i).GetCurrentBalance()<0){
                InDebtList.add(this.AList.get(i));
            }
        }
        return InDebtList;

    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List <IAccount> BalanceList= new ArrayList<IAccount>();
        for (int i=0;i<AList.size();i++){
            if(this.AList.get(i).GetCurrentBalance()>balanceAbove){
                BalanceList.add(this.AList.get(i));
            }
        }
        return BalanceList;
    }
}