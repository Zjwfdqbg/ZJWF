package com.dao;

/**
 
 */
import com.model.Popedom;

import java.sql.*;
import java.util.*;
public class PopedomDAO {
    public PopedomDAO() {
    }
    public void insert(Popedom stu) {

  //声明一个数据库连接对象
  Connection con = null;
  //声明一个执行命令的对象
  PreparedStatement ps = null;

  try {
      /** 数据库操作系列代码*/

      //调用ConnectionManager的静态方法,建立数据库连接.
      con = ConnectionManager.getConnection();

      //数据库操作的SQL语句
      String sq = "insert into popedom(ID,popedomName)" +
                  "       values (?,?)";
      //建立一个PreparedStatement对象执行SQL语句。
      ps = con.prepareStatement(sq);

      //设置命令参数.
      ps.setInt(1,stu.getID());
      ps.setString(2,stu.getPopedomName());


      //执行SQL语句
      ps.executeUpdate();

      System.out.println("添加信息完成了!");

  } catch (Exception e) {
      System.out.println("PopedomDAO类的insert()方法有错误! : "
                         + e.getMessage());
  } finally {

      /** 释放资源系列代码*/
      ConnectionManager.StatementClose(ps); //释放执行命令的对象
      ConnectionManager.ConnectionClose(con); //关闭数据库连接
  }
}

   public void delete(Popedom stu) {

       //声明一个数据库连接对象
       Connection con = null;
       //声明一个执行命令的对象
       PreparedStatement ps = null;

       try {
           /** 数据库操作系列代码*/

           //调用ConnectionManager的静态方法,建立数据库连接.
           con = ConnectionManager.getConnection();

           //数据库操作的SQL语句
           String sq = "delete from popedom " +
                       " where ID=?";

           //建立一个PreparedStatement对象执行SQL语句。
           ps = con.prepareStatement(sq);

           //设置命令参数.
           ps.setInt(1, stu.getID());

           //执行SQL语句
           ps.executeUpdate();

           System.out.println("删除信息完成了!");

       } catch (Exception e) {
           System.out.println("PopedomDAO类的delete()方法有错误! : "
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
   public void update(Popedom stu) {

       //声明一个数据库连接对象
       Connection con = null;
       //声明一个执行命令的对象
       PreparedStatement ps = null;

       try {
           /** 数据库操作系列代码*/

           //调用ConnectionManager的静态方法,建立数据库连接.
           con = ConnectionManager.getConnection();

           //数据库操作的SQL语句
           String sq = "UPDATE popedom" +
                       " SET   popedomName=?" +
                       " WHERE ID=?";

           //建立一个PreparedStatement对象执行SQL语句。
           ps = con.prepareStatement(sq);

           //设置命令参数.

           ps.setString(1, stu.getPopedomName());
           ps.setInt(2, stu.getID());



           //执行SQL语句
           ps.executeUpdate();

           System.out.println("修改信息完成了!");

       } catch (Exception e) {
           System.out.println("PopedomDAO类的update()方法有错误! : "
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
           String sq = "select * from popedom";

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
               Popedom stu = new Popedom();
               //为学员对象属性赋值
               stu.setID(rs.getInt(1));
               stu.setPopedomName(rs.getString(2));


               //为集合类添加对象
               arr.add(stu);
           }

       } catch (Exception e) {
           System.out.println("PopedomDAO类的chaXun()方法有错误! : "
                              + e.getMessage());
       } finally {

           /** 释放资源系列代码*/
           ConnectionManager.ResultSetClose(rs);
           ConnectionManager.StatementClose(ps); //释放执行命令的对象
           ConnectionManager.ConnectionClose(con); //关闭数据库连接
       }

       return arr;
   }


   public ArrayList chaXun(Popedom stu) {

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
           String sq = "select * from popedom where ID=?";

           //建立一个PreparedStatement对象执行SQL语句。
           ps = con.prepareStatement(sq,
                                     ResultSet.TYPE_SCROLL_SENSITIVE,
                                     ResultSet.CONCUR_UPDATABLE);

           //把要查找学员的姓名,作为参数传递给SQL语句
           ps.setInt(1, stu.getID());

           //调用PreparedStatement对象的executeQuery方法，执行Select语句，并返回一个记录集对象。
           rs = ps.executeQuery();

           //调用记录集对象的next方法，移动指针，如果到达了EOF返回false
           while (rs.next()) {
               //Computer类对象
               Popedom temp = new Popedom();
               //为Popedom对象属性赋值
               temp.setID(rs.getInt(1));
               temp.setPopedomName(rs.getString(2));
               
               //为集合类添加对象
               arr.add(temp);
                  }

       } catch (Exception e) {
           System.out.println("PopedomDAO类的chaXun(student stu)方法有错误! : "
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
