package com.view.Record;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.CardLayout;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import com.business.RecordBuiness; //����ҵ����
import com.model.Card;
import com.model.Record;
import com.business.CardBusiness;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.SystemColor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import java.awt.*;

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
public class RecordDome extends JFrame {
    int weiZhi = 0; //��¼��������ȡԪ�ص��±ꡣ
    ArrayList brr = RecordBuiness.select();
    JPanel contentPane;
    BorderLayout borderLayout1 = new BorderLayout();
    JSplitPane jSplitPane1 = new JSplitPane();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel jPanel1 = new JPanel();
    CardLayout cardLayout1 = new CardLayout();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JPanel jPanel5 = new JPanel();
    JPanel jPanel6 = new JPanel();
      DefaultMutableTreeNode gen = new DefaultMutableTreeNode("������Ϣ");
    JTree jTree1 = new JTree(gen);
    JTextField txtCardID = new JTextField();
    JTextField txtJQID = new JTextField();
    JTextField txtTime = new JTextField();
    JButton btnTian = new JButton();
    JButton jButton2 = new JButton();
    JEditorPane jEditorPane1 = new JEditorPane();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JTextField txtCardId = new JTextField();
    JButton jButton1 = new JButton();
    JButton jButton3 = new JButton();
    JLabel jLabel4 = new JLabel();
    JTextField txtXID = new JTextField();
    JTextField txtQID = new JTextField();
    JTextField txtShang = new JTextField();
    JButton btnXiou = new JButton();
    JButton jButton5 = new JButton();
    JLabel jLabel5 = new JLabel();
    JLabel jLabel6 = new JLabel();
    JLabel jLabel7 = new JLabel();
    JLabel jLabel8 = new JLabel();
    JTextField txtCardid = new JTextField();
    JTextField txtComputerid = new JTextField();
    JTextField txtStartTime = new JTextField();
    JTextField txtEndTime = new JTextField();
    JTextField txtYuE = new JTextField();
    JButton btnCha = new JButton();
    JButton jButton6 = new JButton();
    JLabel jLabel9 = new JLabel();
    JLabel jLabel10 = new JLabel();
    JLabel jLabel11 = new JLabel();
    JLabel jLabel12 = new JLabel();
    JLabel jLabel13 = new JLabel();
    JTextField txtKID = new JTextField();
    JTextField txtCID = new JTextField();
    JTextField txtSTime = new JTextField();
    JTextField txtETime = new JTextField();
    JTextField txtYu = new JTextField();
    JLabel jLabel14 = new JLabel();
    JLabel jLabel15 = new JLabel();
    JLabel jLabel16 = new JLabel();
    JLabel jLabel17 = new JLabel();
    JLabel jLabel18 = new JLabel();
    JPanel jPanel7 = new JPanel();
    JButton jButton4 = new JButton();
    JButton jButton7 = new JButton();
    JButton jButton8 = new JButton();
    JButton jButton9 = new JButton();
    JButton btnRTui = new JButton();
    public RecordDome() {
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
        this.getContentPane().setBackground(SystemColor.control);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(new Dimension(600, 400));
        setTitle("������Ϣ");
        jPanel1.setLayout(cardLayout1);
        jPanel2.setLayout(null);
        txtCardID.setBounds(new Rectangle(57, 46, 200, 30));
        txtCardID.addKeyListener(new RecordDome_txtCardID_keyAdapter(this));
        txtJQID.setBounds(new Rectangle(56, 99, 200, 33));
        txtJQID.addKeyListener(new RecordDome_txtJQID_keyAdapter(this));
        txtTime.setBounds(new Rectangle(59, 155, 198, 36));
        txtTime.addKeyListener(new RecordDome_txtTime_keyAdapter(this));
        btnTian.setBounds(new Rectangle(51, 247, 65, 26));
        btnTian.setText("��� ");
        btnTian.addActionListener(new RecordDome_btnTian_actionAdapter(this));
        jButton2.setBounds(new Rectangle(169, 247, 60, 25));
        jButton2.setText("ȡ��");
        jButton2.addActionListener(new RecordDome_jButton2_actionAdapter(this));
        jEditorPane1.setText("��ID");
        jEditorPane1.setBounds(new Rectangle(9, 46, 46, 33));
        jLabel1.setText("����ID");
        jLabel1.setBounds(new Rectangle(10, 100, 47, 31));
        jLabel2.setText("�ϻ�ʱ��");
        jLabel2.setBounds(new Rectangle(7, 154, 75, 39));
        jLabel3.setText(" Сʱ");
        jLabel3.setBounds(new Rectangle(257, 155, 40, 35));
        jPanel3.setLayout(null);
        txtCardId.setBounds(new Rectangle(96, 63, 173, 38));
        jButton1.setBounds(new Rectangle(57, 208, 64, 28));
        jButton1.setText("ɾ��");
        jButton1.addActionListener(new RecordDome_jButton1_actionAdapter(this));
        jButton3.setBounds(new Rectangle(186, 208, 62, 28));
        jButton3.setText("ȡ��");
        jButton3.addActionListener(new RecordDome_jButton3_actionAdapter(this));
        jLabel4.setToolTipText("");
        jLabel4.setText("��ID");
        jLabel4.setBounds(new Rectangle(10, 61, 82, 42));
        jTree1.addTreeSelectionListener(new
                                        RecordDome_jTree1_treeSelectionAdapter(this));
        jPanel4.setLayout(null);
        txtXID.setBounds(new Rectangle(56, 38, 209, 34));
        txtXID.addKeyListener(new RecordDome_txtXID_keyAdapter(this));
        txtQID.setBounds(new Rectangle(56, 95, 208, 32));
        txtQID.addKeyListener(new RecordDome_txtQID_keyAdapter(this));
        txtShang.setBounds(new Rectangle(57, 153, 202, 38));
        txtShang.addKeyListener(new RecordDome_txtShang_keyAdapter(this));
        btnXiou.setBounds(new Rectangle(52, 246, 65, 25));
        btnXiou.setText("�޸�");
        btnXiou.addActionListener(new RecordDome_btnXiou_actionAdapter(this));
        jButton5.setBounds(new Rectangle(180, 246, 66, 25));
        jButton5.setText("ȡ��");
        jButton5.addActionListener(new RecordDome_jButton5_actionAdapter(this));
        jLabel5.setText("��ID");
        jLabel5.setBounds(new Rectangle(4, 36, 50, 38));
        jLabel6.setText("����ID");
        jLabel6.setBounds(new Rectangle(4, 94, 51, 34));
        jLabel7.setText("�ϻ�ʱ��");
        jLabel7.setBounds(new Rectangle( -1, 155, 49, 36));
        jLabel8.setToolTipText("");
        jLabel8.setText("Сʱ ");
        jLabel8.setBounds(new Rectangle(261, 151, 47, 42));
        jPanel5.setLayout(null);
        txtCardid.setBounds(new Rectangle(71, 21, 194, 34));
        txtComputerid.setEditable(false);
        txtComputerid.setBounds(new Rectangle(71, 97, 193, 33));
        txtStartTime.setEditable(false);
        txtStartTime.setBounds(new Rectangle(71, 142, 192, 34));
        txtEndTime.setEditable(false);
        txtEndTime.setBounds(new Rectangle(71, 187, 191, 35));
        txtYuE.setEditable(false);
        txtYuE.setBounds(new Rectangle(72, 239, 190, 33));
        btnCha.setBounds(new Rectangle(70, 63, 64, 30));
        btnCha.setText("��ѯ");
        btnCha.addActionListener(new RecordDome_btnCha_actionAdapter(this));
        jButton6.setBounds(new Rectangle(197, 62, 64, 30));
        jButton6.setText("ȡ��");
        jButton6.addActionListener(new RecordDome_jButton6_actionAdapter(this));
        jLabel9.setText("��ID");
        jLabel9.setBounds(new Rectangle(8, 21, 62, 34));
        jLabel10.setText("����ID");
        jLabel10.setBounds(new Rectangle(2, 97, 55, 31));
        jLabel11.setText("�ϻ�ʱ��");
        jLabel11.setBounds(new Rectangle(4, 142, 57, 33));
        jLabel12.setText("�»�ʱ��");
        jLabel12.setBounds(new Rectangle(3, 188, 56, 32));
        jLabel13.setText("���");
        jLabel13.setBounds(new Rectangle(4, 242, 56, 31));
        jPanel6.setLayout(null);
        txtKID.setEditable(false);
        txtKID.setBounds(new Rectangle(80, 20, 187, 33));
        txtCID.setEditable(false);
        txtCID.setBounds(new Rectangle(81, 59, 187, 33));
        txtSTime.setEditable(false);
        txtSTime.setBounds(new Rectangle(81, 99, 184, 32));
        txtETime.setEditable(false);
        txtETime.setBounds(new Rectangle(81, 138, 186, 30));
        txtYu.setEditable(false);
        txtYu.setBounds(new Rectangle(81, 177, 188, 33));
        jLabel14.setText("��ID");
        jLabel14.setBounds(new Rectangle(10, 19, 68, 37));
        jLabel15.setText("����ID");
        jLabel15.setBounds(new Rectangle(10, 59, 66, 31));
        jLabel16.setText("�ϻ�ʱ��");
        jLabel16.setBounds(new Rectangle(9, 97, 71, 35));
        jLabel17.setText("�»�ʱ��");
        jLabel17.setBounds(new Rectangle(4, 138, 74, 30));
        jLabel18.setText("���");
        jLabel18.setBounds(new Rectangle(4, 178, 74, 36));
        jPanel7.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel7.setBounds(new Rectangle(40, 238, 238, 30));
        jButton4.setText(">>");
        jButton4.addActionListener(new RecordDome_jButton4_actionAdapter(this));
        jButton7.setText("<");
        jButton7.addActionListener(new RecordDome_jButton7_actionAdapter(this));
        jButton8.setText("<<");
        jButton8.addActionListener(new RecordDome_jButton8_actionAdapter(this));
        jButton9.setText(">");
        jButton9.addActionListener(new RecordDome_jButton9_actionAdapter(this));
        btnRTui.setBounds(new Rectangle(216, 266, 71, 26));
        btnRTui.setText("ȡ��");
        btnRTui.addActionListener(new RecordDome_btnRTui_actionAdapter(this));
        contentPane.add(jSplitPane1, java.awt.BorderLayout.CENTER);
        jSplitPane1.add(jScrollPane1, JSplitPane.LEFT);
        jScrollPane1.getViewport().add(jTree1);
        jSplitPane1.add(jPanel1, JSplitPane.RIGHT);
        jPanel1.add(jPanel2, "jPanel2");
        jPanel2.add(btnTian);
        jPanel2.add(jButton2);
        jPanel2.add(txtTime);
        jPanel2.add(txtJQID);
        jPanel2.add(txtCardID);
        jPanel2.add(jLabel1);
        jPanel2.add(jEditorPane1);
        jPanel2.add(jLabel2);
        jPanel2.add(jLabel3);
        jPanel3.add(txtCardId);
        jPanel3.add(jButton1);
        jPanel3.add(jButton3);
        jPanel3.add(jLabel4);
        jPanel1.add(jPanel4, "jPanel4");
        jPanel4.add(txtXID);
        jPanel4.add(txtQID);
        jPanel4.add(jButton5);
        jPanel4.add(btnXiou);
        jPanel4.add(jLabel5);
        jPanel4.add(jLabel6);
        jPanel4.add(txtShang);
        jPanel4.add(jLabel8);
        jPanel4.add(jLabel7);
        jPanel1.add(jPanel5, "jPanel5");
        jPanel5.add(txtCardid);
        jPanel5.add(txtComputerid);
        jPanel5.add(txtStartTime);
        jPanel5.add(txtEndTime);
        jPanel5.add(txtYuE);
        jPanel5.add(btnCha);
        jPanel5.add(jButton6);
        jPanel5.add(jLabel9);
        jPanel5.add(jLabel10);
        jPanel5.add(jLabel11);
        jPanel5.add(jLabel12);
        jPanel5.add(jLabel13);
        jPanel1.add(jPanel3, "jPanel3");
        DefaultMutableTreeNode Tian = new DefaultMutableTreeNode("���������Ϣ");
         gen.add(Tian);
        DefaultMutableTreeNode Shan = new DefaultMutableTreeNode("ɾ��������Ϣ");
           gen.add(Shan);
        DefaultMutableTreeNode Xiou = new DefaultMutableTreeNode("�޸�������Ϣ");
           gen.add(Xiou);
        DefaultMutableTreeNode Cha = new DefaultMutableTreeNode("������ѯ������Ϣ");
            gen.add(Cha);
        DefaultMutableTreeNode Cha1 = new DefaultMutableTreeNode("��ѯȫ��������Ϣ");
            gen.add(Cha1);
        jPanel1.add(jPanel6, "jPanel6");
        jPanel6.add(txtKID);
        jPanel6.add(txtCID);
        jPanel6.add(txtETime);
        jPanel6.add(txtYu);
        jPanel6.add(txtSTime);
        jPanel6.add(jLabel14);
        jPanel6.add(jLabel15);
        jPanel6.add(jLabel16);
        jPanel6.add(jLabel17);
        jPanel6.add(jLabel18);
        jPanel6.add(jPanel7);
        jPanel6.add(btnRTui);
        jPanel7.add(jButton8);
        jPanel7.add(jButton7);
        jPanel7.add(jButton9);
        jPanel7.add(jButton4);
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
    }

    public void btnTian_actionPerformed(ActionEvent e) {

        //�����û�������ѧԱ��Ϣ
        String CardID =(String) txtCardID.getText();
       String ComputerID = (String)txtJQID.getText() ;

        Date a=new Date();
         DateFormat df;
         df = DateFormat.getDateTimeInstance();
         String bs=df.format(a);
         int as =Integer.parseInt(txtTime.getText());
             Calendar cd =Calendar.getInstance();
             cd.add(Calendar.HOUR,as);
             Date td = cd.getTime();
             String xia=df.format(td);
             if (CardID.length() == 0 ||ComputerID.length()==0||as==0) {
                       javax.swing.JOptionPane.showMessageDialog(this,
                               "��ID�ͻ���ID����Ϊ�գ��ϻ�ʱ�䲻��Ϊ0��");
                       return;
                }
           else  if(!CardID.startsWith("C"))
    {javax.swing.JOptionPane.showMessageDialog(this,
             "��ID������Լ����");
                 return;
                }
            else   if(!ComputerID.startsWith("G"))
            {javax.swing.JOptionPane.showMessageDialog(this,
                        "����ID������Լ����");
                return;
            }
else{
       Card stu1 = new Card();
       //�����û�����Ҫ���ҵ�ѧԱ����.
             stu1.setId(CardID);
       //����ҵ���෽�������ؼ��������
           ArrayList arr = CardBusiness.select(stu1);
           for (int i = 0; i < arr.size(); i++) {
                       stu1 = (Card) arr.get(i);
                }
        double tall =stu1.getBalance();





        //��֤���Ժͻ����Ƿ���0��100֮���һ������
        //if (xHao!="Guest[0-9][0-9][0-9]")
           // throw new Exception();


        //�����֤ͨ����ʵ����һ��ѧԱ����,������ѧԱ���������
       Record temp = new Record();
        temp.setCardId(CardID);
        temp.setComputerId(ComputerID);
        temp.setBeginTime(bs);
        temp.setEndTime(xia);
        temp.setBalance(tall);
        RecordBuiness.insert(temp);
                javax.swing.JOptionPane.showMessageDialog(this,
            "��ӳɹ���");
    this.txtCardID.setText("");
this.txtJQID.setText("");
 this.txtTime.setText("");

  this.txtCardID.requestFocus();

}
    }

    public void jButton1_actionPerformed(ActionEvent e) {
        String id =(String)txtCardId.getText();
    if(!id.startsWith("C"))
       {javax.swing.JOptionPane.showMessageDialog(this,
             "��ID������Լ����");
                 return;
                }
else{
                            //��ѧ�ŷ�װ��һ��ʵ��������У������ڲ�ͬ�㴫������
                           Record stu = new Record();
                            stu.setCardId(id);

                            //ɾ��
                          RecordBuiness.delete(stu);
                                javax.swing.JOptionPane.showMessageDialog(this,
                        "ɾ���ɹ���");}
    }

    public void jTree1_valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode temp = (DefaultMutableTreeNode) jTree1.
                                         getLastSelectedPathComponent();
           //�õ�ѡ�еĽڵ�����
           String name=temp.toString();

           //����ѡ��Ĳ�ͬ��ʾ��ʽ�����еĿ�Ƭ
           if (name.equals("���������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel2");
           }else if(name.equals("ɾ��������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel3");
           }else if(name.equals("�޸�������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel4");
           }else if(name.equals("������ѯ������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel5");
           }else if(name.equals("��ѯȫ��������Ϣ")){
               this.cardLayout1.show(this.jPanel1, "jPanel6");
      }
    }

    public void txtXID_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                           txtQID.requestFocus();
            }
    }

    public void txtQID_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          {
            txtShang.requestFocus();
            }
    }

    public void txtShang_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          {
           btnXiou.requestFocus();
            }
    }

    public void txtCardID_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
          txtJQID.requestFocus();
            }
    }

    public void txtJQID_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                                       {
                                                 txtTime.requestFocus();
            }
    }

    public void txtTime_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
         {
          btnTian.requestFocus();
            }
    }

    public void btnXiou_actionPerformed(ActionEvent e) {
        String CardID =(String) txtXID.getText();
          String ComputerID = (String)txtQID.getText() ;

           Date a=new Date();
            DateFormat df;
            df = DateFormat.getDateTimeInstance();
            String bs=df.format(a);
            int as =Integer.parseInt(txtShang.getText());
                Calendar cd =Calendar.getInstance();
                cd.add(Calendar.HOUR,as);
                Date td = cd.getTime();
                String xia=df.format(td);
           if (CardID.length() == 0 ||ComputerID.length()==0||as==0) {
                                 javax.swing.JOptionPane.showMessageDialog(this,
                                         "��ID�ͻ���ID����Ϊ�գ��ϻ�ʱ�䲻��Ϊ0��");
                                 return;
                             }   else  if(!CardID.startsWith("C"))
       {javax.swing.JOptionPane.showMessageDialog(this,
                "��ID������Լ����");
                    return;
                   }
               else   if(!ComputerID.startsWith("G"))
               {javax.swing.JOptionPane.showMessageDialog(this,
                           "����ID������Լ����");
                   return;
               }

else{
          Card stu1 = new Card();
          //�����û�����Ҫ���ҵ�ѧԱ����.
                stu1.setId(CardID);
          //����ҵ���෽�������ؼ��������
              ArrayList arr = CardBusiness.select(stu1);
              for (int i = 0; i < arr.size(); i++) {
                          stu1 = (Card) arr.get(i);
                   }
           double tall =stu1.getBalance();





           //��֤���Ժͻ����Ƿ���0��100֮���һ������
           //if (xHao!="Guest[0-9][0-9][0-9]")
              // throw new Exception();


           //�����֤ͨ����ʵ����һ��ѧԱ����,������ѧԱ���������
          Record temp = new Record();
           temp.setCardId(CardID);
           temp.setComputerId(ComputerID);
           temp.setBeginTime(bs);
           temp.setEndTime(xia);
        temp.setBalance(tall);
        RecordBuiness.update(temp);
                 javax.swing.JOptionPane.showMessageDialog(this,
             "�޸ĳɹ���");
}
    }

    public void txtCardid_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                {
                 btnCha.requestFocus();
            }
    }

    public void btnCha_actionPerformed(ActionEvent e) {
        Record stu = new Record();
                         //�����û�����Ҫ���ҵĻ�ԱID��.
              String xingMing =(String) txtCardid.getText();
              //��ѧԱ������װ��һ��ʵ��������У������ڲ�ͬ�㴫�����ݡ�
              if(!xingMing.startsWith("C"))
       {javax.swing.JOptionPane.showMessageDialog(this,
             "��ID������Լ����");
                 return;
                }

                stu.setCardId(xingMing);

                         //����ҵ���෽�������ؼ��������
               ArrayList arr = RecordBuiness.select(stu);

                         //���û���κ�ѧԱ��¼
                         if (arr.isEmpty())
                         {javax.swing.JOptionPane.showMessageDialog(this,
         "��ID������Լ����");
            return;
            }

                         else {
                             //ѭ����ʾ��������ÿ��ѧԱ����Ϣ
                             System.out.println("\nһ��"+arr.size()+"���Ѽ�¼����Ϣ���£�");
                             for (int i = 0; i < arr.size(); i++) {
                                 stu = (Record) arr.get(i);

                          txtComputerid.setText(stu.getComputerId());
                             txtStartTime.setText( stu.getBeginTime());
                         txtEndTime.setText(stu.getEndTime());
                          txtYuE.setText( ""+ stu.getBalance());
                            }
                   }
    }

    public void jButton8_actionPerformed(ActionEvent e) {

                       weiZhi = 0;
                  Record stu = new Record();
                   stu = (Record) brr.get(weiZhi);
                      //��ƽ����ı����е�ֵ
                      this.txtKID.setText(stu.getCardId());
                      this.txtCID.setText(stu.getComputerId());
                   this.txtSTime.setText( stu.getBeginTime());
                this.txtETime.setText(stu.getEndTime());
                   this.txtYu.setText("" + stu.getBalance());
    }

    public void jButton7_actionPerformed(ActionEvent e) {


        weiZhi--;
         if (weiZhi < 0) //�ж��Ƿ��ǵ�һ����¼
            weiZhi = 0;
           Record stu = new Record();
           stu = (Record) brr.get(weiZhi);
                  //��ƽ����ı����е�ֵ
                  this.txtKID.setText(stu.getCardId());
                  this.txtCID.setText(stu.getComputerId());
               this.txtSTime.setText(stu.getBeginTime());
            this.txtETime.setText(stu.getEndTime());
               this.txtYu.setText("" + stu.getBalance());

    }

    public void jButton9_actionPerformed(ActionEvent e) {

        weiZhi++;
         if (weiZhi >(brr.size()-1)) //�ж��Ƿ������һ����¼
          weiZhi = brr.size()-1;
         Record stu = new Record();
      stu = (Record) brr.get(weiZhi);
                //��ƽ����ı����е�ֵ
                this.txtKID.setText(stu.getCardId());
                this.txtCID.setText(stu.getComputerId());
             this.txtSTime.setText( stu.getBeginTime());
          this.txtETime.setText(stu.getEndTime());
             this.txtYu.setText("" + stu.getBalance());

    }

    public void jButton4_actionPerformed(ActionEvent e) {

        weiZhi = brr.size() - 1;
           Record stu = new Record();
         stu = (Record) brr.get(weiZhi);
               //��ƽ����ı����е�ֵ
               this.txtKID.setText(stu.getCardId());
               this.txtCID.setText(stu.getComputerId());
            this.txtSTime.setText(stu.getBeginTime());
         this.txtETime.setText(stu.getEndTime());
            this.txtYu.setText("" + stu.getBalance());

    }

    public void jButton2_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void jButton5_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void jButton6_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void jButton3_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void btnRTui_actionPerformed(ActionEvent e) {
this.setVisible(false);
    }
}


class RecordDome_btnRTui_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_btnRTui_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnRTui_actionPerformed(e);
    }
}


class RecordDome_jButton3_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton3_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class RecordDome_jButton6_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton6_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton6_actionPerformed(e);
    }
}


class RecordDome_jButton5_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton5_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}


class RecordDome_jButton2_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton2_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class RecordDome_jButton4_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton4_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}


class RecordDome_jButton9_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton9_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton9_actionPerformed(e);
    }
}


class RecordDome_jButton7_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton7_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton7_actionPerformed(e);
    }
}


class RecordDome_jButton8_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton8_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton8_actionPerformed(e);
    }
}


class RecordDome_btnCha_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_btnCha_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnCha_actionPerformed(e);
    }
}


class RecordDome_btnXiou_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_btnXiou_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnXiou_actionPerformed(e);
    }
}


class RecordDome_txtJQID_keyAdapter extends KeyAdapter {
    private RecordDome adaptee;
    RecordDome_txtJQID_keyAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtJQID_keyPressed(e);
    }
}


class RecordDome_txtCardID_keyAdapter extends KeyAdapter {
    private RecordDome adaptee;
    RecordDome_txtCardID_keyAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtCardID_keyPressed(e);
    }
}


class RecordDome_txtShang_keyAdapter extends KeyAdapter {
    private RecordDome adaptee;
    RecordDome_txtShang_keyAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtShang_keyPressed(e);
    }
}


class RecordDome_txtQID_keyAdapter extends KeyAdapter {
    private RecordDome adaptee;
    RecordDome_txtQID_keyAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtQID_keyPressed(e);
    }
}


class RecordDome_txtXID_keyAdapter extends KeyAdapter {
    private RecordDome adaptee;
    RecordDome_txtXID_keyAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtXID_keyPressed(e);
    }
}


class RecordDome_jButton1_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_jButton1_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}


class RecordDome_jTree1_treeSelectionAdapter implements TreeSelectionListener {
    private RecordDome adaptee;
    RecordDome_jTree1_treeSelectionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void valueChanged(TreeSelectionEvent e) {
        adaptee.jTree1_valueChanged(e);
    }
}


class RecordDome_btnTian_actionAdapter implements ActionListener {
    private RecordDome adaptee;
    RecordDome_btnTian_actionAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnTian_actionPerformed(e);
    }
}


class RecordDome_txtTime_keyAdapter extends KeyAdapter {
    private RecordDome adaptee;
    RecordDome_txtTime_keyAdapter(RecordDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtTime_keyPressed(e);
    }
}
