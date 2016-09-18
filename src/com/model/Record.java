package com.model;

import java.awt.BorderLayout;

import javax.swing.JPanel;

 
public class Record extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
    public static int id;//�������
    public static  String cardId;//������id
    public static  String computerId;//�����id
    public static  String beginTime;//��ʼʱ��
    public static  String endTime;//����ʱ��
    public static  double balance;//���

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
