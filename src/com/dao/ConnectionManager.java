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
	private static final String DRIVER = "com.mysql.jdbc.Driver";		 //驱动固定代码
	private static final String URL = "jdbc:mysql://localhost:3306/wb";	 //URL
	private static final String user = "root";		//用户名
	private static final String pass = "123456";	//密码
	 
	public static Connection getConnection() {
		
		try {
			Class.forName(DRIVER);		           //加载驱动
			con = DriverManager.getConnection(URL,user, pass);	//建立连接
		} catch (Exception e) {
 e.printStackTrace();
		}
		//判断数据库连接是否成功,如果失败con的值应该是null
		if (con != null) {
			//System.out.println("数据库连接返回成功!"); //测试用代码
		} else {
			System.out.println("数据库连接返回失败!"); //测试用代码
		}
		return con;
	}

	/**
	 * 静态方法ConnectionClose: 关闭数据库的连接.
	 * 资源应该及时释放,用完数据库连接就关闭.
	 * 参数: Connection cnn代表需要关闭的数据库连接.
	 */
	public static void ConnectionClose(Connection cnn) {
		try {
			if (cnn.isClosed() == false && cnn != null)
				cnn.close();
		} catch (Exception e) {
			System.out.println("ConnectionManager类的ConnectionClose()方法有错误! : "
					+ e.getMessage());
		}
	}

	/**
	 * 静态方法ResultSetclose: 关闭纪录集.
	 * 资源应该及时释放,用完纪录集就关闭.
	 * 参数: ResultSet res代表需要关闭的纪录集.
	 */
	public static void ResultSetClose(ResultSet res) {
		try {
			if (res != null)
				res.close();
		} catch (Exception e) {
			System.out.println("ConnectionManager类的ResultSetClose()方法有错误! : "
					+ e.getMessage());
		}
	}

	/**
	 * 静态方法StatementClose: 关闭执行SQL命令的对象.
	 * 资源应该及时释放,用完执行SQL命令的对象就关闭.
	 * 参数: PreparedStatement pS代表执行SQL命令的对象.
	 */
	public static void StatementClose(PreparedStatement pS) {
		try {
			if (pS != null)
				pS.close();
		} catch (Exception e) {
			System.out.println("ConnectionManager类的ResultSetClose()方法有错误! : "
					+ e.getMessage());
		}
	}
	public static void main(String[] args) {
		getConnection();
	}
}
