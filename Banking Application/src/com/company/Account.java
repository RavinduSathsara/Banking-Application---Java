package com.company;

public class Account {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(String number, double balance, String name , String email, String phoneNumber){
            this.number = number;
            this.balance = balance;
            this.name = name;
            this.email= email;
            this.phoneNumber = phoneNumber;
    }

    public void depositMoney(double depositeMoney){
        this.balance += depositeMoney;
        System.out.println("Deposit is Sucessful , New Balance is "+ this.balance);
    }

    public void withdraw(double withdrowMoney){
        if (this.balance - withdrowMoney < 0){
            System.out.println("Withdraw Unsuccessful , "+ this.balance + " is left");
        }else {
            this.balance -= withdrowMoney;
            System.out.println("Withdrow sucessfull,  Current Balance is " + this.balance);
        }
    }
    public void checkBalance(){
        System.out.println("Your Account Balance is "+ this.balance );
    }
    public void checkAccInfo(){
        System.out.println("*************Better Money Soul *********************");
        System.out.println("Account user Name is        : "+this.name);
        System.out.println("User Account Number is      : "+this.number);
        System.out.println("User Email Adress is        : "+this.email);
        System.out.println("User Mobile phone No is     : "+this.phoneNumber);
        System.out.println("Current Account Balance is  : "+this.balance);
        System.out.println("*****************************************************");
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
