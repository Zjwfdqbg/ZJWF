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

 //����һ�����ݿ����Ӷ���
 Connection con = null;
 //����һ��ִ������Ķ���
 PreparedStatement ps = null;

 try {
     /** ���ݿ����ϵ�д���*/

     //����ConnectionManager�ľ�̬����,�������ݿ�����.
     con = ConnectionManager.getConnection();

     //���ݿ������SQL���
     String sq = "insert into member (Id,MyName,BirthDate,identitycard,Phone)" +
                 "       values (?,?,?,?,?)";
     //����һ��PreparedStatement����ִ��SQL��䡣
     ps = con.prepareStatement(sq);

     //�����������.
     ps.setString(1,stu.getId());
     ps.setString(2,stu.getMyName());
    ps.setString(3,stu.getBirthDate());
     ps.setString(4, stu.getIdentitycard());
     ps.setString(5,stu.getPhone());


     //ִ��SQL���
     ps.executeUpdate();

     System.out.println("�����Ϣ�����!");

 } catch (Exception e) {
     System.out.println("MemberDAO���insert()�����д���! : "
                        + e.getMessage());
 } finally {

     /** �ͷ���Դϵ�д���*/
     ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
     ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
 }
}

/**
* ����ѧ�ţ�������ɾ��ѧԱ��Ϣ�ķ���.
* ������: ��Ҫɾ�����Ǹ�ѧԱ
*/
public void delete(Member stu) {

 //����һ�����ݿ����Ӷ���
 Connection con = null;
 //����һ��ִ������Ķ���
 PreparedStatement ps = null;

 try {
     /** ���ݿ����ϵ�д���*/

     //����ConnectionManager�ľ�̬����,�������ݿ�����.
     con = ConnectionManager.getConnection();

     //���ݿ������SQL���
     String sq = "delete from member " +
                 " where Id=?";

     //����һ��PreparedStatement����ִ��SQL��䡣
     ps = con.prepareStatement(sq);

     //�����������.
     ps.setString(1, stu.getId());

     //ִ��SQL���
     ps.executeUpdate();

     System.out.println("ɾ����Ϣ�����!");

 } catch (Exception e) {
     System.out.println("MemberDAO���delete()�����д���! : "
                        + e.getMessage());
 } finally {

     /** �ͷ���Դϵ�д���*/
     ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
     ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
 }
}

/**
* ����ѧ�ţ��������޸�ѧԱ��Ϣ�ķ���.
* ������: ��Ҫ�޸ĵ��Ǹ�ѧԱ
*/
public void update(Member stu) {

 //����һ�����ݿ����Ӷ���
 Connection con = null;
 //����һ��ִ������Ķ���
 PreparedStatement ps = null;

 try {
     /** ���ݿ����ϵ�д���*/

     //����ConnectionManager�ľ�̬����,�������ݿ�����.
     con = ConnectionManager.getConnection();

     //���ݿ������SQL���
     String sq = "UPDATE member" +
                 " SET MyName=?,BirthDate=?,identitycard=?,Phone=?" +
                 " WHERE Id=?";

     //����һ��PreparedStatement����ִ��SQL��䡣
     ps = con.prepareStatement(sq);

     //�����������.
;
         ps.setString(1,stu.getMyName());
         ps.setString(2,stu.getBirthDate());
         ps.setString(3, stu.getIdentitycard());
         ps.setString(4,stu.getPhone());
        ps.setString(5,stu.getId());


     //ִ��SQL���
     ps.executeUpdate();

     System.out.println("�޸���Ϣ�����!");

 } catch (Exception e) {
     System.out.println("MemberDAO���update()�����д���! : "
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
     String sq = "select * from member";

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
         Member stu = new Member();
         //ΪѧԱ�������Ը�ֵ
         stu.setId(rs.getString(1));
         stu.setMyName(rs.getString(2));
         stu.setBirthDate(rs.getString(3));
          stu.setIdentitycard(rs.getString(4));
            stu.setPhone(rs.getString(5));
         //Ϊ��������Ӷ���
         arr.add(stu);
     }

 } catch (Exception e) {
     System.out.println("MemberDAO���chaXun()�����д���! : "
                        + e.getMessage());
 } finally {

     /** �ͷ���Դϵ�д���*/
     ConnectionManager.ResultSetClose(rs);
     ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
     ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
 }

 return arr;
}


public ArrayList chaXun(Member stu) {

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
     String sq = "select * from member where Id=?";

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
         Member temp = new Member();
         //ΪComputer�������Ը�ֵ
          temp.setId(rs.getString(1));
          temp.setMyName(rs.getString(2));
          temp.setBirthDate(rs.getString(3));
          temp.setIdentitycard(rs.getString(4));
          temp.setPhone(rs.getString(5));

         //Ϊ��������Ӷ���
         arr.add(temp);
     }

 } catch (Exception e) {
     System.out.println("MemberDAO���chaXun(student stu)�����д���! : "
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
