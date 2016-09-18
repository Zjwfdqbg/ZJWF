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
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.business.UserBusiness;
import com.model.User;

public class wg_login extends JFrame { 
	JPanel contentPane;
	JTextField txtMing = new JTextField();
	JPasswordField txtMiMa = new JPasswordField();
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JButton btnDengLu = new JButton();
	JButton btnTuiChu = new JButton();

	public wg_login() {
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
		setSize(new Dimension(500, 375));
		
		setTitle("后台用户登陆");
		
		txtMing.setBounds(new Rectangle(135, 62, 213, 38));
		txtMing.addKeyListener(new RuanJianFrame_txtMing_keyAdapter(this));
		
		txtMiMa.setBounds(new Rectangle(135, 131, 212, 33));
		txtMiMa.addKeyListener(new RuanJianFrame_txtMiMa_keyAdapter(this));
		
		
		 ImageIcon img = new ImageIcon("C:\\Users\\Administrator\\Desktop\\4.jpg");
	        JLabel bgLabel = new JLabel(img);
	        this.getLayeredPane().add(bgLabel, new Integer(Integer.MIN_VALUE));
	        bgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
	        
	        ((JPanel)getContentPane()).setOpaque(false);
	        
		
		jLabel1.setToolTipText("");
		jLabel1.setText("用户名");
		jLabel1.setBounds(new Rectangle(32, 62, 102, 36));
		
		jLabel2.setText("密码");
		jLabel2.setBounds(new Rectangle(30, 131, 80, 32));
		
		btnDengLu.setBounds(new Rectangle(84, 221, 71, 28));
		btnDengLu.setFont(new Font("宋体", Font.PLAIN, 16));
		btnDengLu.setForeground(Color.GREEN);
		btnDengLu.setText("登陆");
		btnDengLu.addActionListener(new RuanJianFrame_btnDengLu_actionAdapter(this));
		
		
		btnTuiChu.setBounds(new Rectangle(226, 222, 71, 27));
		btnTuiChu.setFont(new Font("宋体", Font.PLAIN, 16));
		btnTuiChu.setForeground(Color.RED);
		btnTuiChu.setText("退出");
		btnTuiChu.addActionListener(new RuanJianFrame_jButton2_actionAdapter(this));
		
		
		contentPane.add(txtMing);
		contentPane.add(txtMiMa);
		contentPane.add(jLabel1);
		contentPane.add(jLabel2);
		contentPane.add(btnDengLu);
		contentPane.add(btnTuiChu);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();

	}

	public void txtMing_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			txtMiMa.requestFocus();
		}
		
	}

	public void txtMiMa_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			btnDengLu.requestFocus();
		}
	}

	public void btnDengLu_actionPerformed(ActionEvent e) {
		String userName = (String) this.txtMing.getText();
		String passWord = new String((this.txtMiMa.getPassword()));

		// 验证步骤1: 表单验证,判断用户的输入是否为空,空则重新输入 return
		if (userName.length() == 0 || passWord.length() == 0) {
			javax.swing.JOptionPane.showMessageDialog(this, "帐户和密码不能为空！");
			return;
		}

		// 验证步骤2: 业务验证,判断用户名和密码是否为空
		// (1)首先: 把输入封装到实体类对象中
		User us = new User();
		us.setUsername(userName);
		us.setPassword(passWord);

		// (2)然后: 调用业务层的相关方法,实现业务验证
		ArrayList arr = null;
		arr = UserBusiness.Dselect(us); // 验证是否是正确的用户名和密码
		if (!arr.isEmpty()) {

			boolean shiFou = UserBusiness.DLselect(us); //如果正确,判断权限
			if (shiFou == true) {
				javax.swing.JOptionPane.showMessageDialog(this, "欢迎管理员使用本系统！");
				MainFrame f = new MainFrame();
				f.setVisible(true); 
				this.setVisible(false);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this, "欢迎普通用户使用本系统！");
				this.setVisible(false);
			}
		} else { // 如果密码不正确的操作.
			javax.swing.JOptionPane.showMessageDialog(this, "帐户和密码输入不正确！");
			this.txtMing.setText("");
			this.txtMiMa.setText("");
			this.txtMing.requestFocus();//让光标重新回入账户名
		}
	}

	public void jButton2_actionPerformed(ActionEvent e) {
		ZhuFrame f = new ZhuFrame();
		f.setVisible(true);
		this.setVisible(false);
	}
}














class RuanJianFrame_txtMing_keyAdapter extends KeyAdapter {//用户名
	private wg_login adaptee;

	RuanJianFrame_txtMing_keyAdapter(wg_login adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.txtMing_keyPressed(e);
	}
}

class RuanJianFrame_txtMiMa_keyAdapter extends KeyAdapter {//密码
	private  wg_login adaptee;

	RuanJianFrame_txtMiMa_keyAdapter( wg_login adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.txtMiMa_keyPressed(e);
	}
}

class RuanJianFrame_btnDengLu_actionAdapter implements ActionListener {
	private wg_login adaptee;

	RuanJianFrame_btnDengLu_actionAdapter(wg_login adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnDengLu_actionPerformed(e);
	}
}

class RuanJianFrame_jButton2_actionAdapter implements ActionListener {
	private wg_login adaptee;

	RuanJianFrame_jButton2_actionAdapter(wg_login adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}
}
