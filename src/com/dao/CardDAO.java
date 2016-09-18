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

    //����һ�����ݿ����Ӷ���
    Connection con = null;
    //����һ��ִ������Ķ���
    PreparedStatement ps = null;

    try {
        /** ���ݿ����ϵ�д���*/

        //����ConnectionManager�ľ�̬����,�������ݿ�����.
        con = ConnectionManager.getConnection();

        //���ݿ������SQL���
        String sq = "insert into card (Id,MemberId,password,balance)" +
                    "       values (?,?,?,?)";
        //����һ��PreparedStatement����ִ��SQL��䡣
        ps = con.prepareStatement(sq);

        //�����������.
        ps.setString(1,stu.getId());
        ps.setString(2,stu.getMemberId());
        ps.setString(3, stu.getPassword());
        ps.setDouble(4,stu.getBalance());

        //ִ��SQL���
        ps.executeUpdate();

        System.out.println("�����Ϣ�����!");

    } catch (Exception e) {
        System.out.println("CardDAO���insert()�����д���! : "
                           + e.getMessage());
    } finally {

        /** �ͷ���Դϵ�д���*/
        ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
        ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
    }
}

public void delete(Card stu) {

    //����һ�����ݿ����Ӷ���
    Connection con = null;
    //����һ��ִ������Ķ���
    PreparedStatement ps = null;

    try {
        /** ���ݿ����ϵ�д���*/

        //����ConnectionManager�ľ�̬����,�������ݿ�����.
        con = ConnectionManager.getConnection();

        //���ݿ������SQL���
        String sq = "delete from card " +
                    " where Id=?";

        //����һ��PreparedStatement����ִ��SQL��䡣
        ps = con.prepareStatement(sq);

        //�����������.
        ps.setString(1, stu.getId());

        //ִ��SQL���
        ps.executeUpdate();

        System.out.println("ɾ����Ϣ�����!");

    } catch (Exception e) {
        System.out.println("CardDAO���delete()�����д���! : "
                           + e.getMessage());
    } finally {

        /** �ͷ���Դϵ�д���*/
        ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
        ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
    }
}


public void update(Card stu) {
    //����һ�����ݿ����Ӷ���
    Connection con = null;
    //����һ��ִ������Ķ���
    PreparedStatement ps = null;

    try {
        /** ���ݿ����ϵ�д���*/

        //����ConnectionManager�ľ�̬����,�������ݿ�����.
        con = ConnectionManager.getConnection();

        //���ݿ������SQL���
        String sq = "UPDATE card" +
                    " SET   password=?,balance=?" +
                    " WHERE Id=?";

        //����һ��PreparedStatement����ִ��SQL��䡣
        ps = con.prepareStatement(sq);

        //�����������.

        ps.setString(1, stu.getPassword());
        ps.setDouble(2, stu.getBalance());
        ps.setString(3,stu.getId());


        //ִ��SQL���
        ps.executeUpdate();

        System.out.println("�޸���Ϣ�����!");

    } catch (Exception e) {
        System.out.println("CardDAO���update()�����д���! : "
                           + e.getMessage());
    } finally {

        /** �ͷ���Դϵ�д���*/
        ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
        ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
    }
}
public void GengXin(Card stu) {

    //����һ�����ݿ����Ӷ���
    Connection con = null;
    //����һ��ִ������Ķ���
    PreparedStatement ps = null;

    try {
        /** ���ݿ����ϵ�д���*/

        //����ConnectionManager�ľ�̬����,�������ݿ�����.
        con = ConnectionManager.getConnection();

        //���ݿ������SQL���
        String sq =  "UPDATE card" +
                     "   SET   balance=?" +
                     "   WHERE Id=?";

        //����һ��PreparedStatement����ִ��SQL��䡣
        ps = con.prepareStatement(sq);

        //�����������.


        ps.setDouble(1, stu.getBalance());
        ps.setString(2,stu.getId());


        //ִ��SQL���
        ps.executeUpdate();

        System.out.println("�޸������!");

    } catch (Exception e) {
        System.out.println("CardDAO���GengXin()�����д���! : "
                           + e.getMessage());
    } finally {

        /** �ͷ���Դϵ�д���*/
        ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
        ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
    }
}


/**
 * ����ȫ��ѧԱ��Ϣ�ķ���
 * ����ֵ��: ���ҵ���ѧԱ(ArrayList����)
 */
public ArrayList chaXun() {

    //����һ�����ݿ����Ӷ���
    Connection con = null;
    //����һ��ִ������Ķ���
    PreparedStatement ps = null;
    //����һ���洢��¼���Ķ���
    ResultSet rs = null;
    //���������
    ArrayList arr = new ArrayList();

    try {
        /** ���ݿ����ϵ�д���*/

        //ƴ�����ݿ������SQL���
        String sq = "select * from card";

        //����ConnectionManager�ľ�̬����,�������ݿ�����.
        con = ConnectionManager.getConnection();

        //����һ��PreparedStatement����ִ��SQL��䡣
        ps = con.prepareStatement(sq,
                                  ResultSet.TYPE_SCROLL_SENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);

        //����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
        rs = ps.executeQuery();

        //���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
        while (rs.next()) {
            //ѧԱ�����
            Card stu = new Card();
            //ΪѧԱ�������Ը�ֵ
            stu.setId(rs.getString(1));
            stu.setMemberId(rs.getString(2));
            stu.setPassword(rs.getString(3));
            stu.setBalance(rs.getDouble(4));

            //Ϊ��������Ӷ���
            arr.add(stu);
        }

    } catch (Exception e) {
        System.out.println("CardDAO���chaXun()�����д���! : "
                           + e.getMessage());
    } finally {

        /** �ͷ���Դϵ�д���*/
        ConnectionManager.ResultSetClose(rs);
        ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
        ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
    }

    return arr;
}


public ArrayList chaXun(Card stu) {

    //����һ�����ݿ����Ӷ���
    Connection con = null;
    //����һ��ִ������Ķ���
    PreparedStatement ps = null;
    //����һ���洢��¼���Ķ���
    ResultSet rs = null;
    //���������
    ArrayList arr = new ArrayList();

    try {
        /** ���ݿ����ϵ�д���*/

        //����ConnectionManager�ľ�̬����,�������ݿ�����.
        con = ConnectionManager.getConnection();

        //ƴ�����ݿ������SQL���
        String sq = "select * from card where Id=?";

        //����һ��PreparedStatement����ִ��SQL��䡣
        ps = con.prepareStatement(sq,
                                  ResultSet.TYPE_SCROLL_SENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);

        //��Ҫ����ѧԱ������,��Ϊ�������ݸ�SQL���
        ps.setString(1, stu.getId());

        //����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
        rs = ps.executeQuery();

        //���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
        while (rs.next()) {
            //Computer�����
            Card temp = new Card();
            //ΪComputer�������Ը�ֵ
            temp.setId(rs.getString(1));
            //temp.setUserId(2,rs.getString(2));
            temp.setMemberId(rs.getString(2));
            temp.setPassword(rs.getString(3));
            temp.setBalance(rs.getDouble(4));
            //Ϊ��������Ӷ���
            arr.add(temp);
        }

    } catch (Exception e) {
        System.out.println("CardDAO���chaXun(student stu)�����д���! : "
                           + e.getMessage());
    } finally {

        /** �ͷ���Դϵ�д���*/
        ConnectionManager.ResultSetClose(rs);
        ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
        ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
    }

    return arr;
}
public ArrayList chaXun1(Card stu) {

    //����һ�����ݿ����Ӷ���
    Connection con = null;
    //����һ��ִ������Ķ���
    PreparedStatement ps = null;
    //����һ���洢��¼���Ķ���
    ResultSet rs = null;
    //���������
    ArrayList arr = new ArrayList();

    try {
        /** ���ݿ����ϵ�д���*/

        //����ConnectionManager�ľ�̬����,�������ݿ�����.
        con = ConnectionManager.getConnection();

        //ƴ�����ݿ������SQL���
        String sq = "select * from card where Id=?  and password=?";
        
        //����һ��PreparedStatement����ִ��SQL��䡣
        ps = con.prepareStatement(sq,
                                  ResultSet.TYPE_SCROLL_SENSITIVE,
                                  ResultSet.CONCUR_UPDATABLE);
 
        //��Ҫ����ѧԱ������,��Ϊ�������ݸ�SQL���
        ps.setString(1, stu.getId());
        ps.setString(2,stu.getPassword());
        //����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
        rs = ps.executeQuery();

        //���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
        while (rs.next()) {
            //Computer�����
            Card temp = new Card();
            //ΪComputer�������Ը�ֵ
            temp.setId(rs.getString(1));
            //temp.setUserId(2,rs.getString(2));
            temp.setPassword(rs.getString(3));
            temp.setBalance(rs.getDouble(4));
            //Ϊ��������Ӷ���
            arr.add(temp);
        }

    } catch (Exception e) {
        System.out.println("CardDAO���chaXun(student stu)�����д���! : "
                           + e.getMessage());
    } finally {

        /** �ͷ���Դϵ�д���*/
        ConnectionManager.ResultSetClose(rs);
        ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
        ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
    }

    return arr;
}

}
