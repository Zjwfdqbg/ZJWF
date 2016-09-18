package com.view.Member;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;

import com.model.Member;
import com.business.MemberBusiness;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.BorderFactory;
import java.awt.*;


public class MemberDome extends JFrame {
    int weiZhi = 0; //��¼��������ȡԪ�ص��±ꡣ
    ArrayList arr = MemberBusiness.select();
    JPanel contentPane;
    BorderLayout borderLayout1 = new BorderLayout();
    JSplitPane jSplitPane1 = new JSplitPane();
    JScrollPane jScrollPane1 = new JScrollPane();
        DefaultMutableTreeNode gen = new DefaultMutableTreeNode("��Ա��Ϣ");
    JTree jTree1 = new JTree(gen);
    JPanel jPanel1 = new JPanel();
    CardLayout cardLayout1 = new CardLayout();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JPanel jPanel5 = new JPanel();
    JPanel jPanel6 = new JPanel();
    JTextField txtID = new JTextField();
    JTextField txtMing = new JTextField();
    JTextField txtShengRI = new JTextField();
    JTextField txtShen = new JTextField();
    JTextField txtTall = new JTextField();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JButton btnTian = new JButton();
    JButton jButton2 = new JButton();
    JTextField txtID1 = new JTextField();
    JLabel jLabel6 = new JLabel();
    JButton btnShan = new JButton();
    JButton jButton3 = new JButton();
    JTextField txtID2 = new JTextField();
    JTextField txtMing1 = new JTextField();
    JTextField txtShengRi1 = new JTextField();
    JTextField txtShen1 = new JTextField();
    JTextField txtTall1 = new JTextField();
    JButton btnXiou = new JButton();
    JButton jButton4 = new JButton();
    JLabel jLabel7 = new JLabel();
    JLabel jLabel8 = new JLabel();
    JLabel jLabel9 = new JLabel();
    JLabel jLabel10 = new JLabel();
    JLabel jLabel11 = new JLabel();
    JTextField txtHID = new JTextField();
    JTextField txtHMing = new JTextField();
    JTextField txtHShengRi = new JTextField();
    JTextField txtHShen = new JTextField();
    JTextField txtHTall = new JTextField();
    JButton btnCha = new JButton();
    JButton jButton5 = new JButton();
    JLabel jLabel12 = new JLabel();
    JLabel jLabel13 = new JLabel();
    JLabel jLabel14 = new JLabel();
    JLabel jLabel15 = new JLabel();
    JLabel jLabel16 = new JLabel();
    JTextField txtYID = new JTextField();
    JTextField txtYMing = new JTextField();
    JTextField txtYShengRi = new JTextField();
    JTextField txtYShen = new JTextField();
    JTextField txtYTall = new JTextField();
    JLabel jLabel17 = new JLabel();
    JLabel jLabel18 = new JLabel();
    JLabel jLabel19 = new JLabel();
    JLabel jLabel20 = new JLabel();
    JLabel jLabel21 = new JLabel();
    JPanel jPanel7 = new JPanel();
    JButton btnYou = new JButton();
    JButton jButton6 = new JButton();
    JButton jButton7 = new JButton();
    JButton jButton8 = new JButton();
    JButton btnMTui = new JButton();
    public MemberDome() {
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
        setTitle("��Ա��Ϣ");
        jPanel1.setLayout(cardLayout1);
        jPanel2.setLayout(null);
        txtID.setBounds(new Rectangle(65, 25, 206, 31));
        txtID.addKeyListener(new MemberDome_txtID_keyAdapter(this));
        txtMing.setBounds(new Rectangle(64, 70, 205, 31));
        txtMing.addKeyListener(new MemberDome_txtMing_keyAdapter(this));
        txtShengRI.setBounds(new Rectangle(64, 117, 205, 30));
        txtShengRI.addKeyListener(new MemberDome_txtShengRI_keyAdapter(this));
        txtShen.setBounds(new Rectangle(66, 159, 205, 31));
        txtShen.addKeyListener(new MemberDome_txtShen_keyAdapter(this));
        txtTall.setBounds(new Rectangle(65, 199, 206, 30));
        txtTall.addKeyListener(new MemberDome_txtTall_keyAdapter(this));
        jLabel1.setText("��ԱID��");
        jLabel1.setBounds(new Rectangle(10, 24, 54, 33));
        jLabel2.setText("��Ա��");
        jLabel2.setBounds(new Rectangle(10, 70, 53, 30));
        jLabel3.setText("��Ա����");
        jLabel3.setBounds(new Rectangle(10, 117, 51, 29));
        jLabel4.setText("���֤");
        jLabel4.setBounds(new Rectangle(11, 159, 54, 30));
        jLabel5.setText("��ϵ��ʽ");
        jLabel5.setBounds(new Rectangle(10, 200, 53, 30));
        btnTian.setBounds(new Rectangle(47, 254, 76, 26));
        btnTian.setText("���");
        btnTian.addActionListener(new MemberDome_btnTian_actionAdapter(this));
        jButton2.setBounds(new Rectangle(178, 255, 74, 25));
        jButton2.setText("ȡ��");
        jButton2.addActionListener(new MemberDome_jButton2_actionAdapter(this));
        jPanel3.setLayout(null);
        txtID1.setBounds(new Rectangle(73, 75, 199, 34));
        jLabel6.setText("��ԱID");
        jLabel6.setBounds(new Rectangle( -1, 75, 67, 35));
        btnShan.setBounds(new Rectangle(40, 218, 81, 24));
        btnShan.setText("ɾ��");
        btnShan.addActionListener(new MemberDome_btnShan_actionAdapter(this));
        jButton3.setBounds(new Rectangle(158, 218, 85, 24));
        jButton3.setText("ȡ��");
        jButton3.addActionListener(new MemberDome_jButton3_actionAdapter(this));
        txtID1.addKeyListener(new MemberDome_txtID1_keyAdapter(this));
        jTree1.addTreeSelectionListener(new
                                        MemberDome_jTree1_treeSelectionAdapter(this));
        jPanel4.setLayout(null);
        txtID2.setBounds(new Rectangle(71, 30, 203, 33));
        txtID2.addKeyListener(new MemberDome_txtID2_keyAdapter(this));
        txtMing1.setBounds(new Rectangle(71, 71, 202, 31));
        txtMing1.addKeyListener(new MemberDome_txtMing1_keyAdapter(this));
        txtShengRi1.setBounds(new Rectangle(71, 115, 201, 31));
        txtShengRi1.addKeyListener(new MemberDome_txtShengRi1_keyAdapter(this));
        txtShen1.setBounds(new Rectangle(71, 153, 200, 30));
        txtShen1.addKeyListener(new MemberDome_txtShen1_keyAdapter(this));
        txtTall1.setBounds(new Rectangle(71, 197, 201, 32));
        txtTall1.addKeyListener(new MemberDome_txtTall1_keyAdapter(this));
        btnXiou.setBounds(new Rectangle(36, 255, 73, 26));
        btnXiou.setText("�޸�");
        btnXiou.addActionListener(new MemberDome_jButton1_actionAdapter(this));
        jButton4.setBounds(new Rectangle(173, 255, 75, 26));
        jButton4.setText("ȡ��");
        jButton4.addActionListener(new MemberDome_jButton4_actionAdapter(this));
        jLabel7.setText("��ԱID��");
        jLabel7.setBounds(new Rectangle(7, 30, 62, 32));
        jLabel8.setText("��Ա��");
        jLabel8.setBounds(new Rectangle(7, 71, 62, 30));
        jLabel9.setText("��Ա����");
        jLabel9.setBounds(new Rectangle(6, 116, 61, 29));
        jLabel10.setText("���֤");
        jLabel10.setBounds(new Rectangle(5, 153, 63, 29));
        jLabel11.setText("��ϵ��ʽ");
        jLabel11.setBounds(new Rectangle(7, 197, 62, 32));
        jPanel5.setLayout(null);
        txtHID.setBounds(new Rectangle(58, 25, 214, 31));
        txtHMing.setEditable(false);
        txtHMing.setBounds(new Rectangle(58, 98, 213, 31));
        txtHShengRi.setEditable(false);
        txtHShengRi.setBounds(new Rectangle(59, 138, 212, 32));
        txtHShen.setEditable(false);
        txtHShen.setBounds(new Rectangle(60, 181, 210, 30));
        txtHTall.setEditable(false);
        txtHTall.setBounds(new Rectangle(59, 226, 211, 32));
        btnCha.setBounds(new Rectangle(70, 66, 75, 27));
        btnCha.setText("��ѯ");
        btnCha.addActionListener(new MemberDome_btnCha_actionAdapter(this));
        jButton5.setBounds(new Rectangle(183, 66, 78, 27));
        jButton5.setText("ȡ��");
        jButton5.addActionListener(new MemberDome_jButton5_actionAdapter(this));
        jLabel12.setText("��ԱID��");
        jLabel12.setBounds(new Rectangle(3, 25, 52, 30));
        jLabel13.setText("��Ա��");
        jLabel13.setBounds(new Rectangle(3, 98, 54, 30));
        jLabel14.setText("��Ա����");
        jLabel14.setBounds(new Rectangle(5, 138, 48, 31));
        jLabel15.setText("���֤");
        jLabel15.setBounds(new Rectangle(5, 181, 53, 29));
        jLabel16.setText("��ϵ��ʽ");
        jLabel16.setBounds(new Rectangle(3, 226, 52, 31));
        jPanel6.setLayout(null);
        txtYID.setEditable(false);
        txtYID.setBounds(new Rectangle(75, 15, 193, 33));
        txtYMing.setEditable(false);
        txtYMing.setBounds(new Rectangle(74, 54, 193, 33));
        txtYShengRi.setEditable(false);
        txtYShengRi.setBounds(new Rectangle(72, 95, 191, 31));
        txtYShen.setEditable(false);
        txtYShen.setBounds(new Rectangle(74, 132, 191, 32));
        txtYTall.setEditable(false);
        txtYTall.setBounds(new Rectangle(74, 170, 192, 29));
        jLabel17.setText("��ԱID��");
        jLabel17.setBounds(new Rectangle(8, 20, 60, 32));
        jLabel18.setText("��Ա��");
        jLabel18.setBounds(new Rectangle(7, 61, 59, 27));
        jLabel19.setText("��Ա����");
        jLabel19.setBounds(new Rectangle(8, 95, 61, 30));
        jLabel20.setText("���֤");
        jLabel20.setBounds(new Rectangle(9, 133, 59, 27));
        jLabel21.setText("��ϵ��ʽ");
        jLabel21.setBounds(new Rectangle(9, 173, 62, 29));
        jPanel7.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel7.setBounds(new Rectangle(34, 225, 235, 49));
        btnYou.setText(">");
        btnYou.addActionListener(new MemberDome_jButton1_actionAdapter(this));
        jButton6.setText("<");
        jButton6.addActionListener(new MemberDome_jButton6_actionAdapter(this));
        jButton7.setText(">>");
        jButton7.addActionListener(new MemberDome_jButton7_actionAdapter(this));
        jButton8.setText("<<");
        jButton8.addActionListener(new MemberDome_jButton8_actionAdapter(this));
        btnMTui.setBounds(new Rectangle(203, 274, 70, 26));
        btnMTui.setText("ȡ��");
        btnMTui.addActionListener(new MemberDome_btnMTui_actionAdapter(this));
        contentPane.add(jSplitPane1, java.awt.BorderLayout.CENTER);
        jSplitPane1.add(jScrollPane1, JSplitPane.LEFT);
        jSplitPane1.add(jPanel1, JSplitPane.RIGHT);
        jPanel1.add(jPanel2, "jPanel2");
        jPanel2.add(txtID);
        jPanel2.add(txtMing);
        jPanel2.add(txtTall);
        jPanel2.add(txtShen);
        jPanel2.add(txtShengRI);
        jPanel2.add(jLabel1);
        jPanel2.add(jLabel2);
        jPanel2.add(jLabel3);
        jPanel2.add(jLabel5);
        jPanel2.add(jLabel4);
        jPanel2.add(btnTian);
        jPanel2.add(jButton2);
        jPanel1.add(jPanel3, "jPanel3");
        jPanel3.add(txtID1);
        jPanel3.add(jLabel6);
        jPanel3.add(btnShan);
        jPanel3.add(jButton3);
        jPanel1.add(jPanel4, "jPanel4");
        jPanel4.add(txtID2);
        jPanel4.add(txtMing1);
        jPanel4.add(txtShengRi1);
        jPanel4.add(txtShen1);
        jPanel4.add(txtTall1);
        jPanel4.add(btnXiou);
        jPanel4.add(jButton4);
        jPanel4.add(jLabel7);
        jPanel4.add(jLabel8);
        jPanel4.add(jLabel9);
        jPanel4.add(jLabel10);
        jPanel4.add(jLabel11);
        jPanel1.add(jPanel5, "jPanel5");
        jPanel5.add(txtHID);
        jPanel5.add(txtHMing);
        jPanel5.add(txtHShengRi);
        jPanel5.add(txtHShen);
        jPanel5.add(txtHTall);
        jPanel5.add(jButton5);
        jPanel5.add(jLabel12);
        jPanel5.add(jLabel13);
        jPanel5.add(jLabel14);
        jPanel5.add(jLabel15);
        jPanel5.add(jLabel16);
        jPanel5.add(btnCha);
        jPanel1.add(jPanel6, "jPanel6");
        jPanel6.add(txtYShen);
        jPanel6.add(txtYTall);
        jPanel6.add(jLabel17);
        jPanel6.add(jLabel18);
        jPanel6.add(jLabel19);
        jPanel6.add(jLabel20);
        jPanel6.add(jLabel21);
        jPanel6.add(jPanel7);
        jPanel7.add(jButton8);
        jPanel7.add(jButton6);
        jPanel7.add(btnYou);
        jPanel7.add(jButton7);
        jPanel6.add(txtYShengRi);
        jPanel6.add(txtYID);
        jPanel6.add(txtYMing);
        jPanel6.add(btnMTui);
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
    }

    public void btnTian_actionPerformed(ActionEvent e) {
        String id=(String)txtID.getText();
        String Ming=(String)txtMing.getText();
        String Shengri=(String)txtShengRI.getText();
       String shenfen=(String)txtShen.getText();//���֤
        String Tall=(String)txtTall.getText();
        Member Tian1=new Member();
        Tian1.setId(id);
      ArrayList Crr=MemberBusiness.select(Tian1);
      if(!Crr.isEmpty())
      {
          javax.swing.JOptionPane.showMessageDialog(this,
              "�û�Ա�Ѵ��ڣ�");
  return;

      }

        if(id.length()==0||Ming.length()==0||Shengri.length()==0||
         shenfen.length()==0||Tall.length()==0||id.length()==0){
            javax.swing.JOptionPane.showMessageDialog(this,
                     "��Ա��Ϣ����Ϊ�գ�");
        }

        else  if(!id.startsWith("U"))
      {javax.swing.JOptionPane.showMessageDialog(this,
       "��ԱID������Լ����");
      return;
  }   else  if( shenfen.length()==15||shenfen.length()==18)
  {javax.swing.JOptionPane.showMessageDialog(this,
   "���֤���Ϸ���");
  return;
  }else  if( Tall.length()!=8&&!Tall.startsWith("8"))
  {javax.swing.JOptionPane.showMessageDialog(this,
   "�绰���벻��ȷ��");
  return;
  }   else  if(Shengri.length()!=10)
  {javax.swing.JOptionPane.showMessageDialog(this,
   "���ղ���ȷ��");
  return;
  }



else{
        Member stu=new Member();
        stu.setId(id);
        stu.setMyName(Ming);
        stu.setBirthDate(Shengri);
        stu.setIdentitycard(shenfen);
        stu.setPhone(Tall);
        MemberBusiness.insert(stu);
        javax.swing.JOptionPane.showMessageDialog(this,
                     "��ӳɹ���");
    this.txtID.setText("");
    this.txtMing.setText("");
     this.txtShengRI.setText("");
     this.txtShen.setText("");
     this.txtTall.setText("");
      this.txtID.requestFocus();
}
    }

    public void txtID1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                        {
                         btnShan.requestFocus();
               }
    }

    public void jTree1_valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode temp = (DefaultMutableTreeNode) jTree1.
                                         getLastSelectedPathComponent();
           //�õ�ѡ�еĽڵ�����
           String name=temp.toString();

           //����ѡ��Ĳ�ͬ��ʾ��ʽ�����еĿ�Ƭ
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

    public void jButton1_actionPerformed(ActionEvent e) {
        String id=(String)txtID2.getText();
        String Ming=(String)txtMing1.getText();
        String Shengri=(String)txtShengRi1.getText();
       String shenfen=(String)txtShen1.getText();
        String Tall=(String)txtTall1.getText();
        if(id.length()==0||Ming.length()==0||Shengri.length()==0||
         shenfen.length()==0||Tall.length()==0||id.length()==0){
            javax.swing.JOptionPane.showMessageDialog(this,
                     "��Ա��Ϣ����Ϊ�գ�");
        }
        else{
        Member stu=new Member();
        stu.setId(id);
        stu.setMyName(Ming);
        stu.setBirthDate(Shengri);
        stu.setIdentitycard(shenfen);
        stu.setPhone(Tall);
        MemberBusiness.update(stu);
        javax.swing.JOptionPane.showMessageDialog(this,
                     "�޸ĳɹ���");}
    }

    public void btnShan_actionPerformed(ActionEvent e) {
        String id =(String)txtID1.getText();
     if(!id.startsWith("U"))
  {javax.swing.JOptionPane.showMessageDialog(this,
   "��ԱID������Լ����");
  return;
  }
                  else{        //��ѧ�ŷ�װ��һ��ʵ��������У������ڲ�ͬ�㴫������
                         Member stu = new Member();
                          stu.setId(id);

                          //ɾ��
                        MemberBusiness.delete(stu);
                              javax.swing.JOptionPane.showMessageDialog(this,
                        "ɾ���ɹ���");}

    }

    public void txtID_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
              {
                         txtMing.requestFocus();
               }
    }

    public void txtMing_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
               {
                              txtShengRI.requestFocus();
               }
    }

    public void txtShengRI_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                 {
                                txtShen.requestFocus();
               }
    }

    public void txtShen_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                       {
                                      txtTall.requestFocus();
               }
    }

    public void txtTall_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
               {
                btnTian.requestFocus();
               }
    }

    public void txtID2_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                     {
                                txtMing1.requestFocus();
               }
    }

    public void txtMing1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                      {
                                     txtShengRi1.requestFocus();
               }
    }

    public void txtShengRi1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                       {
                                      txtShen1.requestFocus();
               }
    }

    public void txtShen1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                          {
                                         txtTall1.requestFocus();
               }
    }

    public void txtTall1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
                      {
                       btnXiou.requestFocus();
               }
    }

    public void btnCha_actionPerformed(ActionEvent e) {
        Member stu = new Member();
                             //�����û�����Ҫ���ҵ�ѧԱ����.

                             String id = (String)txtHID.getText();
             if(!id.startsWith("U"))
             {javax.swing.JOptionPane.showMessageDialog(this,
               "��ԱID������Լ����");
                 return;
               }


                             //��ѧԱ������װ��һ��ʵ��������У������ڲ�ͬ�㴫�����ݡ�
                             stu.setId(id);

                             //����ҵ���෽�������ؼ��������
                             ArrayList arr = MemberBusiness.select(stu);

                             //���û���κ�ѧԱ��¼
                             if (arr.isEmpty())
                                 System.out.println("û���ҵ��κο���¼!");
                             else {
                                 //ѭ����ʾ��������ÿ��ѧԱ����Ϣ
                                 System.out.println("\nһ��"+arr.size()+"��������Ϣ���£�");
                                 for (int i = 0; i < arr.size(); i++) {
                                     stu = (Member) arr.get(i);
                                      txtHMing.setText(""+stu.getMyName() );
                                      txtHShengRi .setText(""+stu.getBirthDate());
                                     txtHShen.setText(""+stu.getIdentitycard());
                                     txtHTall.setText(""+stu.getPhone());


                                 }
                   }
    }

    public void jButton8_actionPerformed(ActionEvent e) {
             weiZhi = 0;
                 Member stu = (Member) arr.get(weiZhi);
                 //��ƽ����ı����е�ֵ
                 this.txtYID.setText("" + stu.getId());
                 this.txtYMing.setText(stu.getMyName());
                 this.txtYShengRi.setText("" + stu.getBirthDate());
                 this.txtYShen.setText("" + stu.getIdentitycard());
            this.txtYTall.setText("" + stu.getPhone());
    }

    public void jButton6_actionPerformed(ActionEvent e) {
        weiZhi--;
         if (weiZhi < 0) //�ж��Ƿ��ǵ�һ����¼
            weiZhi = 0;
        Member stu = (Member) arr.get(weiZhi);
              //��ƽ����ı����е�ֵ
              this.txtYID.setText("" + stu.getId());
              this.txtYMing.setText(stu.getMyName());
              this.txtYShengRi.setText("" + stu.getBirthDate());
              this.txtYShen.setText("" + stu.getIdentitycard());
         this.txtYTall.setText("" + stu.getPhone());

    }

    public void btnYou_actionPerformed(ActionEvent e) {
            weiZhi++;
              if (weiZhi >(arr.size()-1))
            weiZhi = arr.size()-1;
      Member stu = (Member) arr.get(weiZhi);
      //��ƽ����ı����е�ֵ
           this.txtYID.setText("" + stu.getId());
           this.txtYMing.setText(stu.getMyName());
           this.txtYShengRi.setText("" + stu.getBirthDate());
           this.txtYShen.setText("" + stu.getIdentitycard());
      this.txtYTall.setText("" + stu.getPhone());

    }

    public void jButton7_actionPerformed(ActionEvent e) {
        weiZhi = arr.size() - 1;
        Member stu = (Member) arr.get(weiZhi);
//��ƽ����ı����е�ֵ
     this.txtYID.setText("" + stu.getId());
     this.txtYMing.setText(stu.getMyName());
     this.txtYShengRi.setText("" + stu.getBirthDate());
     this.txtYShen.setText("" + stu.getIdentitycard());
this.txtYTall.setText("" + stu.getPhone());

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

    public void btnXiou_actionPerformed(ActionEvent e) {
        weiZhi++;
                   if (weiZhi >(arr.size()-1)) //
        weiZhi = arr.size() - 1;
        Member stu = (Member) arr.get(weiZhi);
//��ƽ����ı����е�ֵ
     this.txtYID.setText("" + stu.getId());
     this.txtYMing.setText(stu.getMyName());
     this.txtYShengRi.setText("" + stu.getBirthDate());
     this.txtYShen.setText("" + stu.getIdentitycard());
this.txtYTall.setText("" + stu.getPhone());

    }

    public void btnMTui_actionPerformed(ActionEvent e) {
this.setVisible(false);
    }
}


class MemberDome_btnMTui_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_btnMTui_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnMTui_actionPerformed(e);
    }
}


class MemberDome_jButton4_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_jButton4_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}


class MemberDome_jButton5_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_jButton5_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}


class MemberDome_jButton3_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_jButton3_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class MemberDome_jButton7_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_jButton7_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton7_actionPerformed(e);
    }
}


class MemberDome_jButton2_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_jButton2_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class MemberDome_jButton1_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_jButton1_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {

        adaptee.btnXiou_actionPerformed(e);
    }
}


class MemberDome_jButton6_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_jButton6_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton6_actionPerformed(e);
    }
}


class MemberDome_jButton8_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_jButton8_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton8_actionPerformed(e);
    }
}


class MemberDome_btnCha_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_btnCha_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnCha_actionPerformed(e);
    }
}


class MemberDome_txtTall1_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtTall1_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtTall1_keyPressed(e);
    }
}


class MemberDome_txtShen1_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtShen1_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtShen1_keyPressed(e);
    }
}


class MemberDome_txtShengRi1_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtShengRi1_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtShengRi1_keyPressed(e);
    }
}


class MemberDome_txtMing1_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtMing1_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtMing1_keyPressed(e);
    }
}


class MemberDome_txtTall_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtTall_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtTall_keyPressed(e);
    }
}


class MemberDome_txtShen_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtShen_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtShen_keyPressed(e);
    }
}


class MemberDome_txtShengRI_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtShengRI_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtShengRI_keyPressed(e);
    }
}


class MemberDome_txtMing_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtMing_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtMing_keyPressed(e);
    }
}


class MemberDome_txtID_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtID_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtID_keyPressed(e);
    }
}


class MemberDome_btnShan_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_btnShan_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnShan_actionPerformed(e);
    }
}


class MemberDome_jTree1_treeSelectionAdapter implements TreeSelectionListener {
    private MemberDome adaptee;
    MemberDome_jTree1_treeSelectionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void valueChanged(TreeSelectionEvent e) {
        adaptee.jTree1_valueChanged(e);
    }
}


class MemberDome_txtID1_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtID1_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtID1_keyPressed(e);
    }
}


class MemberDome_txtID2_keyAdapter extends KeyAdapter {
    private MemberDome adaptee;
    MemberDome_txtID2_keyAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtID2_keyPressed(e);
    }
}


class MemberDome_btnTian_actionAdapter implements ActionListener {
    private MemberDome adaptee;
    MemberDome_btnTian_actionAdapter(MemberDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnTian_actionPerformed(e);
    }
}
