package com.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.business.CardBusiness;
import com.business.ComBusiness;
import com.model.Card;
import com.model.Computer;
import com.model.Record;

//会员登陆
public class cus_login extends JFrame {
	JPanel contentPane;
	int j=0;
	JTextField CardName = new JTextField();
	JPasswordField Cardpassword = new JPasswordField();
	JLabel jLabel1 = new JLabel();//用户名
	JLabel jLabel2 = new JLabel();//密码
	JButton jbutton1 = new JButton();
	JButton jbutton2 = new JButton();
	public cus_login() {
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			jbInit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		contentPane = (JPanel) getContentPane();
		contentPane.setLayout(null);
		setSize(new Dimension(400, 300));
		setTitle("网吧会员登陆");
		CardName.setText("");
		CardName.setBounds(new Rectangle(156, 51, 195, 33));
		CardName.addKeyListener(new DengFrame_CardName_keyAdapter(this));
		
		Cardpassword.setText("");
		Cardpassword.setBounds(new Rectangle(157, 110, 194, 30));
		Cardpassword.addActionListener(new DengFrame_Cardpassword_actionAdapter(this));
		Cardpassword.addKeyListener(new DengFrame_Cardpassword_keyAdapter(this));
		
		jLabel1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
		jLabel1.setText("用户名");
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setBounds(new Rectangle(72, 49, 83, 35));
		
		jLabel2.setForeground(Color.WHITE);
		jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));	
		jLabel2.setText("密码");
		jLabel2.setBounds(new Rectangle(70, 107, 86, 30));
		
		jLabel2.setToolTipText("");
		
		 ImageIcon img = new ImageIcon("C:\\Users\\Administrator\\Desktop\\3.jpg");
	        JLabel bgLabel = new JLabel(img);
	        this.getLayeredPane().add(bgLabel, new Integer(Integer.MIN_VALUE));
	        bgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
	        
	        ((JPanel)getContentPane()).setOpaque(false);
	        
		
		
	
		jbutton1.setBounds(new Rectangle(254, 212, 92, 30));
		jbutton1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
		jbutton1.setText("退出");
		jbutton1.setForeground(Color.ORANGE);
		jbutton1.setFont(new Font("宋体", Font.PLAIN, 16));
		jbutton1.addKeyListener(new DengFrame_jButton2_keyAdapter(this));
		jbutton1.addActionListener(new DengFrame_jButton2_actionAdapter(this));
		
		jbutton2.setBounds(new Rectangle(102, 213, 92, 30)); 
		jbutton2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
		jbutton2.setText("登陆");
		jbutton2.setForeground(Color.BLUE);
		jbutton2.setFont(new Font("宋体", Font.PLAIN, 16));
		jbutton2.addActionListener(new DengFrame_jButton1_actionAdapter(this));
		
		contentPane.add(CardName);
		contentPane.add(Cardpassword);
		contentPane.add(jLabel1);
		contentPane.add(jLabel2);
		contentPane.add(jbutton1);
		contentPane.add(jbutton2);  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();


	}

	public void jButton2_actionPerformed(ActionEvent e) {
		ZhuFrame f = new ZhuFrame();
		f.setVisible(true);
		this.setVisible(false);

	}

	
	
	
	public void jButton1_actionPerformed(ActionEvent e){  
		String a = (String) CardName.getText();
		String b = new String(Cardpassword.getPassword());
		//记录错误
		if (a.length() == 0 || b.length() == 0) {
			javax.swing.JOptionPane.showMessageDialog(this,
					"帐户和密码不能为空！");
			return;
		}

		
		
		Card stu = new Card(); 
		stu.setId(a);
		stu.setPassword(b);
		ArrayList arr = CardBusiness.Dselect(stu);

		
		
		if (!arr.isEmpty()) {
			javax.swing.JOptionPane.showMessageDialog(this,
					"欢迎普通用户使用本系统！");
			Card stu1 = new Card();
			Record.cardId = a; //存卡ID
			stu1.setId(a);
			/*查询卡的余额*/
			ArrayList arr1 = CardBusiness.select(stu1);
			for (int i = 0; i < arr1.size(); i++) {
				stu1 = (Card) arr1.get(i);
			}
			double tall = stu1.getBalance();//查询余额
			try {   //
				InetAddress add = InetAddress.getLocalHost();
				//getHost Address()方法获取本机的IP地址
				String id = add.getHostAddress();
				String name = add.getHostName();
				Record.computerId = name; //存机器ID
				/*更新机器表为使用*/
				Computer gen = new Computer();
				gen.setId(name);
				gen.setOnUse(1);
				gen.setNotes("使用");
				ComBusiness.update(gen);

			} catch (UnknownHostException ex) {
				System.out.println("有错误发生了!" + ex.getMessage());
			}
			
			
			/*获得当前时间*/
			Date Time = new Date();
			SimpleDateFormat df;
			df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String bs = df.format(Time);
			
			
			
			Record.beginTime = bs; //存上机时间
			Record.balance = tall; //存卡余
			if (Record.balance < 0.7) {
				javax.swing.JOptionPane.showMessageDialog(this,
						"你的卡余额不足！请充值！");
				this.CardName.setText(""); //setText清空文本框中的文本。
				this.Cardpassword.setText("");
				this.CardName.requestFocus();

				return;
			}
			/*转换到计费页面，隐藏本页面。*/
			XiaoFeiFrame f = new XiaoFeiFrame();
			f.setVisible(true);
			this.setVisible(false);
		} else {
			JLabel lf = new JLabel("错误的用户名和密码!");
			lf.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
			JOptionPane.showMessageDialog(null, lf, "消息提示",
					JOptionPane.INFORMATION_MESSAGE);
			if (j == 3) {
				javax.swing.JOptionPane.showMessageDialog(this,
						"密码错误3次数！");
				this.setVisible(false);
				ZhuFrame f = new ZhuFrame();
				f.setVisible(true);

			}

			j++;
			this.CardName.setText(""); //setText清空文本框中的文本。
			this.Cardpassword.setText("");
			this.CardName.requestFocus(); //requestFocus方法用来设置焦点。
		}

	}
	
	
	

	public void CardName_keyPressed(KeyEvent e) {  
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			CardName.requestFocus();
		}
	}


	public void Cardpassword_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			Cardpassword.requestFocus();
		}
	}

	public void Cardpassword_actionPerformed(ActionEvent e) {

	}

	public void jButton2_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			jbutton1.doClick();
		}
	}
}


class DengFrame_Cardpassword_actionAdapter implements ActionListener {
	private cus_login adaptee;
	DengFrame_Cardpassword_actionAdapter(cus_login adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.Cardpassword_actionPerformed(e);
	}
}


class DengFrame_Cardpassword_keyAdapter extends KeyAdapter {
	private cus_login adaptee;
	DengFrame_Cardpassword_keyAdapter(cus_login adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.Cardpassword_keyPressed(e);
	}
}


class DengFrame_jButton1_actionAdapter implements ActionListener {
	private cus_login adaptee;
	DengFrame_jButton1_actionAdapter(cus_login adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {

		adaptee.jButton1_actionPerformed(e);
	}
}


class DengFrame_CardName_keyAdapter extends KeyAdapter {
	private cus_login adaptee;
	DengFrame_CardName_keyAdapter(cus_login adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.CardName_keyPressed(e);
	}
}


class DengFrame_jButton2_actionAdapter implements ActionListener {
	private cus_login adaptee;
	DengFrame_jButton2_actionAdapter(cus_login adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {

		adaptee.jButton2_actionPerformed(e);
	}
}


class DengFrame_jButton2_keyAdapter extends KeyAdapter {
	private cus_login adaptee;
	DengFrame_jButton2_keyAdapter(cus_login adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.jButton2_keyPressed(e);
	}
}
