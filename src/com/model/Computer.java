package com.model;

import javax.swing.JPanel;

 
public class Computer extends JPanel  {

    private String id;//计算机id
    private int onUse;//状态
    private String notes;//计算机型号或备注

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
