package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class BankAccount {
    //there is a relationship between the instance variables and the
    // objects they belong to: describe in english as 'the bank account "has a" balance'
    //should consider this statement when creating your classes.
    private double balance;
    private int accountNo;
    private static int nextAccountNumber = 700;

    public BankAccount(double balance) {
        this.balance = balance;
        this.accountNo = nextAccountNumber;
        this.nextAccountNumber++;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean withdrawal(double amount ) {
        if(amount < this.balance && amount > 0) {
           this.balance = this.balance - amount;
        }
        return false;
    }

    public boolean deposit (double amount) {
        if(amount > 0) {
            this.balance = this.balance + amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNo=" + accountNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNo == that.accountNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo);
    }

    public static void main (String[] args) {
        BankAccount emmasAccount = new BankAccount(1000); /*this is calling the construcotr */
        System.out.println(emmasAccount);
        System.out.println(emmasAccount.withdrawal(50));
        System.out.println(emmasAccount);
//        BankAccount roycesAccount = emmasAccount;
        BankAccount roycesAccount = new BankAccount(1000);
        roycesAccount.withdrawal(50);
        System.out.println(emmasAccount);
        System.out.println(emmasAccount == roycesAccount);
    }
}
