package com.model;

import java.awt.*;

import javax.swing.*;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class Popedom extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
    private int ID;//Ȩ��id
    private String popedomName;//Ȩ������

    public Popedom() {
        try {
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        setLayout(borderLayout1);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setPopedomName(String popedomName) {
        this.popedomName = popedomName;
    }

    public String getPopedomName() {
        return popedomName;
    }
}
