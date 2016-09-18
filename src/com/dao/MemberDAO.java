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
import com.model.Member;

import java.sql.*;
import java.util.*;
import java.text.DateFormat;
public class MemberDAO {
    public MemberDAO() {
    }
    public void insert(Member stu) {

 //声明一个数据库连接对象
 Connection con = null;
 //声明一个执行命令的对象
 PreparedStatement ps = null;

 try {
     /** 数据库操作系列代码*/

     //调用ConnectionManager的静态方法,建立数据库连接.
     con = ConnectionManager.getConnection();

     //数据库操作的SQL语句
     String sq = "insert into member (Id,MyName,BirthDate,identitycard,Phone)" +
                 "       values (?,?,?,?,?)";
     //建立一个PreparedStatement对象执行SQL语句。
     ps = con.prepareStatement(sq);

     //设置命令参数.
     ps.setString(1,stu.getId());
     ps.setString(2,stu.getMyName());
    ps.setString(3,stu.getBirthDate());
     ps.setString(4, stu.getIdentitycard());
     ps.setString(5,stu.getPhone());


     //执行SQL语句
     ps.executeUpdate();

     System.out.println("添加信息完成了!");

 } catch (Exception e) {
     System.out.println("MemberDAO类的insert()方法有错误! : "
                        + e.getMessage());
 } finally {

     /** 释放资源系列代码*/
     ConnectionManager.StatementClose(ps); //释放执行命令的对象
     ConnectionManager.ConnectionClose(con); //关闭数据库连接
 }
}

/**
* 根据学号（主键）删除学员信息的方法.
* 参数是: 你要删除的那个学员
*/
public void delete(Member stu) {

 //声明一个数据库连接对象
 Connection con = null;
 //声明一个执行命令的对象
 PreparedStatement ps = null;

 try {
     /** 数据库操作系列代码*/

     //调用ConnectionManager的静态方法,建立数据库连接.
     con = ConnectionManager.getConnection();

     //数据库操作的SQL语句
     String sq = "delete from member " +
                 " where Id=?";

     //建立一个PreparedStatement对象执行SQL语句。
     ps = con.prepareStatement(sq);

     //设置命令参数.
     ps.setString(1, stu.getId());

     //执行SQL语句
     ps.executeUpdate();

     System.out.println("删除信息完成了!");

 } catch (Exception e) {
     System.out.println("MemberDAO类的delete()方法有错误! : "
                        + e.getMessage());
 } finally {

     /** 释放资源系列代码*/
     ConnectionManager.StatementClose(ps); //释放执行命令的对象
     ConnectionManager.ConnectionClose(con); //关闭数据库连接
 }
}

/**
* 根据学号（主键）修改学员信息的方法.
* 参数是: 你要修改的那个学员
*/
public void update(Member stu) {

 //声明一个数据库连接对象
 Connection con = null;
 //声明一个执行命令的对象
 PreparedStatement ps = null;

 try {
     /** 数据库操作系列代码*/

     //调用ConnectionManager的静态方法,建立数据库连接.
     con = ConnectionManager.getConnection();

     //数据库操作的SQL语句
     String sq = "UPDATE member" +
                 " SET MyName=?,BirthDate=?,identitycard=?,Phone=?" +
                 " WHERE Id=?";

     //建立一个PreparedStatement对象执行SQL语句。
     ps = con.prepareStatement(sq);

     //设置命令参数.
;
         ps.setString(1,stu.getMyName());
         ps.setString(2,stu.getBirthDate());
         ps.setString(3, stu.getIdentitycard());
         ps.setString(4,stu.getPhone());
        ps.setString(5,stu.getId());


     //执行SQL语句
     ps.executeUpdate();

     System.out.println("修改信息完成了!");

 } catch (Exception e) {
     System.out.println("MemberDAO类的update()方法有错误! : "
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
     String sq = "select * from member";

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
         Member stu = new Member();
         //为学员对象属性赋值
         stu.setId(rs.getString(1));
         stu.setMyName(rs.getString(2));
         stu.setBirthDate(rs.getString(3));
          stu.setIdentitycard(rs.getString(4));
            stu.setPhone(rs.getString(5));
         //为集合类添加对象
         arr.add(stu);
     }

 } catch (Exception e) {
     System.out.println("MemberDAO类的chaXun()方法有错误! : "
                        + e.getMessage());
 } finally {

     /** 释放资源系列代码*/
     ConnectionManager.ResultSetClose(rs);
     ConnectionManager.StatementClose(ps); //释放执行命令的对象
     ConnectionManager.ConnectionClose(con); //关闭数据库连接
 }

 return arr;
}


public ArrayList chaXun(Member stu) {

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
     String sq = "select * from member where Id=?";

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
         Member temp = new Member();
         //为Computer对象属性赋值
          temp.setId(rs.getString(1));
          temp.setMyName(rs.getString(2));
          temp.setBirthDate(rs.getString(3));
          temp.setIdentitycard(rs.getString(4));
          temp.setPhone(rs.getString(5));

         //为集合类添加对象
         arr.add(temp);
     }

 } catch (Exception e) {
     System.out.println("MemberDAO类的chaXun(student stu)方法有错误! : "
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
