package com.company;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("123546548",9000,"Ravindu Sathsara","sathsara@gmail.com","0778953672");

        account1.checkBalance();
        account1.depositMoney(1000);
        account1.withdraw(2000);
        account1.checkAccInfo();

    }
}
