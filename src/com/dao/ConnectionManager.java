package com.dao;

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
import java.sql.*;

public final class ConnectionManager {
	private static Connection con = null;
	private static final String DRIVER = "com.mysql.jdbc.Driver";		 //�����̶�����
	private static final String URL = "jdbc:mysql://localhost:3306/wb";	 //URL
	private static final String user = "root";		//�û���
	private static final String pass = "123456";	//����
	 
	public static Connection getConnection() {
		
		try {
			Class.forName(DRIVER);		           //��������
			con = DriverManager.getConnection(URL,user, pass);	//��������
		} catch (Exception e) {
 e.printStackTrace();
		}
		//�ж����ݿ������Ƿ�ɹ�,���ʧ��con��ֵӦ����null
		if (con != null) {
			//System.out.println("���ݿ����ӷ��سɹ�!"); //�����ô���
		} else {
			System.out.println("���ݿ����ӷ���ʧ��!"); //�����ô���
		}
		return con;
	}

	/**
	 * ��̬����ConnectionClose: �ر����ݿ������.
	 * ��ԴӦ�ü�ʱ�ͷ�,�������ݿ����Ӿ͹ر�.
	 * ����: Connection cnn������Ҫ�رյ����ݿ�����.
	 */
	public static void ConnectionClose(Connection cnn) {
		try {
			if (cnn.isClosed() == false && cnn != null)
				cnn.close();
		} catch (Exception e) {
			System.out.println("ConnectionManager���ConnectionClose()�����д���! : "
					+ e.getMessage());
		}
	}

	/**
	 * ��̬����ResultSetclose: �رռ�¼��.
	 * ��ԴӦ�ü�ʱ�ͷ�,�����¼���͹ر�.
	 * ����: ResultSet res������Ҫ�رյļ�¼��.
	 */
	public static void ResultSetClose(ResultSet res) {
		try {
			if (res != null)
				res.close();
		} catch (Exception e) {
			System.out.println("ConnectionManager���ResultSetClose()�����д���! : "
					+ e.getMessage());
		}
	}

	/**
	 * ��̬����StatementClose: �ر�ִ��SQL����Ķ���.
	 * ��ԴӦ�ü�ʱ�ͷ�,����ִ��SQL����Ķ���͹ر�.
	 * ����: PreparedStatement pS����ִ��SQL����Ķ���.
	 */
	public static void StatementClose(PreparedStatement pS) {
		try {
			if (pS != null)
				pS.close();
		} catch (Exception e) {
			System.out.println("ConnectionManager���ResultSetClose()�����д���! : "
					+ e.getMessage());
		}
	}
	public static void main(String[] args) {
		getConnection();
	}
}
