package com.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.model.Computer;
import com.model.Record;
import com.view.Card.CardDome;
import com.view.Computer.ComputerDome;
import com.view.Member.MemberDome;
import com.view.Record.RecordDome;
import com.view.User.UserFrame;

//������

public class MainFrame extends JFrame {

	private Image image;
	private static final long serialVersionUID = -1588458291133087637L;
	JPanel contentPane; // panel����

	JMenuBar jMenuBar1 = new JMenuBar(); // �˵���
	JMenu jMenu1 = new JMenu(); // ������Ϣ
	JMenu jMenu2 = new JMenu(); // �߼�����
	JMenu jMenu3 = new JMenu();
	JMenuItem jMenuItem1 = new JMenuItem();
	JMenuItem jMenuItem2 = new JMenuItem();
	JMenuItem jMenuItem3 = new JMenuItem();
	JMenuItem jMenuItem4 = new JMenuItem();
	// JMenuItem jMenuItem5 = new JMenuItem();
	// JPopupMenu jPopupMenu1 = new JPopupMenu();
	// JMenuItem jMenuItem6 = new JMenuItem();
	// JMenuItem jMenuItem7 = new JMenuItem();
	// JMenuItem jMenuItem8 = new JMenuItem();
	// JMenuItem jMenuItem9 = new JMenuItem();
	JMenuItem jMenuItem10 = new JMenuItem();
	JMenuItem jMenuItem11 = new JMenuItem();
	// JMenuItem jMenuItem12 = new JMenuItem();

	public MainFrame() {
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);// ���Ӵ���ر��¼�
			jbInit(); // ��ʼ������
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		contentPane = (JPanel) getContentPane();
		contentPane.setLayout(null); // ��ʼ������
		this.setJMenuBar(jMenuBar1); // �������������Ӳ˵���

		setSize(new Dimension(700, 600)); // ���ô����С
		setTitle("���ɹ���ϵͳ"); // ���ô������
		jMenu1.setText("ϵͳ����"); // ���ô���һ���˵�
		jMenu2.setText("������Ϣ"); // ���ô���һ���˵�
		jMenu3.setText("�߼����� "); // ���ô���һ���˵�

		

		jMenuItem10.setText("�û�����");
		jMenuItem10.addActionListener(new JieFrame_jMenuItem10_actionAdapter(this));
		jMenuItem11.setText("�˳�");
		jMenuItem11.addActionListener(new JieFrame_jMenuItem11_actionAdapter(this));

		jMenuItem3.setText("�������Ϣ");
		jMenuItem3.addActionListener(new JieFrame_jMenuItem3_actionAdapter(this));
		jMenuItem2.setText("��������Ϣ");
		jMenuItem2.addActionListener(new JieFrame_jMenuItem2_actionAdapter(this));

		jMenuItem4.setText("������Ϣ");
		jMenuItem4.addActionListener(new JieFrame_jMenuItem4_actionAdapter(this));
		jMenuItem1.setText("��Ա��Ϣ");
		jMenuItem1.addActionListener(new JieFrame_jMenuItem1_actionAdapter(this));

		jMenuBar1.add(jMenu1);
		jMenuBar1.add(jMenu2);
		jMenuBar1.add(jMenu3);

		jMenu1.add(jMenuItem10);
		jMenu1.add(jMenuItem11);

		jMenu2.add(jMenuItem3);
		jMenu2.add(jMenuItem2);

		jMenu3.add(jMenuItem1);
		jMenu3.add(jMenuItem4);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
//
//		JPanel contentPane1 = new JPanel() {
//			@Override
//			public void paint(Graphics g) {
//				ImageIcon icon = new ImageIcon("C:\\Users\\Administrator\\Desktop\\e.jpg");
//				image = icon.getImage();
//				g.drawImage(image, 0, 0, null);
//				// TODO Auto-generated method stub
//
//			}
//		};
//		this.add(contentPane1);
//		this.setVisible(true);

	}

	class JieFrame_jMenuItem10_actionAdapter implements ActionListener {
		private MainFrame adaptee;

		JieFrame_jMenuItem10_actionAdapter(MainFrame adaptee) {
			this.adaptee = adaptee;
		}

		public void actionPerformed(ActionEvent e) {
			adaptee.jMenuItem10_actionPerformed(e);
		}
	}

	class JieFrame_jMenuItem11_actionAdapter implements ActionListener {
		private MainFrame adaptee;

		JieFrame_jMenuItem11_actionAdapter(MainFrame adaptee) {
			this.adaptee = adaptee;
		}

		public void actionPerformed(ActionEvent e) {
			adaptee.jMenuItem11_actionPerformed(e);
		}
	}

	class JieFrame_jMenuItem3_actionAdapter implements ActionListener {
		private MainFrame adaptee;

		JieFrame_jMenuItem3_actionAdapter(MainFrame adaptee) {
			this.adaptee = adaptee;
		}

		public void actionPerformed(ActionEvent e) {
			adaptee.jMenuItem3_actionPerformed(e);
		}
	}

	class JieFrame_jMenuItem2_actionAdapter implements ActionListener {
		private MainFrame adaptee;

		JieFrame_jMenuItem2_actionAdapter(MainFrame adaptee) {
			this.adaptee = adaptee;
		}

		public void actionPerformed(ActionEvent e) {
			adaptee.jMenuItem2_actionPerformed(e);
		}
	}

	class JieFrame_jMenuItem4_actionAdapter implements ActionListener {
		private MainFrame adaptee;

		JieFrame_jMenuItem4_actionAdapter(MainFrame adaptee) {
			this.adaptee = adaptee;
		}

		public void actionPerformed(ActionEvent e) {
			adaptee.jMenuItem4_actionPerformed(e);
		}
	}

	class JieFrame_jMenuItem1_actionAdapter implements ActionListener {
		private MainFrame adaptee;

		JieFrame_jMenuItem1_actionAdapter(MainFrame adaptee) {
			this.adaptee = adaptee;
		}

		public void actionPerformed(ActionEvent e) {
			adaptee.jMenuItem1_actionPerformed(e);
		}
	}

	////////////////////////////////////////////

	// public void contentPane_mouseClicked(MouseEvent e) {
	// jPopupMenu1.show(this.contentPane,e.getX(),e.getY());
	// }

	public void jMenuItem11_actionPerformed(ActionEvent e) {
		Computer gen = new Computer();
		gen.setId(Record.computerId);
		gen.setOnUse(0);
		gen.setNotes("����");
		ZhuFrame f = new ZhuFrame();
		f.setVisible(true);
		this.setVisible(false);
	}

	public void jMenuItem7_actionPerformed(ActionEvent e) {
		CardDome f = new CardDome();
		f.setVisible(true);
	}

	public void jMenuItem2_actionPerformed(ActionEvent e) {
		CardDome f = new CardDome();
		f.setVisible(true);
	}

	public void jMenuItem3_actionPerformed(ActionEvent e) {
		ComputerDome f = new ComputerDome();
		f.setVisible(true);
	}

	public void jMenuItem8_actionPerformed(ActionEvent e) {
		ComputerDome f = new ComputerDome();
		f.setVisible(true);
	}

	public void jMenuItem12_actionPerformed(ActionEvent e) {
		/* �ѻ�����λ����״̬ */
		Computer gen = new Computer();
		gen.setId(Record.computerId);
		gen.setOnUse(0);
		gen.setNotes("����");
		ZhuFrame f = new ZhuFrame();
		f.setVisible(true);
		this.setVisible(false);

	}

	public void jButton2_actionPerformed(ActionEvent e) {
		CardDome f = new CardDome();
		f.setVisible(true);
	}

	public void jButton3_actionPerformed(ActionEvent e) {
		ComputerDome f = new ComputerDome();
		f.setVisible(true);
	}

	public void jButton1_actionPerformed(ActionEvent e) {
		MemberDome f = new MemberDome();
		f.setVisible(true);
	}

	// public void jMenuItem6_actionPerformed(ActionEvent e) {
	// MemberDome f=new MemberDome();
	// f.setVisible(true);
	// }

	public void jMenuItem1_actionPerformed(ActionEvent e) {
		MemberDome f = new MemberDome();
		f.setVisible(true);
	}

	public void jButton5_actionPerformed(ActionEvent e) {
		UserFrame f = new UserFrame();
		f.setVisible(true);
	}

	public void jMenuItem10_actionPerformed(ActionEvent e) {
		UserFrame f = new UserFrame();
		f.setVisible(true);
	}

	public void jMenuItem5_actionPerformed(ActionEvent e) {
		UserFrame f = new UserFrame();
		f.setVisible(true);
	}

	public void jButton4_actionPerformed(ActionEvent e) {
		RecordDome f = new RecordDome();
		f.setVisible(true);
	}

	public void jMenuItem4_actionPerformed(ActionEvent e) {
		RecordDome f = new RecordDome();
		f.setVisible(true);
	}
	//
	// public void jMenuItem9_actionPerformed(ActionEvent e) {
	// RecordDome f=new RecordDome();
	// f.setVisible(true);
	// }
}

//
// class JieFrame_jMenuItem9_actionAdapter implements ActionListener {
// private MainFrame adaptee;
// JieFrame_jMenuItem9_actionAdapter(MainFrame adaptee) {
// this.adaptee = adaptee;
// }
//
// public void actionPerformed(ActionEvent e) {
// adaptee.jMenuItem9_actionPerformed(e);
// }
// }

// class JieFrame_jMenuItem5_actionAdapter implements ActionListener {
// private MainFrame adaptee;
// JieFrame_jMenuItem5_actionAdapter(MainFrame adaptee) {
// this.adaptee = adaptee;
// }
//
// public void actionPerformed(ActionEvent e) {
// adaptee.jMenuItem5_actionPerformed(e);
// }
// }
//
//
//
//

// class JieFrame_jMenuItem6_actionAdapter implements ActionListener {
// private MainFrame adaptee;
// JieFrame_jMenuItem6_actionAdapter(MainFrame adaptee) {
// this.adaptee = adaptee;
// }
//
// public void actionPerformed(ActionEvent e) {
// adaptee.jMenuItem6_actionPerformed(e);
// }
// }

//
// class JieFrame_jMenuItem12_actionAdapter implements ActionListener {
// private MainFrame adaptee;
// JieFrame_jMenuItem12_actionAdapter(MainFrame adaptee) {
// this.adaptee = adaptee;
// }
//
// public void actionPerformed(ActionEvent e) {
// adaptee.jMenuItem12_actionPerformed(e);
// }
// }

//
// class JieFrame_jMenuItem7_actionAdapter implements ActionListener {
// private MainFrame adaptee;
// JieFrame_jMenuItem7_actionAdapter(MainFrame adaptee) {
// this.adaptee = adaptee;
// }
//
// public void actionPerformed(ActionEvent e) {
// adaptee.jMenuItem7_actionPerformed(e);
// }
// }

// class JieFrame_jMenuItem8_actionAdapter implements ActionListener {
// private MainFrame adaptee;
// JieFrame_jMenuItem8_actionAdapter(MainFrame adaptee) {
// this.adaptee = adaptee;
// }
//
// public void actionPerformed(ActionEvent e) {
// adaptee.jMenuItem8_actionPerformed(e);
// }
// }
//
//

// class JieFrame_contentPane_mouseAdapter extends MouseAdapter {
// private MainFrame adaptee;
// JieFrame_contentPane_mouseAdapter(MainFrame adaptee) {
// this.adaptee = adaptee;
// }
//
// public void mouseClicked(MouseEvent e) {
// adaptee.contentPane_mouseClicked(e);
// }
// }
