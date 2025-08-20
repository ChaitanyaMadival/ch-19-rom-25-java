package com.meta.sacialmediaapp.instagram;

public class Instagram {
    private  int accountId;
    private  String accountHolderName;
    private  String statusOfAccount;


    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getStatusOfAccount() {
        return statusOfAccount;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setStatusOfAccount(String statusOfAccount) {
        this.statusOfAccount = statusOfAccount;
    }
}
