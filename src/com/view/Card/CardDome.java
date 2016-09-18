package com.view.Card;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import java.awt.CardLayout;
import java.util.ArrayList;
import com.dao.CardDAO;
import com.business.CardBusiness;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JToggleButton;
import javax.swing.BorderFactory;
import java.awt.*;

import com.model.Card;
import com.model.Member;
import com.business.MemberBusiness;

/**
 
 */
public class CardDome extends JFrame {
    int weiZhi = 0; //纪录集合类提取元素的下标。
    ArrayList arr = CardBusiness.select();
    JPanel contentPane;
    BorderLayout borderLayout1 = new BorderLayout();
    JSplitPane jSplitPane1 = new JSplitPane();
    JScrollPane jScrollPane1 = new JScrollPane();
       DefaultMutableTreeNode gen = new DefaultMutableTreeNode("上网卡信息");
    JTree jTree1 = new JTree(gen);
    JPanel jPanel1 = new JPanel();
    CardLayout cardLayout1 = new CardLayout();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JPanel jPanel5 = new JPanel();
    JPanel jPanel6 = new JPanel();
    JTextField txtCardid = new JTextField();
    JPasswordField txtPassword = new JPasswordField();
    JTextField txtMemberid = new JTextField();
    JTextField txtbalance = new JTextField();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JLabel jLabel4 = new JLabel();
    JButton btnTian = new JButton();
    JButton jButton2 = new JButton();
    JTextField txtid = new JTextField();
    JLabel jLabel5 = new JLabel();
    JButton btnShan = new JButton();
    JButton jButton3 = new JButton();
    JTextField txtCardid1 = new JTextField();
    JTextField txtMemberid1 = new JTextField();
    JPasswordField txtPassword1 = new JPasswordField();
    JTextField txtbalance2 = new JTextField();
    JButton btnXiou = new JButton();
    JButton jButton4 = new JButton();
    JLabel jLabel6 = new JLabel();
    JLabel jLabel7 = new JLabel();
    JLabel jLabel8 = new JLabel();
    JLabel jLabel9 = new JLabel();
    JTextField txtCardid2 = new JTextField();
    JTextField txtMemberid2 = new JTextField();
    JTextField txtPassword2 = new JTextField();
    JTextField txtbalance3 = new JTextField();
    JToggleButton btnCha = new JToggleButton();
    JToggleButton jToggleButton2 = new JToggleButton();
    JLabel jLabel10 = new JLabel();
    JLabel jLabel11 = new JLabel();
    JLabel jLabel12 = new JLabel();
    JLabel jLabel13 = new JLabel();
    JTextField txtCardid3 = new JTextField();
    JTextField txtMemberid3 = new JTextField();
    JTextField txtPassword3 = new JTextField();
    JTextField txtbalance4 = new JTextField();
    JLabel jLabel14 = new JLabel();
    JLabel jLabel15 = new JLabel();
    JLabel jLabel16 = new JLabel();
    JLabel jLabel17 = new JLabel();
    JPanel jPanel7 = new JPanel();
    JButton btnZuiHou = new JButton();
    JButton btnHou = new JButton();
    JButton btnQian = new JButton();
    JButton btnDiYi = new JButton();
    JButton btnCTui = new JButton();
    public CardDome() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    
    private void jbInit() throws Exception {
        contentPane = (JPanel) getContentPane();
        contentPane.setLayout(borderLayout1);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(new Dimension(600, 600));
        setTitle("上网卡信息");
        jPanel1.setLayout(cardLayout1);
        jPanel2.setLayout(null);
        txtCardid.setBounds(new Rectangle(67, 30, 191, 30));
        txtCardid.addKeyListener(new CardDome_txtCardid_keyAdapter(this));
        txtPassword.setBounds(new Rectangle(69, 127, 190, 33));
        txtPassword.addKeyListener(new CardDome_txtPassword_keyAdapter(this));
        txtMemberid.setBounds(new Rectangle(67, 77, 189, 32));
        txtMemberid.addKeyListener(new CardDome_txtMemberid_keyAdapter(this));
        txtbalance.setBounds(new Rectangle(70, 175, 188, 31));
        txtbalance.addKeyListener(new CardDome_txtbalance_keyAdapter(this));
        jLabel1.setText("卡ID");
        jLabel1.setBounds(new Rectangle(13, 30, 54, 30));
        jLabel2.setText("用户ID");
        jLabel2.setBounds(new Rectangle(12, 77, 53, 33));
        jLabel3.setText("密码");
        jLabel3.setBounds(new Rectangle(12, 127, 55, 32));
        jLabel4.setText("余额");
        jLabel4.setBounds(new Rectangle(12, 175, 55, 30));
        
        btnTian.setBounds(new Rectangle(39, 246, 67, 22));
        btnTian.setText("添加");
        btnTian.addActionListener(new CardDome_jButton1_actionAdapter(this));
        
        jButton2.setBounds(new Rectangle(159, 247, 67, 22));
        jButton2.setText("取消");
        jButton2.addActionListener(new CardDome_jButton2_actionAdapter(this));
        
        jTree1.addTreeSelectionListener(new
                                        CardDome_jTree1_treeSelectionAdapter(this));
        jPanel3.setLayout(null);
        txtid.setBounds(new Rectangle(80, 78, 165, 30));
        txtid.addKeyListener(new CardDome_txtid_keyAdapter(this));
        jLabel5.setText("卡ID");
        jLabel5.setBounds(new Rectangle(6, 78, 64, 28));
        btnShan.setBounds(new Rectangle(38, 201, 67, 23));
        btnShan.setText("删除");
        btnShan.addActionListener(new CardDome_btnShan_actionAdapter(this));
        jButton3.setBounds(new Rectangle(157, 203, 66, 23));
        jButton3.setText("取消");
        jButton3.addActionListener(new CardDome_jButton3_actionAdapter(this));
        jPanel4.setLayout(null);
        txtCardid1.setBounds(new Rectangle(72, 36, 189, 31));
        txtCardid1.addKeyListener(new CardDome_txtCardid1_keyAdapter(this));
        txtMemberid1.setBounds(new Rectangle(72, 85, 188, 30));
        txtMemberid1.addKeyListener(new CardDome_txtMemberid1_keyAdapter(this));
        txtPassword1.setBounds(new Rectangle(72, 133, 187, 29));
        txtPassword1.addKeyListener(new CardDome_txtPassword1_keyAdapter(this));
        txtbalance2.setBounds(new Rectangle(71, 176, 188, 27));
        txtbalance2.addKeyListener(new CardDome_txtbalance2_keyAdapter(this));
        btnXiou.setBounds(new Rectangle(53, 241, 65, 23));
        btnXiou.setText("修改");
        btnXiou.addActionListener(new CardDome_btnXiou_actionAdapter(this));
        jButton4.setBounds(new Rectangle(190, 241, 65, 24));
        jButton4.setText("取消");
        jButton4.addActionListener(new CardDome_jButton4_actionAdapter(this));
        jLabel6.setText("卡ID");
        jLabel6.setBounds(new Rectangle(19, 38, 51, 28));
        jLabel7.setText("用户ID");
        jLabel7.setBounds(new Rectangle(18, 86, 50, 29));
        jLabel8.setText("密码");
        jLabel8.setBounds(new Rectangle(18, 133, 52, 28));
        jLabel9.setText("余额");
        jLabel9.setBounds(new Rectangle(18, 175, 52, 27));
        jPanel5.setLayout(null);
        txtCardid2.setBounds(new Rectangle(69, 32, 187, 33));
        txtMemberid2.setEditable(false);
        txtMemberid2.setBounds(new Rectangle(70, 110, 185, 31));
        txtPassword2.setEditable(false);
        txtPassword2.setBounds(new Rectangle(71, 158, 183, 31));
        txtbalance3.setEditable(false);
        txtbalance3.setBounds(new Rectangle(71, 207, 183, 31));
        btnCha.setText("查询");
        btnCha.setBounds(new Rectangle(52, 79, 66, 24));
        btnCha.addActionListener(new CardDome_btnCha_actionAdapter(this));
        jToggleButton2.setText("取消");
        jToggleButton2.setBounds(new Rectangle(175, 79, 69, 24));
        jToggleButton2.addActionListener(new
                                         CardDome_jToggleButton2_actionAdapter(this));
        jLabel10.setText("卡ID");
        jLabel10.setBounds(new Rectangle(16, 32, 50, 31));
        jLabel11.setText("用户ID");
        jLabel11.setBounds(new Rectangle(18, 109, 50, 31));
        jLabel12.setText("密码");
        jLabel12.setBounds(new Rectangle(17, 159, 50, 31));
        jLabel13.setText("余额");
        jLabel13.setBounds(new Rectangle(17, 205, 52, 32));
        jPanel6.setLayout(null);
        txtCardid3.setEditable(false);
        txtCardid3.setBounds(new Rectangle(65, 40, 190, 30));
        txtMemberid3.setEditable(false);
        txtMemberid3.setBounds(new Rectangle(66, 86, 190, 28));
        txtPassword3.setEditable(false);
        txtPassword3.setBounds(new Rectangle(64, 134, 188, 29));
        txtbalance4.setEditable(false);
        txtbalance4.setBounds(new Rectangle(65, 186, 187, 24));
        jLabel14.setText("卡ID");
        jLabel14.setBounds(new Rectangle(6, 41, 54, 28));
        jLabel15.setText("用户ID");
        jLabel15.setBounds(new Rectangle(5, 86, 56, 27));
        jLabel16.setText("密码");
        jLabel16.setBounds(new Rectangle(3, 134, 56, 28));
        jLabel17.setText("余额");
        jLabel17.setBounds(new Rectangle(5, 187, 55, 23));
        jPanel7.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel7.setBounds(new Rectangle(26, 234, 234, 35));
        jPanel7.setLayout(null);
        btnZuiHou.setBounds(new Rectangle(170, 5, 54, 23));
        btnZuiHou.setText(">>");
        btnZuiHou.addActionListener(new CardDome_btnZuiHou_actionAdapter(this));
        btnHou.setBounds(new Rectangle(116, 6, 44, 23));
        btnHou.setText(">");
        btnHou.addActionListener(new CardDome_jButton5_actionAdapter(this));
        btnQian.setBounds(new Rectangle(66, 6, 44, 23));
        btnQian.setText("<");
        btnQian.addActionListener(new CardDome_btnQian_actionAdapter(this));
        btnDiYi.setBounds(new Rectangle(7, 6, 54, 23));
        btnDiYi.setText("<<");
        btnDiYi.addActionListener(new CardDome_btnDiYi_actionAdapter(this));
        btnCTui.setBounds(new Rectangle(211, 271, 77, 27));
        btnCTui.setText("取消");
        btnCTui.addActionListener(new CardDome_btnCTui_actionAdapter(this));
        contentPane.add(jSplitPane1, java.awt.BorderLayout.CENTER);
        jSplitPane1.add(jScrollPane1, JSplitPane.LEFT);
        jSplitPane1.add(jPanel1, JSplitPane.RIGHT);
        jPanel1.add(jPanel2, "jPanel2");
        jPanel2.add(txtCardid);
        jPanel2.add(txtbalance);
        jPanel2.add(txtMemberid);
        jPanel2.add(txtPassword);
        jPanel2.add(jLabel1);
        jPanel2.add(jLabel2);
        jPanel2.add(jLabel3);
        jPanel2.add(jLabel4);
        jPanel2.add(btnTian);
        jPanel2.add(jButton2);
        jPanel1.add(jPanel3, "jPanel3");
        jPanel3.add(txtid);
        jPanel3.add(jLabel5);
        jPanel3.add(btnShan);
        jPanel3.add(jButton3);
        jPanel1.add(jPanel4, "jPanel4");
        jPanel4.add(txtCardid1);
        jPanel4.add(txtPassword1);
        jPanel4.add(txtMemberid1);
        jPanel4.add(txtbalance2);
        jPanel4.add(btnXiou);
        jPanel4.add(jButton4);
        jPanel4.add(jLabel6);
        jPanel4.add(jLabel7);
        jPanel4.add(jLabel8);
        jPanel4.add(jLabel9);
        jPanel1.add(jPanel5, "jPanel5");
        jPanel5.add(txtCardid2);
        jPanel5.add(txtMemberid2);
        jPanel5.add(txtbalance3);
        jPanel5.add(txtPassword2);
        jPanel5.add(btnCha);
        jPanel5.add(jToggleButton2);
        jPanel5.add(jLabel10);
        jPanel5.add(jLabel11);
        jPanel5.add(jLabel12);
        jPanel5.add(jLabel13);
        jPanel1.add(jPanel6, "jPanel6");
        jPanel6.add(txtCardid3);
        jPanel6.add(txtMemberid3);
        jPanel6.add(txtPassword3);
        jPanel6.add(txtbalance4);
        jPanel6.add(jLabel14);
        jPanel6.add(jLabel15);
        jPanel6.add(jLabel16);
        jPanel6.add(jLabel17);
        jPanel6.add(jPanel7);
        jPanel7.add(btnDiYi);
        jPanel7.add(btnQian);
        jPanel7.add(btnHou);
        jPanel7.add(btnZuiHou);
        jPanel6.add(btnCTui);
        jScrollPane1.getViewport().add(jTree1);
        DefaultMutableTreeNode Tian = new DefaultMutableTreeNode("添加上网卡信息");
       gen.add(Tian);
      DefaultMutableTreeNode Shan = new DefaultMutableTreeNode("删除上网卡信息");
          gen.add(Shan);
       DefaultMutableTreeNode Xiou = new DefaultMutableTreeNode("修改上网卡信息");
          gen.add(Xiou);
        DefaultMutableTreeNode Cha = new DefaultMutableTreeNode("条件查询上网卡信息");
          gen.add(Cha);
        DefaultMutableTreeNode Cha1 = new DefaultMutableTreeNode("查询全部上网卡信息");
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

    
    
    public void jTree1_valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode temp = (DefaultMutableTreeNode) jTree1.
                                       getLastSelectedPathComponent();
         //得到选中的节点名称
         String name=temp.toString();

         //根据选择的不同显示卡式布局中的卡片
         if (name.equals("添加上网卡信息")){
             this.cardLayout1.show(this.jPanel1, "jPanel2");
         }else if(name.equals("删除上网卡信息")){
             this.cardLayout1.show(this.jPanel1, "jPanel3");
         }else if(name.equals("修改上网卡信息")){
             this.cardLayout1.show(this.jPanel1, "jPanel4");
         }else if(name.equals("条件查询上网卡信息")){
             this.cardLayout1.show(this.jPanel1, "jPanel5");
         }else if(name.equals("查询全部上网卡信息")){
             this.cardLayout1.show(this.jPanel1, "jPanel6");
      }
    }

    public void jButton1_actionPerformed(ActionEvent e) {
                String id=(String)txtCardid.getText();
                String Hui=(String)txtMemberid.getText();
                String Password=new String(txtPassword.getPassword());
               double balance=Double.parseDouble(txtbalance.getText());
               Card Tian = new Card();
                Tian.setId(id);
              ArrayList brr=CardBusiness.select(Tian);
       if(!brr.isEmpty())
       {
           javax.swing.JOptionPane.showMessageDialog(this,
                       "该卡号已存在！");
           return;
       }
       Member Tian1=new Member();
       Tian1.setId(Hui);
          ArrayList Crr=MemberBusiness.select(Tian1);
          if(Crr.isEmpty())
          {
              javax.swing.JOptionPane.showMessageDialog(this,
                  "非会员注册！");
              Card stu = new Card();
              stu.setId(id);
              stu.setMemberId(Hui);
              stu.setPassword(Password);
              stu.setBalance(balance);
              CardBusiness.insert(stu);
              javax.swing.JOptionPane.showMessageDialog(this,
          "添加成功！");
 this.txtCardid.setText("");
     this.txtMemberid.setText("");
         this.txtPassword.setText("");
             this.txtbalance.setText("");
          this.txtCardid.requestFocus();
      return;

          }
       if (id.length() == 0 ||Hui.length()==0||Password.length()==0||balance==0) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "卡ID和会员ID，密码不能为空，余额不能为0！");
                return;
                }
        else  if(!id.startsWith("C"))
            {javax.swing.JOptionPane.showMessageDialog(this,
             "卡ID不符合约束！");
            return;
            }
            else  if(!Hui.startsWith("U"))
          {javax.swing.JOptionPane.showMessageDialog(this,
           "会员ID不符合约束！");
          return;
          }
          else  if(Password.length()<6)
            {javax.swing.JOptionPane.showMessageDialog(this,
             "密码不能小于6位！");
            return;

            }

else{
            Card stu = new Card();
                 stu.setId(id);
                 stu.setMemberId(Hui);
                 stu.setPassword(Password);
                 stu.setBalance(balance);
                 CardBusiness.insert(stu);
                 javax.swing.JOptionPane.showMessageDialog(this,
             "添加成功！");
    this.txtCardid.setText("");
        this.txtMemberid.setText("");
            this.txtPassword.setText("");
                this.txtbalance.setText("");
             this.txtCardid.requestFocus();}
    }

    public void txtCardid_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          {
             txtMemberid.requestFocus();
        }
    }

    public void txtMemberid_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          {
             txtPassword.requestFocus();
        }

    }

    public void txtPassword_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
              {
                 txtbalance.requestFocus();
        }
    }

    public void txtbalance_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
         {
                       btnTian.requestFocus();
        }
    }

    public void btnShan_actionPerformed(ActionEvent e) {
        String id =(String)txtid.getText();
          if(!id.startsWith("C"))
          {javax.swing.JOptionPane.showMessageDialog(this,
           "卡ID不符合约束！");
          return;
          }

                         //把学号封装到一个实体类对象中，用来在不同层传递数据
                      Card stu = new Card();
                       stu.setId(id);

                       //删除
                     CardBusiness.delete(stu);
                           javax.swing.JOptionPane.showMessageDialog(this,
                     "删除成功！");
    }

    public void txtid_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
                    btnShan.requestFocus();
        }
    }

    public void btnXiou_actionPerformed(ActionEvent e) {
        String id=(String)txtCardid1.getText();
        String Hui=(String)txtMemberid1.getText();
        String Password=new String(txtPassword1.getPassword());
       double balance=Double.parseDouble(txtbalance2.getText());
        if (id.length() == 0 ||Hui.length()==0||Password.length()==0||balance==0) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "卡ID和会员ID，密码不能为空，余额不能为0！");
        return;
        }
        else  if(!id.startsWith("C"))
        {javax.swing.JOptionPane.showMessageDialog(this,
         "卡ID不符合约束！");
        return;
        }
        else  if(!Hui.startsWith("U"))
      {javax.swing.JOptionPane.showMessageDialog(this,
       "会员ID不符合约束！");
      return;
      }
 else  if(Password.length()<6)
  {javax.swing.JOptionPane.showMessageDialog(this,
   "密码不能小于6位！");
  return;

  }


        Card stu = new Card();
         stu.setId(id);
         stu.setMemberId(Hui);
         stu.setPassword(Password);
         stu.setBalance(balance);
         CardBusiness.update(stu);
         javax.swing.JOptionPane.showMessageDialog(this,
             "修改成功！");
    }

    public void txtCardid1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
         {
                   txtMemberid1.requestFocus();
        }
    }

    public void txtMemberid1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
         {
                    txtPassword1.requestFocus();
            }
    }

    public void txtPassword1_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          {
                      txtbalance2.requestFocus();
        }
    }

    public void txtbalance2_keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
         {
                      btnXiou.requestFocus();
        }
    }

    public void btnCha_actionPerformed(ActionEvent e) {
        Card stu = new Card();
                      //接收用户输入要查找的学员姓名.

                      String xingMing = (String)txtCardid2.getText();
          if(!xingMing.startsWith(""))
              {
                  javax.swing.JOptionPane.showMessageDialog(this,
                 "卡ID不符合约束！");
                 return;
               }

                      //把学员姓名封装到一个实体类对象中，用来在不同层传递数据。
                      stu.setId(xingMing);

                      //调用业务类方法，返回集合类对象．
                      ArrayList arr = CardBusiness.select(stu);

                      //如果没有任何学员纪录
                      if (arr.isEmpty())
                          System.out.println("没有找到任何卡纪录!");
                      else {
                          //循环显示集合类中每个学员的信息
                          System.out.println("\n一共"+arr.size()+"个卡的信息如下：");
                          for (int i = 0; i < arr.size(); i++) {
                              stu = (Card) arr.get(i);
                               txtMemberid2.setText(stu.getMemberId() );
                               txtPassword2 .setText(""+stu.getPassword());
                               txtbalance3.setText(""+stu.getBalance());


                          }
                   }
    }

    public void jButton5_actionPerformed(ActionEvent e) {
        weiZhi++;
      if (weiZhi >(arr.size()-1)) //判断是否是最后一条纪录
          weiZhi = arr.size()-1;
      Card stu = (Card) arr.get(weiZhi);
            //设计界面文本框中的值
            this.txtCardid3.setText("" + stu.getId());
            this.txtMemberid3.setText(stu.getMemberId());
            this.txtPassword3.setText("" + stu.getPassword());
            this.txtbalance4.setText("" + stu.getBalance());

    }

    public void btnDiYi_actionPerformed(ActionEvent e) {
              weiZhi = 0;
                Card stu = (Card) arr.get(weiZhi);
                //设计界面文本框中的值
                this.txtCardid3.setText("" + stu.getId());
                this.txtMemberid3.setText(stu.getMemberId());
                this.txtPassword3.setText("" + stu.getPassword());
                this.txtbalance4.setText("" + stu.getBalance());

    }

    public void btnQian_actionPerformed(ActionEvent e) {
        weiZhi--;
             if (weiZhi < 0) //判断是否是第一条纪录
            weiZhi = 0;
        Card stu = (Card) arr.get(weiZhi);
              //设计界面文本框中的值
              this.txtCardid3.setText("" + stu.getId());
              this.txtMemberid3.setText(stu.getMemberId());
              this.txtPassword3.setText("" + stu.getPassword());
              this.txtbalance4.setText("" + stu.getBalance());

    }

    public void btnZuiHou_actionPerformed(ActionEvent e) {
     weiZhi = arr.size() - 1;
     Card stu = (Card) arr.get(weiZhi);
     this.txtCardid3.setText("" + stu.getId());
        this.txtMemberid3.setText(stu.getMemberId());
        this.txtPassword3.setText("" + stu.getPassword());
        this.txtbalance4.setText("" + stu.getBalance());

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

    public void jToggleButton2_actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    public void btnCTui_actionPerformed(ActionEvent e) {
this.setVisible(false);
    }
}


class CardDome_btnCTui_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_btnCTui_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {

        adaptee.btnCTui_actionPerformed(e);
    }
}


class CardDome_jButton4_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_jButton4_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}


class CardDome_jButton2_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_jButton2_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class CardDome_btnZuiHou_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_btnZuiHou_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnZuiHou_actionPerformed(e);
    }
}


class CardDome_btnQian_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_btnQian_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnQian_actionPerformed(e);
    }
}


class CardDome_btnDiYi_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_btnDiYi_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnDiYi_actionPerformed(e);
    }
}


class CardDome_jButton5_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_jButton5_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}


class CardDome_btnCha_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_btnCha_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnCha_actionPerformed(e);
    }
}


class CardDome_txtbalance2_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtbalance2_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtbalance2_keyPressed(e);
    }
}


class CardDome_txtPassword1_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtPassword1_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtPassword1_keyPressed(e);
    }
}


class CardDome_txtMemberid1_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtMemberid1_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtMemberid1_keyPressed(e);
    }
}


class CardDome_txtCardid1_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtCardid1_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtCardid1_keyPressed(e);
    }
}


class CardDome_btnXiou_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_btnXiou_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnXiou_actionPerformed(e);
    }
}


class CardDome_txtid_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtid_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtid_keyPressed(e);
    }
}


class CardDome_btnShan_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_btnShan_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.btnShan_actionPerformed(e);
    }
}


class CardDome_txtbalance_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtbalance_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtbalance_keyPressed(e);
    }
}


class CardDome_txtPassword_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtPassword_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtPassword_keyPressed(e);
    }
}


class CardDome_txtMemberid_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtMemberid_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtMemberid_keyPressed(e);
    }
}


class CardDome_txtCardid_keyAdapter extends KeyAdapter {
    private CardDome adaptee;
    CardDome_txtCardid_keyAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void keyPressed(KeyEvent e) {
        adaptee.txtCardid_keyPressed(e);
    }
}


class CardDome_jButton3_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_jButton3_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class CardDome_jToggleButton2_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_jToggleButton2_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jToggleButton2_actionPerformed(e);
    }
}


class CardDome_jTree1_treeSelectionAdapter implements TreeSelectionListener {
    private CardDome adaptee;
    CardDome_jTree1_treeSelectionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void valueChanged(TreeSelectionEvent e) {
        adaptee.jTree1_valueChanged(e);
    }
}


class CardDome_jButton1_actionAdapter implements ActionListener {
    private CardDome adaptee;
    CardDome_jButton1_actionAdapter(CardDome adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}
