package com.model;

import java.awt.BorderLayout;

import javax.swing.JPanel;

 
public class User extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
    private String username;//�û���
    private String password;//����
    private int popedomId;//Ȩ��id

    public User() {
        try {
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        setLayout(borderLayout1);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPopedomId(int popedomId) {
        this.popedomId = popedomId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPopedomId() {
        return popedomId;
    }
}
