package com.company.account;

public class Homework11 {
//    Write a class called Account, which models a bank account of a customer.
//    The methods credit(amount) and debit(amount) add or subtract the given amount to the balance.
//    The method transferTo(anotherAccount, amount) transfers the given amount
//    from this Account to the given anotherAccount.

    public static void main(String[] args) {

        Account account1 = new Account("customer1", "Fred", 200);
        Account account2 = new Account("customer2", "Sarah", 120);

        account1.debit(20);
        System.out.println(account1.getCustomerName() + "'s balance is " + account1.getCustomerBalance());

        account2.credit(30);
        System.out.println(account2.getCustomerName() + "'s balance is " + account2.getCustomerBalance());


        account2.transferTo(account1, 40);
        System.out.println(account1.getCustomerName() + "'s balance is " + account1.getCustomerBalance());
        System.out.println(account2.getCustomerName() + "'s balance is " + account2.getCustomerBalance());
    }

}
