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
import com.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
public class UserDAO {
    public UserDAO() {
    }

    public void insert(User stu) {

        //声明一个数据库连接对象
        Connection con = null;
        //声明一个执行命令的对象
        PreparedStatement ps = null;

        try {
            /** 数据库操作系列代码*/

            //调用ConnectionManager的静态方法,建立数据库连接.
            con = ConnectionManager.getConnection();

            //数据库操作的SQL语句
            String sq = "insert into user(Username,password,popedomId)" +
                        "       values (?,?,?)";
            //建立一个PreparedStatement对象执行SQL语句。
            ps = con.prepareStatement(sq);

            //设置命令参数.
            ps.setString(1,stu.getUsername());
             ps.setString(2, stu.getPassword());
            ps.setInt(3,stu.getPopedomId());



            //执行SQL语句
            ps.executeUpdate();

            System.out.println("添加信息完成了!");

        } catch (Exception e) {
            System.out.println("UserDAO类的insert()方法有错误! : "
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
    public void delete(User stu) {

        //声明一个数据库连接对象
        Connection con = null;
        //声明一个执行命令的对象
        PreparedStatement ps = null;

        try {
            /** 数据库操作系列代码*/

            //调用ConnectionManager的静态方法,建立数据库连接.
            con = ConnectionManager.getConnection();

            //数据库操作的SQL语句
            String sq = "delete from user " +
                        " where Username=?";

            //建立一个PreparedStatement对象执行SQL语句。
            ps = con.prepareStatement(sq);

            //设置命令参数.
            ps.setString(1, stu.getUsername());

            //执行SQL语句
            ps.executeUpdate();

            System.out.println("删除信息完成了!");

        } catch (Exception e) {
            System.out.println("UserDAO类的delete()方法有错误! : "
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
    public void update(User stu) {

        //声明一个数据库连接对象
        Connection con = null;
        //声明一个执行命令的对象
        PreparedStatement ps = null;

        try {
            /** 数据库操作系列代码*/

            //调用ConnectionManager的静态方法,建立数据库连接.
            con = ConnectionManager.getConnection();

            //数据库操作的SQL语句
            String sq = "UPDATE user" +
                        " SET   password=?,popedomId=?" +
                        " WHERE Username=?";

            //建立一个PreparedStatement对象执行SQL语句。
            ps = con.prepareStatement(sq);

            //设置命令参数.
            ps.setString(1, stu.getPassword());
            ps.setInt(2,stu.getPopedomId() );
            ps.setString(3, stu.getUsername());


            //执行SQL语句
            ps.executeUpdate();

            System.out.println("修改信息完成了!");

        } catch (Exception e) {
            System.out.println("UserDAO类的update()方法有错误! : "
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
            String sq = "select * from user";

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
                User stu = new User();
                //为学员对象属性赋值
                stu.setUsername(rs.getString(1));
                stu.setPassword(rs.getString(2));
                stu.setPopedomId(rs.getInt(3));

                //为集合类添加对象
                arr.add(stu);
            }

        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("UserDAO类的chaXun()方法有错误! : "
                               + e.getMessage());
        } finally {

            /** 释放资源系列代码*/
            ConnectionManager.ResultSetClose(rs);
            ConnectionManager.StatementClose(ps); //释放执行命令的对象
            ConnectionManager.ConnectionClose(con); //关闭数据库连接
        }

        return arr;
    }

    /**
     * 根据姓名查找学员信息的方法
     * 返回值是: 查找到的学员
     * 参数是: 你要找寻的学员的姓名
     */
  public ArrayList chaXun(User stu) {

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
            String sq = "select * from user where Username=?";

            //建立一个PreparedStatement对象执行SQL语句。
            ps = con.prepareStatement(sq,
                                      ResultSet.TYPE_SCROLL_SENSITIVE,
                                      ResultSet.CONCUR_UPDATABLE);

            //把要查找学员的姓名,作为参数传递给SQL语句
            ps.setString(1, stu.getUsername());

            //调用PreparedStatement对象的executeQuery方法，执行Select语句，并返回一个记录集对象。
            rs = ps.executeQuery();

            //调用记录集对象的next方法，移动指针，如果到达了EOF返回false
            while (rs.next()) {
                //Computer类对象
                User temp = new User();
                //为Computer对象属性赋值
                temp.setUsername(rs.getString(1));
                temp.setPassword(rs.getString(2));
                temp.setPopedomId(rs.getInt(3));


                //为集合类添加对象
                arr.add(temp);
            }

        } catch (Exception e) {
            System.out.println("UserDAO类的chaXun(student stu)方法有错误! : "
                               + e.getMessage());
        } finally {

            /** 释放资源系列代码*/
            ConnectionManager.ResultSetClose(rs);
            ConnectionManager.StatementClose(ps); //释放执行命令的对象
            ConnectionManager.ConnectionClose(con); //关闭数据库连接
        }

        return arr;
    }
    public ArrayList DchaXun(User stu) {

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
          String sq = "select * from user where Username=?  and password=?";

          //建立一个PreparedStatement对象执行SQL语句。
          ps = con.prepareStatement(sq,
                                    ResultSet.TYPE_SCROLL_SENSITIVE,
                                    ResultSet.CONCUR_UPDATABLE);

          //把要查找学员的姓名,作为参数传递给SQL语句
          ps.setString(1, stu.getUsername());
          ps.setString(2,stu.getPassword());
          //调用PreparedStatement对象的executeQuery方法，执行Select语句，并返回一个记录集对象。
          rs = ps.executeQuery();

          //调用记录集对象的next方法，移动指针，如果到达了EOF返回false
          while (rs.next()) {
              //Computer类对象
              User temp = new User();
              //为Computer对象属性赋值
              temp.setUsername(rs.getString(1));
              temp.setPassword(rs.getString(2));
              temp.setPopedomId(rs.getInt(3));


              //为集合类添加对象
              arr.add(temp);
          }

      } catch (Exception e) {
          System.out.println("UserDAO类的chaXun(student stu)方法有错误! : "
                             + e.getMessage());
      } finally {

          /** 释放资源系列代码*/
          ConnectionManager.ResultSetClose(rs);
          ConnectionManager.StatementClose(ps); //释放执行命令的对象
          ConnectionManager.ConnectionClose(con); //关闭数据库连接
      }

      return arr;
  }

  public boolean DLchaXun(User stu) {
   boolean shiFou = false;
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
           String sq = "select popedomId from user where Username=?  and password=?";

           //建立一个PreparedStatement对象执行SQL语句。
           ps = con.prepareStatement(sq,
                                     ResultSet.TYPE_SCROLL_SENSITIVE,
                                     ResultSet.CONCUR_UPDATABLE);

           //把要查找学员的姓名,作为参数传递给SQL语句
           ps.setString(1, stu.getUsername());
           ps.setString(2,stu.getPassword());
           //调用PreparedStatement对象的executeQuery方法，执行Select语句，并返回一个记录集对象。
           rs = ps.executeQuery();

           //调用记录集对象的next方法，移动指针，如果到达了EOF返回false
           rs.next();
           int quanXian = Integer.parseInt(rs.getString(1));
          if (quanXian==0) //如果是
              shiFou = true;
          else //如果不是
              shiFou = false;



       } catch (Exception e) {
           System.out.println("UserDAO类的chaXun(student stu)方法有错误! : "
                              + e.getMessage());
       } finally {

           /** 释放资源系列代码*/
           ConnectionManager.ResultSetClose(rs);
           ConnectionManager.StatementClose(ps); //释放执行命令的对象
           ConnectionManager.ConnectionClose(con); //关闭数据库连接
       }

       return shiFou;
  }
}
