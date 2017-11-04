package com.example.justinsnellings.wholesomewaves;

/**
 * Created by virensawant on 11/4/17.
 */

public class User {

    private double balance;
    private short numFamilyMembers;
    private String UID;

    public double getBalance() {
        return balance;
    }

    public short getNumFamilyMembers() {
        return numFamilyMembers;
    }

    public String getUID () {
        return UID;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setNumFamilyMembers(short numFamilyMembers) {
        this.numFamilyMembers = numFamilyMembers;
    }

    public void setUID (String UID) {
        this.UID = UID;
    }

    public User() {
        this.balance = 0;
        this.numFamilyMembers = 0;
        this.UID = "0000000000000000000000000000";
    }

    public User(double balance, short numFamilyMembers, String UID) {

        this.balance = balance;
        this.numFamilyMembers = numFamilyMembers;
        this.UID = UID;
    }
}
