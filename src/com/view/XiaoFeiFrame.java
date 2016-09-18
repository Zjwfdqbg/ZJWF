package com.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.*;

import com.business.ComBusiness;
import com.business.RecordBuiness;
import com.dao.ConnectionManager;
import com.business.CardBusiness;
import com.model.Card;
import com.model.Computer;
import com.model.Record;

import java.text.SimpleDateFormat;

/**
 * <p>
 * Title:
 * </p>
 *
 * <p>
 * Description:
 * </p>
 *
 * <p>
 * Copyright: Copyright (c) 2007
 * </p>
 *
 * <p>
 * Company:
 * </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class XiaoFeiFrame extends JFrame {
	JPanel contentPane;
	JLabel txtCard = new JLabel();
	JLabel jLabel2 = new JLabel();// ��id
	JLabel jLabel3 = new JLabel();// ����id
	JLabel txtComputer = new JLabel();
	JLabel jLabel5 = new JLabel();// �ϻ�ʱ��
	JLabel txtShangTime = new JLabel();
	JLabel jLabel7 = new JLabel();// ���ѽ��
	JLabel txtXiao = new JLabel();
	JLabel jLabel9 = new JLabel();// �������
	JLabel txtYu = new JLabel();
	JButton btnCha = new JButton();// ��ѯ
	JButton btnXia = new JButton();// �»�
	JLabel jLabel1 = new JLabel();
	JLabel txtDangTime = new JLabel();

	public XiaoFeiFrame() {
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
		contentPane.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(new Dimension(600, 600));
		setTitle("������Ϣ");
		txtCard.setText("");
		txtCard.setBounds(new Rectangle(148, 30, 205, 33));
		jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel2.setText("��ID");
		jLabel2.setBounds(new Rectangle(96, 29, 53, 35));
		jLabel3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel3.setText("����ID");
		jLabel3.setBounds(new Rectangle(87, 79, 56, 26));
		txtComputer.setText("");
		txtComputer.setBounds(new Rectangle(146, 75, 162, 31));

		jLabel5.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel5.setText("�ϻ�ʱ��");
		jLabel5.setBounds(new Rectangle(79, 120, 59, 27));

		// jLabel1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		// jLabel1.setText("��ǰʱ��");
		// jLabel1.setBounds(new Rectangle(79, 120, 59, 27));
		txtShangTime.setText("");
		txtShangTime.setBounds(new Rectangle(143, 113, 151, 38));
		jLabel7.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel7.setText("���ѽ��");
		jLabel7.setBounds(new Rectangle(80, 186, 59, 32));
		txtXiao.setText("");
		txtXiao.setBounds(new Rectangle(150, 189, 130, 33));
		jLabel9.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel9.setText("���");
		jLabel9.setBounds(new Rectangle(99, 225, 33, 28));
		txtYu.setText("");
		txtYu.setBounds(new Rectangle(156, 230, 127, 27));
		btnCha.setBounds(new Rectangle(80, 286, 75, 26));
		btnCha.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		btnCha.setText("��ѯ");
		btnCha.addActionListener(new XiaoFeiFrame_btnCha_actionAdapter(this));
		btnXia.setBounds(new Rectangle(257, 285, 73, 26));
		btnXia.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		btnXia.setText("�»�");
		btnXia.addActionListener(new XiaoFeiFrame_btnXia_actionAdapter(this));
		jLabel1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel1.setText("��ǰʱ��");
		jLabel1.setBounds(new Rectangle(79, 154, 59, 27));
		txtDangTime.setText("");
		txtDangTime.setBounds(new Rectangle(135, 154, 175, 28));
		contentPane.add(txtCard);
		contentPane.add(txtComputer);
		contentPane.add(txtShangTime);
		contentPane.add(txtXiao);
		contentPane.add(btnCha);
		contentPane.add(btnXia);
		contentPane.add(txtDangTime);
		contentPane.add(txtYu);
		contentPane.add(jLabel3);
		contentPane.add(jLabel5);
		contentPane.add(jLabel7);
		contentPane.add(jLabel9);
		contentPane.add(jLabel2);
		contentPane.add(jLabel1);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

	}

	public void btnCha_actionPerformed(ActionEvent e) {
		/* ��ѯ��Ϊ�õ��Ŀ���,�ϻ���ʱ��,����Id. */
		txtCard.setText(Record.cardId);
		txtComputer.setText(Record.computerId);
		txtShangTime.setText(Record.beginTime);
		Date Time = new Date();
		SimpleDateFormat df;
		df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String bs = df.format(Time);
		double fee;
		Record r = new Record();
		r.setCardId(Record.cardId);
		if (RecordBuiness.judge(r)) {
			fee = JiSuan.FeiYong(bs);
			double yu = Record.balance - fee;
			txtDangTime.setText(bs);
			txtXiao.setText("" + fee);
			txtYu.setText("" + yu);
		} else {
			fee =  2*JiSuan.FeiYong(bs);
			double yu = Record.balance - fee;
			txtDangTime.setText(bs);
			txtXiao.setText("" + fee);
			txtYu.setText("" + yu);
			//System.out.println(333333);
		}
	}

	public void btnXia_actionPerformed(ActionEvent e) {
		/* �»����� */
		txtCard.setText(Record.cardId);
		txtComputer.setText(Record.computerId);
		txtShangTime.setText(Record.beginTime);

		/* �õ�һ���µ�ʱ��Ϊ�»�ʱ�� */
		Date Time = new Date();
		SimpleDateFormat df;
		df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String as = df.format(Time);
		Record r = new Record();
		double fee;
		double yu;
		r.setCardId(Record.cardId);
		if(RecordBuiness.judge(r))
			{
//		double fee = JiSuan.FeiYong(as); // ���»�ʱ�䴫��JiSuan�����н������ѽ��ļ���
			fee = JiSuan.FeiYong(as);
			 yu = Record.balance - fee;
			txtDangTime.setText(as);
			txtXiao.setText("" + fee);
			txtYu.setText("" + yu);
		}else{
			fee = 2*JiSuan.FeiYong(as);
			 yu = Record.balance - fee; // �������
			 
		txtDangTime.setText(as);
		txtXiao.setText("" + fee); // ���ѽ��
		txtYu.setText("" + yu);} // �����
		
		
		/* ��������Ϣ�������ѱ� */
		Record Cha = new Record();
		Cha.setCardId(Record.cardId);
		Cha.setComputerId(Record.computerId);
		Cha.setBeginTime(Record.beginTime);
		Cha.setBeginTime(Record.beginTime);
		Cha.setEndTime(as);
		Cha.setBalance(yu);
		RecordBuiness.insert(Cha);
		/* ���¿������ */
		Card s = new Card();
		s.setId(Record.cardId);
		s.setBalance(yu);
		CardBusiness.GengXin(s);
		/* �ѻ�����λ����״̬ */
		Computer gen = new Computer();
		gen.setId(Record.computerId);
		gen.setOnUse(0);
		gen.setNotes("����");
		ComBusiness.update(gen);
		/* �˳� */
		System.exit(1);

	}
}

class XiaoFeiFrame_btnXia_actionAdapter implements ActionListener {
	private XiaoFeiFrame adaptee;

	XiaoFeiFrame_btnXia_actionAdapter(XiaoFeiFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnXia_actionPerformed(e);
	}
}

class XiaoFeiFrame_btnCha_actionAdapter implements ActionListener {
	private XiaoFeiFrame adaptee;

	XiaoFeiFrame_btnCha_actionAdapter(XiaoFeiFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.btnCha_actionPerformed(e);
	}
}
