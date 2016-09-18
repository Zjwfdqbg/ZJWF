package com.view.User;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import java.awt.CardLayout;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import com.business.UserBusiness; //����ҵ����
import com.model.Popedom;
import com.model.User;
import com.business.PopedomBusiness;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import java.awt.*;
import com.business.MemberBusiness;
import javax.swing.JComboBox;

public class UserFrame extends JFrame {
	int weiZhi = 0; // ��¼��������ȡԪ�ص��±ꡣ
	ArrayList arr = UserBusiness.select();
	JPanel contentPane;
	BorderLayout borderLayout1 = new BorderLayout();
	JSplitPane jSplitPane1 = new JSplitPane();
	JScrollPane jScrollPane1 = new JScrollPane();
	DefaultMutableTreeNode gen = new DefaultMutableTreeNode("�û���Ϣ����");
	JTree jTree1 = new JTree(gen);
	JPanel jPanel1 = new JPanel();
	CardLayout cardLayout1 = new CardLayout();
	JPanel jPanel2 = new JPanel();
	JPanel jPanel3 = new JPanel();
	JPanel jPanel4 = new JPanel();
	JPanel jPanel5 = new JPanel();
	JPanel QuanBuCha = new JPanel();
	JTextField txtName = new JTextField();
	JPasswordField txtPassword = new JPasswordField();
	JLabel jLabel1 = new JLabel();
	JLabel jLabel2 = new JLabel();
	JLabel jLabel3 = new JLabel();
	JButton btnTian = new JButton();
	JButton jButton2 = new JButton();
	JTextField txtUserName = new JTextField();
	JLabel jLabel4 = new JLabel();
	JButton btnShan = new JButton();
	JButton jButton3 = new JButton();
	JTextField txtMing = new JTextField();
	JPasswordField txtMiMa = new JPasswordField();
	JButton btnXiou = new JButton();
	JButton jButton4 = new JButton();
	JLabel jLabel5 = new JLabel();
	JLabel jLabel6 = new JLabel();
	JLabel jLabel7 = new JLabel();
	JTextField txtYMing = new JTextField();
	JTextField txtYMiMa = new JTextField();
	JTextField txtYID = new JTextField();
	JButton btnCha = new JButton();
	JButton jButton5 = new JButton();
	JLabel jLabel8 = new JLabel();
	JLabel jLabel9 = new JLabel();
	JLabel jLabel10 = new JLabel();
	JTextField txtHMing = new JTextField();
	JTextField txtHMiMa = new JTextField();
	JTextField txtHID = new JTextField();
	JLabel jLabel11 = new JLabel();
	JLabel jLabel12 = new JLabel();
	JLabel jLabel13 = new JLabel();
	JPanel jPanel7 = new JPanel();
	JButton btnZhou = new JButton();
	JButton btnQian = new JButton();
	JButton btnHou = new JButton();
	JButton btnYou = new JButton();
	JButton btnTui = new JButton();
	JComboBox txtQuan = new JComboBox();
	JComboBox txtQuan1 = new JComboBox();

	public UserFrame() {
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
		setSize(new Dimension(600, 400));
		setTitle("�û�����");
		jPanel1.setLayout(cardLayout1);
		jPanel2.setLayout(null);
		txtName.setBounds(new Rectangle(94, 41, 177, 34));
		txtName.addKeyListener(new UserFrame_txtName_keyAdapter(this));
		txtPassword.setBounds(new Rectangle(94, 92, 177, 38));
		jLabel1.setText("�û���");
		jLabel1.setBounds(new Rectangle(22, 41, 73, 34));
		jLabel2.setText("����");
		jLabel2.setBounds(new Rectangle(22, 94, 72, 34));
		jLabel3.setText("Ȩ��");
		jLabel3.setBounds(new Rectangle(24, 148, 68, 36));
		btnTian.setBounds(new Rectangle(46, 233, 83, 29));
		btnTian.setText("���");
		btnTian.addActionListener(new UserFrame_btnTian_actionAdapter(this));
		jButton2.setBounds(new Rectangle(184, 232, 84, 30));
		jButton2.setText("ȡ��");
		jButton2.addActionListener(new UserFrame_jButton2_actionAdapter(this));
		txtPassword.addKeyListener(new UserFrame_txtPassword_keyAdapter(this));
		jTree1.addTreeSelectionListener(new UserFrame_jTree1_treeSelectionAdapter(this));
		jPanel3.setLayout(null);
		txtUserName.setBounds(new Rectangle(93, 64, 185, 37));
		jLabel4.setText("�û���");
		jLabel4.setBounds(new Rectangle(19, 63, 71, 37));
		btnShan.setBounds(new Rectangle(50, 233, 75, 25));
		btnShan.setText("ɾ��");
		btnShan.addActionListener(new UserFrame_btnShan_actionAdapter(this));
		jButton3.setBounds(new Rectangle(204, 232, 76, 26));
		jButton3.setText("ȡ��");
		jButton3.addActionListener(new UserFrame_jButton3_actionAdapter(this));
		jPanel4.setLayout(null);
		txtMing.setBounds(new Rectangle(75, 37, 196, 32));
		txtMing.addKeyListener(new UserFrame_txtMing_keyAdapter(this));
		txtMiMa.setBounds(new Rectangle(75, 89, 194, 31));
		txtMiMa.addKeyListener(new UserFrame_txtMiMa_keyAdapter(this));
		btnXiou.setBounds(new Rectangle(62, 243, 63, 25));
		btnXiou.setText("�޸�");
		btnXiou.addActionListener(new UserFrame_btnXiou_actionAdapter(this));
		jButton4.setBounds(new Rectangle(188, 243, 64, 25));
		jButton4.setText("ȡ��");
		jButton4.addActionListener(new UserFrame_jButton4_actionAdapter(this));
		jLabel5.setText("�û���");
		jLabel5.setBounds(new Rectangle(10, 37, 62, 32));
		jLabel6.setText("����");
		jLabel6.setBounds(new Rectangle(9, 90, 64, 31));
		jLabel7.setText("Ȩ��");
		jLabel7.setBounds(new Rectangle(7, 143, 66, 33));
		jPanel5.setLayout(null);
		txtYMing.setBounds(new Rectangle(88, 35, 184, 36));
		txtYMing.addKeyListener(new UserFrame_txtYMing_keyAdapter(this));
		txtYMiMa.setEditable(false);
		txtYMiMa.setBounds(new Rectangle(89, 115, 182, 34));
		txtYID.setEditable(false);
		txtYID.setBounds(new Rectangle(90, 173, 181, 40));
		btnCha.setBounds(new Rectangle(56, 80, 68, 27));
		btnCha.setText("��ѯ");
		btnCha.addActionListener(new UserFrame_btnCha_actionAdapter(this));
		jButton5.setBounds(new Rectangle(181, 81, 71, 26));
		jButton5.setText("ȡ��");
		jButton5.addActionListener(new UserFrame_jButton5_actionAdapter(this));
		jLabel8.setText("�û���");
		jLabel8.setBounds(new Rectangle(8, 36, 77, 33));
		jLabel9.setText("����");
		jLabel9.setBounds(new Rectangle(8, 116, 76, 33));
		jLabel10.setText("Ȩ��ID");
		jLabel10.setBounds(new Rectangle(8, 174, 77, 38));
		QuanBuCha.setLayout(null);
		txtHMing.setEditable(false);
		txtHMing.setBounds(new Rectangle(78, 45, 185, 36));
		txtHMiMa.setEditable(false);
		txtHMiMa.setBounds(new Rectangle(78, 103, 183, 35));
		txtHID.setEditable(false);
		txtHID.setBounds(new Rectangle(78, 161, 182, 32));
		jLabel11.setText("�û���");
		jLabel11.setBounds(new Rectangle(6, 45, 68, 35));
		jLabel12.setText("����");
		jLabel12.setBounds(new Rectangle(4, 103, 67, 34));
		jLabel13.setText("Ȩ��");
		jLabel13.setBounds(new Rectangle(4, 161, 70, 32));
		jPanel7.setBorder(BorderFactory.createLineBorder(Color.black));
		jPanel7.setBounds(new Rectangle(36, 226, 222, 50));
		btnZhou.setText("<");
		btnZhou.addActionListener(new UserFrame_btnZhou_actionAdapter(this));
		btnQian.setText("<<");
		btnQian.addActionListener(new UserFrame_btnQian_actionAdapter(this));
		btnHou.setText(">>");
		btnHou.addActionListener(new UserFrame_btnHou_actionAdapter(this));
		btnYou.setText(">");
		btnYou.addActionListener(new UserFrame_btnYou_actionAdapter(this));
		btnTui.setBounds(new Rectangle(175, 276, 60, 23));
		btnTui.setText("ȡ��");
		btnTui.addActionListener(new UserFrame_btnTui_actionAdapter(this));
		txtQuan.setBounds(new Rectangle(98, 152, 183, 31));
		txtQuan1.setBounds(new Rectangle(77, 145, 177, 33));
		contentPane.add(jSplitPane1, java.awt.BorderLayout.CENTER);
		jSplitPane1.add(jScrollPane1, JSplitPane.LEFT);
		jSplitPane1.add(jPanel1, JSplitPane.RIGHT);
		jPanel1.add(jPanel2, "jPanel2");
		jPanel2.add(txtName);
		jPanel2.add(txtPassword);
		jPanel2.add(jLabel1);
		jPanel2.add(jLabel2);
		jPanel2.add(jLabel3);
		jPanel2.add(jButton2);
		jPanel2.add(btnTian);
		jPanel2.add(txtQuan);
		jPanel1.add(jPanel3, "jPanel3");
		jPanel3.add(txtUserName);
		jPanel3.add(jLabel4);
		jPanel3.add(btnShan);
		jPanel3.add(jButton3);
		jPanel1.add(jPanel4, "jPanel4");
		jPanel4.add(txtMing);
		jPanel4.add(txtMiMa);
		jPanel4.add(btnXiou);
		jPanel4.add(jButton4);
		jPanel4.add(jLabel5);
		jPanel4.add(jLabel6);
		jPanel4.add(jLabel7);
		jPanel4.add(txtQuan1);
		jPanel1.add(jPanel5, "jPanel5");
		jPanel5.add(txtYMing);
		jPanel5.add(txtYMiMa);
		jPanel5.add(txtYID);
		jPanel5.add(jButton5);
		jPanel5.add(btnCha);
		jPanel5.add(jLabel8);
		jPanel5.add(jLabel9);
		jPanel5.add(jLabel10);
		QuanBuCha.add(txtHMing);
		QuanBuCha.add(txtHMiMa);
		QuanBuCha.add(txtHID);
		QuanBuCha.add(jLabel11);
		QuanBuCha.add(jLabel12);
		QuanBuCha.add(jLabel13);
		QuanBuCha.add(jPanel7);
		QuanBuCha.add(btnTui);
		jPanel7.add(btnQian);
		jPanel7.add(btnZhou);
		jPanel7.add(btnYou);
		jPanel7.add(btnHou);
		jScrollPane1.getViewport().add(jTree1);
		DefaultMutableTreeNode Tian = new DefaultMutableTreeNode("����û���Ϣ");
		gen.add(Tian);
		DefaultMutableTreeNode Shan = new DefaultMutableTreeNode("ɾ���û���Ϣ");
		gen.add(Shan);
		DefaultMutableTreeNode Xiou = new DefaultMutableTreeNode("�޸��û���Ϣ");
		gen.add(Xiou);
		DefaultMutableTreeNode Cha = new DefaultMutableTreeNode("������ѯ�û���Ϣ");
		gen.add(Cha);
		DefaultMutableTreeNode Cha1 = new DefaultMutableTreeNode("��ѯȫ���û���Ϣ");
		gen.add(Cha1);
		jPanel1.add(QuanBuCha, "QuanBuCha");
		jTree1.expandRow(0);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
		this.txtQuan.addItem("******��ѡ��******");
		this.txtQuan.addItem("����Ա");
		this.txtQuan.addItem("��ͨ�û�");
		this.txtQuan1.addItem("******��ѡ��******");
		this.txtQuan1.addItem("����Ա");
		this.txtQuan1.addItem("��ͨ�û�");
	}

	public void txtName_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			txtPassword.requestFocus();
		}
	}

	public void txtPassword_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		}
	}

	public void txtID_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			btnTian.requestFocus();
		}
	}

	public void jTree1_valueChanged(TreeSelectionEvent e) {
		DefaultMutableTreeNode temp = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();

		String name = temp.toString();

		if (name.equals("����û���Ϣ")) {
			this.cardLayout1.show(this.jPanel1, "jPanel2");
		} else if (name.equals("ɾ���û���Ϣ")) {
			this.cardLayout1.show(this.jPanel1, "jPanel3");
		} else if (name.equals("�޸��û���Ϣ")) {
			this.cardLayout1.show(this.jPanel1, "jPanel4");
		} else if (name.equals("������ѯ�û���Ϣ")) {
			this.cardLayout1.show(this.jPanel1, "jPanel5");
		} else if (name.equals("��ѯȫ���û���Ϣ")) {
			this.cardLayout1.show(this.jPanel1, "QuanBuCha");
		}
	}

	public void btnShan_actionPerformed(ActionEvent e) {
		String Name = (String) txtUserName.getText();

		// ��ѧ�ŷ�װ��һ��ʵ��������У������ڲ�ͬ�㴫������
		User stu = new User();
		stu.setUsername(Name);

		// ɾ��
		UserBusiness.delete(stu);
		javax.swing.JOptionPane.showMessageDialog(this, "ɾ���ɹ���");
	}

	public void btnTian_actionPerformed(ActionEvent e) {
		String Name = (String) txtName.getText();
		String MiMa = new String(txtPassword.getPassword());

		String ID = (String) txtQuan.getSelectedItem();
		User stu = new User();
		stu.setUsername(Name);
		ArrayList arr = UserBusiness.select(stu);
		if (!arr.isEmpty()) {
			javax.swing.JOptionPane.showMessageDialog(this, "���û������ڣ�");
			return;
		}
		if (Name.length() == 0 || MiMa.length() == 0) {
			javax.swing.JOptionPane.showMessageDialog(this, " �û��������벻��Ϊ�գ�");
			return;
		} else if (MiMa.length() < 6) {
			javax.swing.JOptionPane.showMessageDialog(this, "���벻��С��6λ��");
			return;

		} else {
			User temp = new User();
			temp.setUsername(Name);
			temp.setPassword(MiMa);
			if (ID.equals("����Ա"))
				temp.setPopedomId(0);
			else if (ID.equals("��ͨ�û�"))
				temp.setPopedomId(1);
			UserBusiness.insert(temp);
			javax.swing.JOptionPane.showMessageDialog(this, "��ӳɹ���");
			this.txtName.setText("");
			this.txtPassword.setText("");

			this.txtName.requestFocus();

		}
	}

	public void txtMing_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			txtMiMa.requestFocus();
		}

	}

	public void txtMiMa_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		}
	}

	public void txtQid_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			btnXiou.requestFocus();
		}
	}

	public void txtYMing_keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			btnCha.requestFocus();
		}
	}

	public void btnCha_actionPerformed(ActionEvent e) {
		User stu = new User();
		// �����û�����Ҫ���ҵ�ѧԱ����.
		Popedom stu1 = new Popedom(); 
		String xingMing = (String) txtYMing.getText();
		// ��ѧԱ������װ��һ��ʵ��������У������ڲ�ͬ�㴫�����ݡ�
		stu.setUsername(xingMing);

		// ����ҵ���෽�������ؼ��������
		ArrayList arr = UserBusiness.select(stu);

		// ���û���κ�ѧԱ��¼
		if (arr.isEmpty())
			System.out.println("û���ҵ��κο���¼!");
		else {
			// ѭ����ʾ��������ÿ��ѧԱ����Ϣ
			System.out.println("\nһ��" + arr.size() + "��������Ϣ���£�");
			for (int i = 0; i < arr.size(); i++) {
				stu = (User) arr.get(i);
				txtYMiMa.setText("" + stu.getPassword());
				int xing = stu.getPopedomId();
				stu1.setID(xing);
				ArrayList brr = PopedomBusiness.select(stu1);
				for (int j = 0; j < brr.size(); j++) {
					stu1 = (Popedom) brr.get(j);
					txtYID.setText("" + stu1.getID());
				}

			}
		}
	}

	public void btnQian_actionPerformed(ActionEvent e) {
		Popedom stu1 = new Popedom();
		weiZhi = 0;
		User stu = (User) arr.get(weiZhi);
		// ��ƽ����ı����е�ֵ
		this.txtHMing.setText("" + stu.getUsername());
		this.txtHMiMa.setText(stu.getPassword());
		int xing = stu.getPopedomId();
		ArrayList brr = PopedomBusiness.select(stu1);
		for (int j = 0; j < brr.size(); j++) {
			stu1 = (Popedom) brr.get(j);
			txtHID.setText("" + stu1.getPopedomName());
		}

	}

	public void btnZhou_actionPerformed(ActionEvent e) {
		Popedom stu1 = new Popedom();
		weiZhi--;
		if (weiZhi < 0) // �ж��Ƿ��ǵ�һ����¼
			weiZhi = 0;
		User stu = (User) arr.get(weiZhi);
		// ��ƽ����ı����е�ֵ
		this.txtHMing.setText("" + stu.getUsername());
		this.txtHMiMa.setText(stu.getPassword());
		int xing = stu.getPopedomId();
		ArrayList brr = PopedomBusiness.select(stu1);
		for (int j = 0; j < brr.size(); j++) {
			stu1 = (Popedom) brr.get(j);
			txtHID.setText("" + stu1.getPopedomName());
		}

	}

	public void btnYou_actionPerformed(ActionEvent e) {
		Popedom stu1 = new Popedom();
		weiZhi++;
		if (weiZhi > (arr.size() - 1)) // �ж��Ƿ������һ����¼
			weiZhi = arr.size() - 1;
		User stu = (User) arr.get(weiZhi);
		// ��ƽ����ı����е�ֵ
		this.txtHMing.setText("" + stu.getUsername());
		this.txtHMiMa.setText(stu.getPassword());
		int xing = stu.getPopedomId();
		ArrayList brr = PopedomBusiness.select(stu1);
		for (int j = 0; j < brr.size(); j++) {
			stu1 = (Popedom) brr.get(j);
			txtHID.setText("" + stu1.getPopedomName());
		}

	}

	public void btnHou_actionPerformed(ActionEvent e) {
		Popedom stu1 = new Popedom();
		weiZhi = arr.size() - 1;
		User stu = (User) arr.get(weiZhi);
		// ��ƽ����ı����е�ֵ
		this.txtHMing.setText("" + stu.getUsername());
		this.txtHMiMa.setText(stu.getPassword());
		int xing = stu.getPopedomId();
		ArrayList brr = PopedomBusiness.select(stu1);
		for (int j = 0; j < brr.size(); j++) {
			stu1 = (Popedom) brr.get(j);
			txtHID.setText("" + stu1.getPopedomName());
		}

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
		String Name = (String) txtMing.getText();
		String MiMa = new String(txtMiMa.getPassword());

		String ID = (String) txtQuan1.getSelectedItem();

		User temp = new User();
		temp.setUsername(Name);
		temp.setPassword(MiMa);
		if (ID.equals("����Ա"))
			temp.setPopedomId(0);
		else if (ID.equals("��ͨ�û�"))
			temp.setPopedomId(1);
		UserBusiness.update(temp);
		javax.swing.JOptionPane.showMessageDialog(this, "�޸ĳɹ���");
	}

	public void btnTui_actionPerformed(ActionEvent e) {
		this.setVisible(false);
	}
}

class UserFrame_btnTui_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnTui_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnTui_actionPerformed(e);
	}
}

class UserFrame_btnXiou_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnXiou_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnXiou_actionPerformed(e);
	}
}

class UserFrame_jButton5_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_jButton5_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton5_actionPerformed(e);
	}
}

class UserFrame_jButton4_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_jButton4_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton4_actionPerformed(e);
	}
}

class UserFrame_jButton3_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_jButton3_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton3_actionPerformed(e);
	}
}

class UserFrame_jButton2_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_jButton2_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jButton2_actionPerformed(e);
	}
}

class UserFrame_btnHou_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnHou_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnHou_actionPerformed(e);
	}
}

class UserFrame_btnYou_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnYou_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnYou_actionPerformed(e);
	}
}

class UserFrame_btnZhou_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnZhou_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnZhou_actionPerformed(e);
	}
}

class UserFrame_btnQian_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnQian_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnQian_actionPerformed(e);
	}
}

class UserFrame_btnCha_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnCha_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnCha_actionPerformed(e);
	}
}

class UserFrame_txtYMing_keyAdapter extends KeyAdapter {
	private UserFrame adaptee;

	UserFrame_txtYMing_keyAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.txtYMing_keyPressed(e);
	}
}

class UserFrame_txtMiMa_keyAdapter extends KeyAdapter {
	private UserFrame adaptee;

	UserFrame_txtMiMa_keyAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.txtMiMa_keyPressed(e);
	}
}

class UserFrame_txtMing_keyAdapter extends KeyAdapter {
	private UserFrame adaptee;

	UserFrame_txtMing_keyAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.txtMing_keyPressed(e);
	}
}

class UserFrame_btnShan_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnShan_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnShan_actionPerformed(e);
	}
}

class UserFrame_txtPassword_keyAdapter extends KeyAdapter {
	private UserFrame adaptee;

	UserFrame_txtPassword_keyAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.txtPassword_keyPressed(e);
	}
}

class UserFrame_jTree1_treeSelectionAdapter implements TreeSelectionListener {
	private UserFrame adaptee;

	UserFrame_jTree1_treeSelectionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void valueChanged(TreeSelectionEvent e) {
		adaptee.jTree1_valueChanged(e);
	}
}

class UserFrame_txtName_keyAdapter extends KeyAdapter {
	private UserFrame adaptee;

	UserFrame_txtName_keyAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void keyPressed(KeyEvent e) {
		adaptee.txtName_keyPressed(e);
	}
}

class UserFrame_btnTian_actionAdapter implements ActionListener {
	private UserFrame adaptee;

	UserFrame_btnTian_actionAdapter(UserFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnTian_actionPerformed(e);
	}
}
