package com.model;

 
public class Card { 
    private String id;//������id
    private String MemberId;//��Աid
    private String password;//����
    private double balance;//���
    public Card() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMemberId(String MemberId) {

        this.MemberId = MemberId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getMemberId() {

        return MemberId;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

}
