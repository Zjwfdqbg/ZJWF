package com.model;

import java.awt.BorderLayout;

import javax.swing.JPanel;

 
public class Record extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
    public static int id;//消费序号
    public static  String cardId;//上网卡id
    public static  String computerId;//计算机id
    public static  String beginTime;//开始时间
    public static  String endTime;//结束时间
    public static  double balance;//余额

    public Record() {
        try {
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        setLayout(borderLayout1);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getCardId() {
        return cardId;
    }

    public String getComputerId() {
        return computerId;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public double getBalance() {
        return balance;
    }
}
