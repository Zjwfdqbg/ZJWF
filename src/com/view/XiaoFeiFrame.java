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
	JLabel jLabel2 = new JLabel();// 卡id
	JLabel jLabel3 = new JLabel();// 机器id
	JLabel txtComputer = new JLabel();
	JLabel jLabel5 = new JLabel();// 上机时间
	JLabel txtShangTime = new JLabel();
	JLabel jLabel7 = new JLabel();// 消费金额
	JLabel txtXiao = new JLabel();
	JLabel jLabel9 = new JLabel();// 消费余额
	JLabel txtYu = new JLabel();
	JButton btnCha = new JButton();// 查询
	JButton btnXia = new JButton();// 下机
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
		setTitle("消费信息");
		txtCard.setText("");
		txtCard.setBounds(new Rectangle(148, 30, 205, 33));
		jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel2.setText("卡ID");
		jLabel2.setBounds(new Rectangle(96, 29, 53, 35));
		jLabel3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel3.setText("机器ID");
		jLabel3.setBounds(new Rectangle(87, 79, 56, 26));
		txtComputer.setText("");
		txtComputer.setBounds(new Rectangle(146, 75, 162, 31));

		jLabel5.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel5.setText("上机时间");
		jLabel5.setBounds(new Rectangle(79, 120, 59, 27));

		// jLabel1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		// jLabel1.setText("当前时间");
		// jLabel1.setBounds(new Rectangle(79, 120, 59, 27));
		txtShangTime.setText("");
		txtShangTime.setBounds(new Rectangle(143, 113, 151, 38));
		jLabel7.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel7.setText("消费金额");
		jLabel7.setBounds(new Rectangle(80, 186, 59, 32));
		txtXiao.setText("");
		txtXiao.setBounds(new Rectangle(150, 189, 130, 33));
		jLabel9.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel9.setText("余额");
		jLabel9.setBounds(new Rectangle(99, 225, 33, 28));
		txtYu.setText("");
		txtYu.setBounds(new Rectangle(156, 230, 127, 27));
		btnCha.setBounds(new Rectangle(80, 286, 75, 26));
		btnCha.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		btnCha.setText("查询");
		btnCha.addActionListener(new XiaoFeiFrame_btnCha_actionAdapter(this));
		btnXia.setBounds(new Rectangle(257, 285, 73, 26));
		btnXia.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		btnXia.setText("下机");
		btnXia.addActionListener(new XiaoFeiFrame_btnXia_actionAdapter(this));
		jLabel1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 13));
		jLabel1.setText("当前时间");
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
		/* 查询把为得到的卡号,上机器时间,机器Id. */
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
		/* 下机功能 */
		txtCard.setText(Record.cardId);
		txtComputer.setText(Record.computerId);
		txtShangTime.setText(Record.beginTime);

		/* 得到一个新的时间为下机时间 */
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
//		double fee = JiSuan.FeiYong(as); // 把下机时间传导JiSuan方法中进行消费金额的计算
			fee = JiSuan.FeiYong(as);
			 yu = Record.balance - fee;
			txtDangTime.setText(as);
			txtXiao.setText("" + fee);
			txtYu.setText("" + yu);
		}else{
			fee = 2*JiSuan.FeiYong(as);
			 yu = Record.balance - fee; // 计算余额
			 
		txtDangTime.setText(as);
		txtXiao.setText("" + fee); // 消费金额
		txtYu.setText("" + yu);} // 卡余额
		
		
		/* 把消费信息插入消费表 */
		Record Cha = new Record();
		Cha.setCardId(Record.cardId);
		Cha.setComputerId(Record.computerId);
		Cha.setBeginTime(Record.beginTime);
		Cha.setBeginTime(Record.beginTime);
		Cha.setEndTime(as);
		Cha.setBalance(yu);
		RecordBuiness.insert(Cha);
		/* 更新卡的余额 */
		Card s = new Card();
		s.setId(Record.cardId);
		s.setBalance(yu);
		CardBusiness.GengXin(s);
		/* 把机器该位闲置状态 */
		Computer gen = new Computer();
		gen.setId(Record.computerId);
		gen.setOnUse(0);
		gen.setNotes("闲置");
		ComBusiness.update(gen);
		/* 退出 */
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
