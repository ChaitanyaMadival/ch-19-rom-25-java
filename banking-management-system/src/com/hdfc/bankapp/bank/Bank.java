package com.hdfc.bankapp.bank;

public class Bank {
    private String bankAccountNumber;
    private String accountHolderName;
    private String ifscCode;
    

    public  String getBankAccountNumber(){
        return  bankAccountNumber;
    }
    public  String getAccountHolderName(){
        return  accountHolderName;
    }
    public  String getIfscCode(){
        return  ifscCode;
    }

    public  void setBankAccountNumber(String bankAccountNumber){
        this.bankAccountNumber = bankAccountNumber;
    }
    public  void setAccountHolderName(String accountHolderName){
        this.accountHolderName =accountHolderName;
    }
    public void  setIfscCode(String ifscCode){
        this.ifscCode = ifscCode;
    }

}
