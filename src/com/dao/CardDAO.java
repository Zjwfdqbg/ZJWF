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
import com.model.Card;

import java.sql.*;
import java.util.*;
public class CardDAO {
    public CardDAO() {
    }
    public void insert(Card stu) {

    //声明一个数据库连接对象
    Connection con = null;
    //声明一个执行命令的对象
    PreparedStatement ps = null;

    try {
        /** 数据库操作系列代码*/

        //调用ConnectionManager的静态方法,建立数据库连接.
        con = ConnectionManager.getConnection();

        //数据库操作的SQL语句
        String sq = "insert into card (Id,MemberId,password,balance)" +
                    "       values (?,?,?,?)";
        //建立一个PreparedStatement对象执行SQL语句。
        ps = con.prepareStatement(sq);

        //设置命令参数.
        ps.setString(1,stu.getId());
        ps.setString(2,stu.getMemberId());
        ps.setString(3, stu.getPassword());
        ps.setDouble(4,stu.getBalance());

        //执行SQL语句
        ps.executeUpdate();

        System.out.println("添加信息完成了!");

    } catch (Exception e) {
        System.out.println("CardDAO类的insert()方法有错误! : "
                           + e.getMessage());
    } finally {

        /** 释放资源系列代码*/
        ConnectionManager.StatementClose(ps); //释放执行命令的对象
        ConnectionManager.ConnectionClose(con); //关闭数据库连接
    }
}

public void delete(Card stu) {

    //声明一个数据库连接对象
    Connection con = null;
    //声明一个执行命令的对象
    PreparedStatement ps = null;

    try {
        /** 数据库操作系列代码*/

        //调用ConnectionManager的静态方法,建立数据库连接.
        con = ConnectionManager.getConnection();

        //数据库操作的SQL语句
        String sq = "delete from card " +
                    " where Id=?";

        //建立一个PreparedStatement对象执行SQL语句。
        ps = con.prepareStatement(sq);

        //设置命令参数.
        ps.setString(1, stu.getId());

        //执行SQL语句
        ps.executeUpdate();

        System.out.println("删除信息完成了!");

    } catch (Exception e) {
        System.out.println("CardDAO类的delete()方法有错误! : "
                           + e.getMessage());
    } finally {

        /** 释放资源系列代码*/
        ConnectionManager.StatementClose(ps); //释放执行命令的对象
        ConnectionManager.ConnectionClose(con); //关闭数据库连接
    }
}


public void update(Card stu) {
    //声明一个数据库连接对象
    Connection con = null;
    //声明一个执行命令的对象
    PreparedStatement ps = null;

    try {
        /** 数据库操作系列代码*/

        //调用ConnectionManager的静态方法,建立数据库连接.
        con = ConnectionManager.getConnection();

        //数据库操作的SQL语句
        String sq = "UPDATE card" +
                    " SET   password=?,balance=?" +
                    " WHERE Id=?";

        //建立一个PreparedStatement对象执行SQL语句。
        ps = con.prepareStatement(sq);

        //设置命令参数.

        ps.setString(1, stu.getPassword());
        ps.setDouble(2, stu.getBalance());
        ps.setString(3,stu.getId());


        //执行SQL语句
        ps.executeUpdate();

        System.out.println("修改信息完成了!");

    } catch (Exception e) {
        System.out.println("CardDAO类的update()方法有错误! : "
                           + e.getMessage());
    } finally {

        /** 释放资源系列代码*/
        ConnectionManager.StatementClose(ps); //释放执行命令的对象
        ConnectionManager.ConnectionClose(con); //关闭数据库连接
    }
}
public void GengXin(Card stu) {

    //声明一个数据库连接对象
    Connection con = null;
    //声明一个执行命令的对象
    PreparedStatement ps = null;

    try {
        /** 数据库操作系列代码*/

        //调用ConnectionManager的静态方法,建立数据库连接.
        con = ConnectionManager.getConnection();

        //数据库操作的SQL语句
        String sq =  "UPDATE card" +
                     "   SET   balance=?" +
                     "   WHERE Id=?";

        //建立一个PreparedStatement对象执行SQL语句。
        ps = con.prepareStatement(sq);

        //设置命令参数.


        ps.setDouble(1, stu.getBalance());
        ps.setString(2,stu.getId());


        //执行SQL语句
        ps.executeUpdate();

        System.out.println("修改完成了!");

    } catch (Exception e) {
        System.out.println("CardDAO类的GengXin()方法有错误! : "
                           + e.getMessage());
    } finally {

        /** 释放资源系列代码*/
        ConnectionManager.StatementClose(ps); //释放执行命令的对象
        ConnectionManager.ConnectionClose(con); //关闭数据库连接
    }
}


/**
 * 查找全部学员信息的方法
 * 返回值是: 查找到的学员(ArrayList数组)
 */
public ArrayList chaXun() {

    //声明一个数据库连接对象
    Connection con = null;
    //声明一个执行命令的对象
    PreparedStatement ps = null;
    //声明一个存储纪录集的对象
    ResultSet rs = null;
    //集合类对象
    ArrayList arr = new ArrayList();

    try {
        /** 数据库操作系列代码*/

        //拼接数据库操作的SQL语句
        String sq = "select * from card";

        //调用ConnectionManager的静态方法,建立数据库连接.
        con = ConnectionManager.getConnection();

        //建立一个PreparedStatement对象执行SQL语句。
        ps = con.prepareStatement(sq,
                                  ResultSet.TYPE_SCROLL_SENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);

        //调用PreparedStatement对象的executeQuery方法，执行Select语句，并返回一个记录集对象。
        rs = ps.executeQuery();

        //调用记录集对象的next方法，移动指针，如果到达了EOF返回false
        while (rs.next()) {
            //学员类对象
            Card stu = new Card();
            //为学员对象属性赋值
            stu.setId(rs.getString(1));
            stu.setMemberId(rs.getString(2));
            stu.setPassword(rs.getString(3));
            stu.setBalance(rs.getDouble(4));

            //为集合类添加对象
            arr.add(stu);
        }

    } catch (Exception e) {
        System.out.println("CardDAO类的chaXun()方法有错误! : "
                           + e.getMessage());
    } finally {

        /** 释放资源系列代码*/
        ConnectionManager.ResultSetClose(rs);
        ConnectionManager.StatementClose(ps); //释放执行命令的对象
        ConnectionManager.ConnectionClose(con); //关闭数据库连接
    }

    return arr;
}


public ArrayList chaXun(Card stu) {

    //声明一个数据库连接对象
    Connection con = null;
    //声明一个执行命令的对象
    PreparedStatement ps = null;
    //声明一个存储纪录集的对象
    ResultSet rs = null;
    //集合类对象
    ArrayList arr = new ArrayList();

    try {
        /** 数据库操作系列代码*/

        //调用ConnectionManager的静态方法,建立数据库连接.
        con = ConnectionManager.getConnection();

        //拼接数据库操作的SQL语句
        String sq = "select * from card where Id=?";

        //建立一个PreparedStatement对象执行SQL语句。
        ps = con.prepareStatement(sq,
                                  ResultSet.TYPE_SCROLL_SENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);

        //把要查找学员的姓名,作为参数传递给SQL语句
        ps.setString(1, stu.getId());

        //调用PreparedStatement对象的executeQuery方法，执行Select语句，并返回一个记录集对象。
        rs = ps.executeQuery();

        //调用记录集对象的next方法，移动指针，如果到达了EOF返回false
        while (rs.next()) {
            //Computer类对象
            Card temp = new Card();
            //为Computer对象属性赋值
            temp.setId(rs.getString(1));
            //temp.setUserId(2,rs.getString(2));
            temp.setMemberId(rs.getString(2));
            temp.setPassword(rs.getString(3));
            temp.setBalance(rs.getDouble(4));
            //为集合类添加对象
            arr.add(temp);
        }

    } catch (Exception e) {
        System.out.println("CardDAO类的chaXun(student stu)方法有错误! : "
                           + e.getMessage());
    } finally {

        /** 释放资源系列代码*/
        ConnectionManager.ResultSetClose(rs);
        ConnectionManager.StatementClose(ps); //释放执行命令的对象
        ConnectionManager.ConnectionClose(con); //关闭数据库连接
    }

    return arr;
}
public ArrayList chaXun1(Card stu) {

    //声明一个数据库连接对象
    Connection con = null;
    //声明一个执行命令的对象
    PreparedStatement ps = null;
    //声明一个存储纪录集的对象
    ResultSet rs = null;
    //集合类对象
    ArrayList arr = new ArrayList();

    try {
        /** 数据库操作系列代码*/

        //调用ConnectionManager的静态方法,建立数据库连接.
        con = ConnectionManager.getConnection();

        //拼接数据库操作的SQL语句
        String sq = "select * from card where Id=?  and password=?";
        
        //建立一个PreparedStatement对象执行SQL语句。
        ps = con.prepareStatement(sq,
                                  ResultSet.TYPE_SCROLL_SENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);
 
        //把要查找学员的姓名,作为参数传递给SQL语句
        ps.setString(1, stu.getId());
        ps.setString(2,stu.getPassword());
        //调用PreparedStatement对象的executeQuery方法，执行Select语句，并返回一个记录集对象。
        rs = ps.executeQuery();

        //调用记录集对象的next方法，移动指针，如果到达了EOF返回false
        while (rs.next()) {
            //Computer类对象
            Card temp = new Card();
            //为Computer对象属性赋值
            temp.setId(rs.getString(1));
            //temp.setUserId(2,rs.getString(2));
            temp.setPassword(rs.getString(3));
            temp.setBalance(rs.getDouble(4));
            //为集合类添加对象
            arr.add(temp);
        }

    } catch (Exception e) {
        System.out.println("CardDAO类的chaXun(student stu)方法有错误! : "
                           + e.getMessage());
    } finally {

        /** 释放资源系列代码*/
        ConnectionManager.ResultSetClose(rs);
        ConnectionManager.StatementClose(ps); //释放执行命令的对象
        ConnectionManager.ConnectionClose(con); //关闭数据库连接
    }

    return arr;
}

}
