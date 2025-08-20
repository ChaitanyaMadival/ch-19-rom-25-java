package com.hdfc.bankapp;

import com.hdfc.bankapp.bank.Bank;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Bank bank = new Bank();

        bank.setBankAccountNumber("2467CR7U277");
        bank.setAccountHolderName("Chaitanya N Madival");
        bank.setIfscCode("5427hdfc5639g");

        String bankAccountNumber = bank.getBankAccountNumber();
        String accountHolderName = bank.getAccountHolderName();
        String ifscCode = bank.getIfscCode();

        System.out.println("Bank account number: "+bankAccountNumber);
        System.out.println("Bank account holder name: "+accountHolderName);
        System.out.println("IFSC Code: "+ifscCode);

        System.out.println("main ended");
    }
}
