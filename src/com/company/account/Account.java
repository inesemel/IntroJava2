package com.company.account;

public class Account {

    private String customerID;
    private String customerName;
    private int customerBalance;

    public Account(String customerID, String customerName, int customerBalance) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerBalance = customerBalance;
    }

    public void credit (int credit){
        customerBalance = customerBalance + credit;
    }

    public void debit (int debit){
        customerBalance = customerBalance - debit;
    }

    public int getCustomerBalance() {
        return customerBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void transferTo(Account customerNameTransferTo, int amount){
        this.debit(amount);
        customerNameTransferTo.credit(amount);
    }
}
