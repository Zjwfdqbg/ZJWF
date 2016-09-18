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
		
		setTitle("��̨�û���½");
		
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
		jLabel1.setText("�û���");
		jLabel1.setBounds(new Rectangle(32, 62, 102, 36));
		
		jLabel2.setText("����");
		jLabel2.setBounds(new Rectangle(30, 131, 80, 32));
		
		btnDengLu.setBounds(new Rectangle(84, 221, 71, 28));
		btnDengLu.setFont(new Font("����", Font.PLAIN, 16));
		btnDengLu.setForeground(Color.GREEN);
		btnDengLu.setText("��½");
		btnDengLu.addActionListener(new RuanJianFrame_btnDengLu_actionAdapter(this));
		
		
		btnTuiChu.setBounds(new Rectangle(226, 222, 71, 27));
		btnTuiChu.setFont(new Font("����", Font.PLAIN, 16));
		btnTuiChu.setForeground(Color.RED);
		btnTuiChu.setText("�˳�");
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

		// ��֤����1: ����֤,�ж��û��������Ƿ�Ϊ��,������������ return
		if (userName.length() == 0 || passWord.length() == 0) {
			javax.swing.JOptionPane.showMessageDialog(this, "�ʻ������벻��Ϊ�գ�");
			return;
		}

		// ��֤����2: ҵ����֤,�ж��û����������Ƿ�Ϊ��
		// (1)����: �������װ��ʵ���������
		User us = new User();
		us.setUsername(userName);
		us.setPassword(passWord);

		// (2)Ȼ��: ����ҵ������ط���,ʵ��ҵ����֤
		ArrayList arr = null;
		arr = UserBusiness.Dselect(us); // ��֤�Ƿ�����ȷ���û���������
		if (!arr.isEmpty()) {

			boolean shiFou = UserBusiness.DLselect(us); //�����ȷ,�ж�Ȩ��
			if (shiFou == true) {
				javax.swing.JOptionPane.showMessageDialog(this, "��ӭ����Աʹ�ñ�ϵͳ��");
				MainFrame f = new MainFrame();
				f.setVisible(true); 
				this.setVisible(false);
			} else {
				javax.swing.JOptionPane.showMessageDialog(this, "��ӭ��ͨ�û�ʹ�ñ�ϵͳ��");
				this.setVisible(false);
			}
		} else { // ������벻��ȷ�Ĳ���.
			javax.swing.JOptionPane.showMessageDialog(this, "�ʻ����������벻��ȷ��");
			this.txtMing.setText("");
			this.txtMiMa.setText("");
			this.txtMing.requestFocus();//�ù�����»����˻���
		}
	}

	public void jButton2_actionPerformed(ActionEvent e) {
		ZhuFrame f = new ZhuFrame();
		f.setVisible(true);
		this.setVisible(false);
	}
}














class RuanJianFrame_txtMing_keyAdapter extends KeyAdapter {//�û���
	private wg_login adaptee;

	RuanJianFrame_txtMing_keyAdapter(wg_login adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.txtMing_keyPressed(e);
	}
}

class RuanJianFrame_txtMiMa_keyAdapter extends KeyAdapter {//����
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
