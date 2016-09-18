package com.view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

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
public class ZhuFrame extends JFrame {
    JPanel contentPane;
    JMenuBar jMenuBar1 = new JMenuBar();
    JMenu jMenu1 = new JMenu();
    JMenuItem jMenuItem1 = new JMenuItem();
    JMenuItem jMenuItem2 = new JMenuItem();
    JButton btnShangwang = new JButton();
    JButton btnGuan = new JButton();
    JMenuItem jMenuItem3 = new JMenuItem();
    JButton btnTui = new JButton();
    public ZhuFrame() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Component initialization.
     *
     * @throws java.lang.Exception
     */
    private void jbInit() throws Exception {
    	

        ImageIcon img = new ImageIcon("C:\\Users\\Administrator\\Desktop\\2.jpg");
        JLabel bgLabel = new JLabel(img);
        this.getLayeredPane().add(bgLabel, new Integer(Integer.MIN_VALUE));
        bgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        
        ((JPanel)getContentPane()).setOpaque(false);
        
        contentPane = (JPanel) getContentPane();
        contentPane.setLayout(null);
        this.setJMenuBar(jMenuBar1);
        this.setResizable(false);
//        setSize(new Dimension(800, 600));
        setSize(new Dimension(1272, 707));
        setTitle("»¶Ó­¹âÁÙ!!");
        jMenu1.setText("²Ëµ¥");
        jMenuItem1.setText("ÉÏÍø³åÀË");
        jMenuItem1.addActionListener(new ZhuFrame_jMenuItem1_actionAdapter(this));
        jMenuItem2.setText("¹ÜÀíµÇÂ½");
        jMenuItem2.addActionListener(new ZhuFrame_jMenuItem2_actionAdapter(this));
        btnShangwang.setBounds(new Rectangle(65, 130, 87, 33));
        btnShangwang.setText("ÉÏÍø³åÀË");
        btnShangwang.addActionListener(new ZhuFrame_jButton1_actionAdapter(this));
        btnGuan.setBounds(new Rectangle(161, 131, 87, 32));
        btnGuan.setText("¹ÜÀíµÇÂ½");
        btnGuan.addActionListener(new ZhuFrame_jButton2_actionAdapter(this));
        jMenuItem3.setText("ÍË³ö");
        jMenuItem3.addActionListener(new ZhuFrame_jMenuItem3_actionAdapter(this));
        btnTui.setBounds(new Rectangle(270, 131, 87, 32));
        btnTui.setText("ÍË³ö");
        btnTui.addActionListener(new ZhuFrame_jButton3_actionAdapter(this));
        jMenuBar1.add(jMenu1);
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        contentPane.add(btnShangwang);
        contentPane.add(btnGuan);
        contentPane.add(btnTui);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       Dimension frameSize = this.getSize();
       if (frameSize.height > screenSize.height) {
           frameSize.height = screenSize.height;
       }
       if (frameSize.width > screenSize.width) {
           frameSize.width = screenSize.width;
       }
       this.setLocation((screenSize.width - frameSize.width) / 2,
                    (screenSize.height - frameSize.height) / 2);

    }
    
    

    public void jButton1_actionPerformed(ActionEvent e) {
         cus_login f=new cus_login();
         f.setVisible(true);
         this.setVisible(false);
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        wg_login f=new wg_login();
        f.setVisible(true);
                    this.setVisible(false);
    }

    public void jMenuItem1_actionPerformed(ActionEvent e) {
        cus_login f=new cus_login();
               f.setVisible(true);
         this.setVisible(false);
    }

    public void jMenuItem2_actionPerformed(ActionEvent e) {
        cus_login f=new cus_login();
                      f.setVisible(true);
         this.setVisible(false);
    }

    public void jMenuItem3_actionPerformed(ActionEvent e) {
System.exit(1);
    }

    public void jButton3_actionPerformed(ActionEvent e) {
System.exit(1);
    }
}


class ZhuFrame_jButton3_actionAdapter implements ActionListener {
    private ZhuFrame adaptee;
    ZhuFrame_jButton3_actionAdapter(ZhuFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class ZhuFrame_jMenuItem3_actionAdapter implements ActionListener {
    private ZhuFrame adaptee;
    ZhuFrame_jMenuItem3_actionAdapter(ZhuFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem3_actionPerformed(e);
    }
}


class ZhuFrame_jMenuItem2_actionAdapter implements ActionListener {
    private ZhuFrame adaptee;
    ZhuFrame_jMenuItem2_actionAdapter(ZhuFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem2_actionPerformed(e);
    }
}


class ZhuFrame_jMenuItem1_actionAdapter implements ActionListener {
    private ZhuFrame adaptee;
    ZhuFrame_jMenuItem1_actionAdapter(ZhuFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem1_actionPerformed(e);
    }
}


class ZhuFrame_jButton2_actionAdapter implements ActionListener {
    private ZhuFrame adaptee;
    ZhuFrame_jButton2_actionAdapter(ZhuFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class ZhuFrame_jButton1_actionAdapter implements ActionListener {
    private ZhuFrame adaptee;
    ZhuFrame_jButton1_actionAdapter(ZhuFrame adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}
