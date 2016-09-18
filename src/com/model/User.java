package com.model;

import java.awt.BorderLayout;

import javax.swing.JPanel;

 
public class User extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
    private String username;//用户名
    private String password;//密码
    private int popedomId;//权限id

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
