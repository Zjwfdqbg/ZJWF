package com.model;

import javax.swing.JPanel;

 
public class Computer extends JPanel  {

    private String id;//�����id
    private int onUse;//״̬
    private String notes;//������ͺŻ�ע

    public Computer() {
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setOnUse(int onUse) {
        this.onUse = onUse;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getId() {
        return id;
    }

    public int getOnUse() {
        return onUse;
    }

    public String getNotes() {
        return notes;
    }
}
