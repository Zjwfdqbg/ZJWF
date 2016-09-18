package com.view.Computer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import java.awt.CardLayout;
import javax.swing.tree.DefaultMutableTreeNode;

import com.model.Computer;
import com.business.ComBusiness;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JToggleButton;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerAdapter;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import java.awt.*;


public class ComputerDome extends JFrame {
    int weiZhi = 0; //��¼��������ȡԪ�ص��±ꡣ
    ArrayList arr = ComBusiness.select();
    JPanel contentPane;
    BorderLayout borderLayout1 = new BorderLayout();
    JSplitPane jSplitPane1 = new JSplitPane();
    JScrollPane jScrollPane1 = new JScrollPane();
       DefaultMutableTreeNode gen = new DefaultMutableTreeNode("�������Ϣ����");
    JTree jTree1 = new JTree(gen);
    JPanel jPanel1 = new JPanel();
    CardLayout cardLayout1 = new CardLayout();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JPanel jPanel5 = new JPanel();
    JPanel jPanel6 = new JPanel();
    JTextField txtId = new JTextField();
    JTextField txtBei = new JTextField();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JButton btnTian = new JButton();
    JButton jButton2 = new JButton();
    JTextField txtId1 = new JTextField();
    JLabel jLabel4 = new JLabel();
    JButton btnShan = new JButton();
    JButton jButton3 = new JButton();
    JTextField txtID = new JTextField();
    JTextField txtBeiZhu = new JTextField();
    JLabel jLabel5 = new JLabel();
    JLabel jLabel6 = new JLabel();
    JLabel jLabel7 = new JLabel();
    JButton jButton1 = new JButton();
    JButton jButton4 = new JButton();
    JTextField txtJQID = new JTextField();
    JTextField txtJQZhuang = new JTextField();
    JTextField txtJQBei = new JTextField();
    JToggleButton btnCha = new JToggleButton();
    JButton jButton5 = new JButton();
    JLabel jLabel8 = new JLabel();
    JLabel jLabel9 = new JLabel();
    JLabel jLabel10 = new JLabel();
    JTextField txtJID = new JTextField();
    JTextField txtJZhuang = new JTextField();
    JTextField txtJBei = new JTextField();
    JLabel jLabel11 = new JLabel();
    JLabel jLabel12 = new JLabel();
    JLabel jLabel13 = new JLabel();
    JPanel jPanel7 = new JPanel();
    JButton jButton6 = new JButton();
    JButton jButton7 = new JButton();
    JButton jButton8 = new JButton();
    JButton jButton9 = new JButton();
    JComboBox txtZhuan = new JComboBox();
    JComboBox txtZhuangTai = new JComboBox();
    JButton txtCTui = new JButton();

    public ComputerDome() {
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
        contentPane = (JPanel) getContentPane();
        contentPane.setLayout(borderLayout1);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(new Dimension(600, 400));
        setTitle("�������Ϣ����");
        jPanel1.setLayout(cardLayout1);
        jPanel2.setLayout(null);
        txtId.setBounds(new Rectangle(73, 48, 186, 31));
        txtBei.setBounds(new Rectangle(74, 164, 184, 32));
        txtBei.addKeyListener(new ComputerDome_txtBei_keyAdapter(this));
        jLabel1.setText("����ID");
        jLabel1.setBounds(new Rectangle(5, 49, 66, 34));
        jLabel2.setText("״̬");
        jLabel2.setBounds(new Rectangle(10, 104, 62, 33));
        jLabel3.setText("��ע");
        jLabel3.setBounds(new Rectangle(13, 164, 54, 31));
        btnTian.setBounds(new Rectangle(38, 244, 79, 25));
        btnTian.setText("���");
        btnTian.addActionListener(new ComputerDome_btnTian_actionAdapter(this));
        jButton2.setBounds(new Rectangle(151, 244, 78, 25));
        jButton2.setText("ȡ��");
        jButton2.addActionListener(new ComputerDome_jButton2_actionAdapter(this));
        jTree1.addTreeSelectionListener(new
                ComputerDome_jTree1_treeSelectionAdapter(this));
        jPanel3.setLayout(null);
        txtId1.setBounds(new Rectangle(77, 68, 201, 35));
        txtId1.addKeyListener(new ComputerDome_txtId1_keyAdapter(this));
        jLabel4.setText("����ID");
        jLabel4.setBounds(new Rectangle(7, 69, 61, 37));
        btnShan.setBounds(new Rectangle(40, 206, 71, 25));
        btnShan.setText("ɾ��");
        btnShan.addActionListener(new ComputerDome_btnShan_actionAdapter(this));
        jButton3.setBounds(new Rectangle(163, 206, 71, 25));
        jButton3.setText("ȡ��");
        jButton3.addActionListener(new ComputerDome_jButton3_actionAdapter(this));
        jPanel4.setLayout(null);
        txtID.setBounds(new Rectangle(76, 43, 197, 34));
        txtBeiZhu.setBounds(new Rectangle(76, 163, 195, 30));
        jLabel5.setText("����ID");
        jLabel5.setBounds(new Rectangle(10, 45, 64, 32));
        jLabel6.setText("״̬");
        jLabel6.setBounds(new Rectangle(10, 104, 60, 29));
        jLabel7.setText("��ע");
        jLabel7.setBounds(new Rectangle(10, 163, 67, 29));
        jButton1.setBounds(new Rectangle(39, 240, 69, 25));
        jButton1.setText("�޸� ");
        jButton1.addActionListener(new ComputerDome_jButton1_actionAdapter(this));
        jButton4.setBounds(new Rectangle(159, 241, 69, 24));
        jButton4.setText("ȡ��");
        jButton4.addActionListener(new ComputerDome_jButton4_actionAdapter(this));
        jPanel5.setLayout(null);
        txtJQID.setBounds(new Rectangle(78, 36, 183, 33));
        txtJQZhuang.setEditable(false);
        txtJQZhuang.setBounds(new Rectangle(79, 103, 182, 33));
        txtJQBei.setEditable(false);
        txtJQBei.setBounds(new Rectangle(78, 156, 180, 33));
        btnCha.setText("��ѯ");
        btnCha.setBounds(new Rectangle(66, 74, 66, 25));
        btnCha.addActionListener(new ComputerDome_btnCha_actionAdapter(this));
        jButton5.setBounds(new Rectangle(162, 74, 71, 25));
        jButton5.setText("ȡ��");
        jButton5.addActionListener(new ComputerDome_jButton5_actionAdapter(this));
        jLabel8.setText("����ID");
        jLabel8.setBounds(new Rectangle(17, 36, 58, 32));
        jLabel9.setText("״̬");
        jLabel9.setBounds(new Rectangle(16, 103, 57, 32));
        jLabel10.setText("��ע");
        jLabel10.setBounds(new Rectangle(19, 154, 48, 34));
        jPanel6.setLayout(null);
        txtJID.setEditable(false);
        txtJID.setBounds(new Rectangle(76, 42, 192, 31));
        txtJZhuang.setEditable(false);
        txtJZhuang.setBounds(new Rectangle(77, 99, 191, 28));
        txtJBei.setEditable(false);
        txtJBei.setBounds(new Rectangle(77, 152, 191, 30));
        jLabel11.setText("����ID");
        jLabel11.setBounds(new Rectangle(16, 43, 55, 29));
        jLabel12.setText("״̬");
        jLabel12.setBounds(new Rectangle(21, 99, 46, 27));
        jLabel13.setText("��ע");
        jLabel13.setBounds(new Rectangle(26, 153, 47, 29));
        jPanel7.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel7.setBounds(new Rectangle(38, 222, 225, 51));
        jButton6.setText(">>");
        jButton6.addActionListener(new ComputerDome_jButton6_actionAdapter(this));
        jButton7.setText(">");
        jButton7.addActionListener(new ComputerDome_jButton7_actionAdapter(this));
        jButton8.setText("<");
        jButton8.addActionListener(new ComputerDome_jButton8_actionAdapter(this));
        jButton9.setText("<<");
        jButton9.addActionListener(new ComputerDome_jButton9_actionAdapter(this));
        txtZhuan.setBounds(new Rectangle(76, 105, 181, 30));
        txtZhuangTai.setBounds(new Rectangle(80, 106, 188, 28));
        txtCTui.setBounds(new Rectangle(190, 274, 66, 25));
        txtCTui.setText("ȡ��");
        txtCTui.addActionListener(new ComputerDome_txtCTui_actionAdapter(this));
        jPanel6.setDoubleBuffered(false);
        contentPane.add(jSplitPane1, java.awt.BorderLayout.CENTER);
        jSplitPane1.add(jScrollPane1, JSplitPane.LEFT);
        jSplitPane1.add(jPanel1, JSplitPane.RIGHT);
        jPanel1.add(jPanel2, "jPanel2");
        jPanel2.add(txtBei);
        jPanel2.add(txtId);
        jPanel2.add(jLabel1);
        jPanel2.add(jLabel2);
        jPanel2.add(jLabel3);
        jPanel2.add(btnTian);
        jPanel2.add(jButton2);
        jPanel2.add(txtZhuan);
        jPanel1.add(jPanel3, "jPanel3");
        jPanel3.add(txtId1);
        jPanel3.add(jLabel4);
        jPanel3.add(btnShan);
        jPanel3.add(jButton3);
        jPanel1.add(jPanel4, "jPanel4");
        jPanel4.add(txtID);
        jPanel4.add(txtBeiZhu);
        jPanel4.add(jLabel5);
        jPanel4.add(jLabel6);
        jPanel4.add(jLabel7);
        jPanel4.add(jButton1);
        jPanel4.add(jButton4);
        jPanel4.add(txtZhuangTai);
        jPanel1.add(jPanel5, "jPanel5");
        jPanel5.add(txtJQID);
        jPanel5.add(txtJQZhuang);
        jPanel5.add(txtJQBei);
        jPanel5.add(btnCha);
        jPanel5.add(jButton5);
        jPanel5.add(jLabel8);
        jPanel5.add(jLabel9);
        jPanel5.add(jLabel10);
        jPanel1.add(jPanel6, "jPanel6");
        jPanel6.add(txtJID);
        jPanel6.add(txtJZhuang);
        jPanel6.add(txtJBei);
        jPanel6.add(jLabel11);
        jPanel6.add(jLabel12);
        jPanel6.add(jLabel13);
        jPanel6.add(jPanel7);
        jPanel6.add(txtCTui);
        jPanel7.add(jButton9);
        jPanel7.add(jButton8);
        jPanel7.add(jButton7);
        jPanel7.add(jButton6);
        jScrollPane1.getViewport().add(jTree1);
        DefaultMutableTreeNode Tian = new DefaultMutableTreeNode("��Ӽ������Ϣ");
  gen.add(Tian);
 DefaultMutableTreeNode Shan = new DefaultMutableTreeNode("ɾ���������Ϣ");
     gen.add(Shan);
  DefaultMutableTreeNode Xiou = new DefaultMutableTreeNode("�޸ļ������Ϣ");
     gen.add(Xiou);
   DefaultMutableTreeNode Cha = new DefaultMutableTreeNode("������ѯ�������Ϣ");
     gen.add(Cha);
   DefaultMutableTreeNode Cha1 = new DefaultMutableTreeNode("��ѯȫ���������Ϣ");
          gen.add(Cha1);
        jTree1.expandRow(0);
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
        this.txtZhuan.addItem("*********��ѡ��****");
    this.txtZhuan.addItem("����");
     this.txtZhuan.addItem("ʹ��");
             this.txtZhuangTai.addItem("*********��ѡ��****");
   this.txtZhuangTai.addItem("����");
       this.txtZhuangTai.addItem("ʹ��");
    }

    public void btnTian_actionPerformed(ActionEvent e) {
             String id=(String)txtId.getText();
       String Zhuan= (String)txtZhuan.getSelectedItem();
                    String Bei=(String)txtBei.getText();
                  Computer Tian=new Computer();
                  Tian.setId(id);
                  ArrayList arr=ComBusiness.select(Tian);
                  if(!arr.isEmpty())
                  {
                      javax.swing.JOptionPane.showMessageDialog(this,
           "�û���ID�Ѵ��ڣ�");
             return;

                  }
                    if (id.length() == 0 ||Bei.length()==0) {
                    javax.swing.JOptionPane.showMessageDialog(this,
                            "����ID��״̬����ע����Ϊ�գ�");
                    return;
                    }
                    else if(!id.startsWith("P"))
         {javax.swing.JOptionPane.showMessageDialog(this,
           "����ID������Լ����");
             return;
           }
else{
                    Computer stu = new Computer();
                     stu.setId(id);
                     if(Zhuan.equals("����"))
                     stu.setOnUse(0);
                else  if(Zhuan.equals("ʹ��"))
                    stu.setOnUse(1);
                     stu.setNotes(Bei);
                     ComBusiness.insert(stu);
                     javax.swing.JOptionPane.showMessageDialog(this,
                     "��ӳɹ���");
    this.txtId.setText("");

        this.txtBei.setText("");

         this.txtId.requestFocus();
}
    }

    public void jTree1_valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode temp = (DefaultMutableTreeNode) jTree1.
                                      getLastSelectedPathComponent();
        //�õ�ѡ�еĽڵ�����
        String name=temp.toString();

        if (name.equals("��Ӽ������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel2");
           }else if(name.equals("ɾ���������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel3");
           }else if(name.equals("�޸ļ������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel4");
           }else if(name.equals("������ѯ�������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel5");
           }else if(name.equals("��ѯȫ���������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel6");
      }
    }

    public void txtId_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
             {
        }
    }

    public void txtZhuan_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                  {
                                txtBei.requestFocus();
        }
    }

    public void txtBei_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                        {
                                      btnTian.requestFocus();
        }
    }

    public void btnShan_actionPerformed(ActionEvent e) {
        String id =(String)txtId1.getText();
         if(!id.startsWith("P"))
                 {javax.swing.JOptionPane.showMessageDialog(this,
                   "����ID������Լ����");
                     return;
                   }

                        //��ѧ�ŷ�װ��һ��ʵ��������У������ڲ�ͬ�㴫������
                       Computer stu = new  Computer();
                        stu.setId(id);

                        //ɾ��
                            ComBusiness.delete(stu);
                            javax.swing.JOptionPane.showMessageDialog(this,
                     "ɾ���ɹ���");
    }

    public void txtId1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          {
                                    btnShan.requestFocus();
        }
    }

    public void btnCha_actionPerformed(ActionEvent e) {
        Computer stu = new Computer();
                                //�����û�����Ҫ���ҵ�ѧԱ����.

                                String xingMing = (String)txtJQID.getText();
                                if(!xingMing.startsWith("P"))
              {javax.swing.JOptionPane.showMessageDialog(this,
                "����ID������Լ����");
                  return;
                }

                                //��ѧԱ������װ��һ��ʵ��������У������ڲ�ͬ�㴫�����ݡ�
                                stu.setId(xingMing);

                                //����ҵ���෽�������ؼ��������
                                ArrayList arr = ComBusiness.select(stu);

                                //���û���κ�ѧԱ��¼
                                if (arr.isEmpty())
                                    System.out.println("û���ҵ��κο���¼!");
                                else {
                                    //ѭ����ʾ��������ÿ��ѧԱ����Ϣ
                                    System.out.println("\nһ��"+arr.size()+"��������Ϣ���£�");
                                    for (int i = 0; i < arr.size(); i++) {
                                        stu = (Computer) arr.get(i);
                                         txtJQZhuang.setText(""+stu.getOnUse() );
                                         txtJQBei .setText(""+stu.getNotes());




                                    }
                   }
    }

    public void jButton9_actionPerformed(ActionEvent e) {
              weiZhi = 0;
               Computer stu = (Computer) arr.get(weiZhi);
               //��ƽ����ı����е�ֵ
               this.txtJID.setText("" + stu.getId());
               if(stu.getOnUse()==0)
               this.txtJZhuang.setText("����");
             else if(stu.getOnUse()==1)
               this.txtJZhuang.setText("ʹ��");
               this.txtJBei.setText("" + stu.getNotes());
    }

    public void jButton8_actionPerformed(ActionEvent e) {
        weiZhi--;
                if (weiZhi < 0) //�ж��Ƿ��ǵ�һ����¼
            weiZhi = 0;
        Computer stu = (Computer) arr.get(weiZhi);
          //��ƽ����ı����е�ֵ
          this.txtJID.setText("" + stu.getId());
          if(stu.getOnUse()==0)
          this.txtJZhuang.setText("����");
        else if(stu.getOnUse()==1)
          this.txtJZhuang.setText("ʹ����");
          this.txtJBei.setText("" + stu.getNotes());

    }

    public void jButton7_actionPerformed(ActionEvent e) {
        weiZhi++;
                   if (weiZhi >(arr.size()-1)) //�ж��Ƿ������һ����¼
          weiZhi = arr.size()-1;
      Computer stu = (Computer) arr.get(weiZhi);
   //��ƽ����ı����е�ֵ
   this.txtJID.setText("" + stu.getId());
   if(stu.getOnUse()==0)
   this.txtJZhuang.setText("����");
 else if(stu.getOnUse()==1)
   this.txtJZhuang.setText("ʹ����");
   this.txtJBei.setText("" + stu.getNotes());

    }

    public void jButton6_actionPerformed(ActionEvent e) {
        weiZhi = arr.size() - 1;
        Computer stu = (Computer) arr.get(weiZhi);
//��ƽ����ı����е�ֵ
this.txtJID.setText("" + stu.getId());
if(stu.getOnUse()==0)
this.txtJZhuang.setText("����");
else if(stu.getOnUse()==1)
this.txtJZhuang.setText("ʹ����");
this.txtJBei.setText("" + stu.getNotes());

    }

    public void jButton2_componentRemoved(ContainerEvent e) {
        this.setVisible(false);
    }

    public void jButton3_componentRemoved(ContainerEvent e) {
        this.setVisible(false);
    }

    public void jButton4_componentRemoved(ContainerEvent e) {
        this.setVisible(false);
    }

    public void jButton5_componentRemoved(ContainerEvent e) {
        this.setVisible(false);
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void jButton3_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void jButton4_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void jButton5_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void jButton1_actionPerformed(ActionEvent e) {
        String id=(String)txtID.getText();
  String Zhuan= (String)txtZhuangTai.getSelectedItem();
               String Bei=(String)txtBeiZhu.getText();
               if (id.length() == 0 ||Bei.length()==0) {
               javax.swing.JOptionPane.showMessageDialog(this,
                       "����ID��״̬����ע����Ϊ�գ�");
               return;
               }
              else if(!id.startsWith("P"))
           {javax.swing.JOptionPane.showMessageDialog(this,
             "����ID������Լ����");
               return;
             }

               Computer stu = new Computer();
                stu.setId(id);
                if(Zhuan.equals("����"))
                stu.setOnUse(0);
           else  if(Zhuan.equals("ʹ��"))
               stu.setOnUse(1);
                stu.setNotes(Bei);
                ComBusiness.update(stu);
                javax.swing.JOptionPane.showMessageDialog(this,
                     "�޸ĳɹ���");
    }

    public void txtCTui_actionPerformed(ActionEvent e) {
this.setVisible(false);
    }
}


class ComputerDome_txtCTui_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_txtCTui_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.txtCTui_actionPerformed(e);
    }
}


class ComputerDome_jButton1_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton1_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {

        adaptee.jButton1_actionPerformed(e);
    }
}


class ComputerDome_jButton5_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton5_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}


class ComputerDome_jButton4_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton4_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}


class ComputerDome_jButton3_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton3_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class ComputerDome_jButton2_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton2_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class ComputerDome_jButton6_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton6_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton6_actionPerformed(e);
    }
}


class ComputerDome_jButton7_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton7_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton7_actionPerformed(e);
    }
}


class ComputerDome_jButton8_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton8_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton8_actionPerformed(e);
    }
}


class ComputerDome_jButton9_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_jButton9_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton9_actionPerformed(e);
    }
}


class ComputerDome_btnCha_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_btnCha_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnCha_actionPerformed(e);
    }
}


class ComputerDome_txtId1_keyAdapter extends KeyAdapter {
    private ComputerDome adaptee;
    ComputerDome_txtId1_keyAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtId1_keyPressed(e);
    }
}


class ComputerDome_btnShan_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_btnShan_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnShan_actionPerformed(e);
    }
}


class ComputerDome_jTree1_treeSelectionAdapter implements TreeSelectionListener {
    private ComputerDome adaptee;
    ComputerDome_jTree1_treeSelectionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void valueChanged(TreeSelectionEvent e) {
        adaptee.jTree1_valueChanged(e);
    }
}


class ComputerDome_btnTian_actionAdapter implements ActionListener {
    private ComputerDome adaptee;
    ComputerDome_btnTian_actionAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnTian_actionPerformed(e);
    }
}


class ComputerDome_txtBei_keyAdapter extends KeyAdapter {
    private ComputerDome adaptee;
    ComputerDome_txtBei_keyAdapter(ComputerDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtBei_keyPressed(e);
    }
}

