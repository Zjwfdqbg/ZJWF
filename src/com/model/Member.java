package com.model;

import java.awt.BorderLayout;

import javax.swing.JPanel;
 
public class Member extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
    private String id;//��Աid
    private String myName;//����
    private String birthDate;//�Ա�
    private String identitycard;//����
    private String phone;//���֤��
    public Member() {
        try {
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        setLayout(borderLayout1);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getMyName() {
        return myName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public String getPhone() {
        return phone;
    }

}
