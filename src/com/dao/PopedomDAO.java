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

  //����һ�����ݿ����Ӷ���
  Connection con = null;
  //����һ��ִ������Ķ���
  PreparedStatement ps = null;

  try {
      /** ���ݿ����ϵ�д���*/

      //����ConnectionManager�ľ�̬����,�������ݿ�����.
      con = ConnectionManager.getConnection();

      //���ݿ������SQL���
      String sq = "insert into popedom(ID,popedomName)" +
                  "       values (?,?)";
      //����һ��PreparedStatement����ִ��SQL��䡣
      ps = con.prepareStatement(sq);

      //�����������.
      ps.setInt(1,stu.getID());
      ps.setString(2,stu.getPopedomName());


      //ִ��SQL���
      ps.executeUpdate();

      System.out.println("�����Ϣ�����!");

  } catch (Exception e) {
      System.out.println("PopedomDAO���insert()�����д���! : "
                         + e.getMessage());
  } finally {

      /** �ͷ���Դϵ�д���*/
      ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
      ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
  }
}

   public void delete(Popedom stu) {

       //����һ�����ݿ����Ӷ���
       Connection con = null;
       //����һ��ִ������Ķ���
       PreparedStatement ps = null;

       try {
           /** ���ݿ����ϵ�д���*/

           //����ConnectionManager�ľ�̬����,�������ݿ�����.
           con = ConnectionManager.getConnection();

           //���ݿ������SQL���
           String sq = "delete from popedom " +
                       " where ID=?";

           //����һ��PreparedStatement����ִ��SQL��䡣
           ps = con.prepareStatement(sq);

           //�����������.
           ps.setInt(1, stu.getID());

           //ִ��SQL���
           ps.executeUpdate();

           System.out.println("ɾ����Ϣ�����!");

       } catch (Exception e) {
           System.out.println("PopedomDAO���delete()�����д���! : "
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
   public void update(Popedom stu) {

       //����һ�����ݿ����Ӷ���
       Connection con = null;
       //����һ��ִ������Ķ���
       PreparedStatement ps = null;

       try {
           /** ���ݿ����ϵ�д���*/

           //����ConnectionManager�ľ�̬����,�������ݿ�����.
           con = ConnectionManager.getConnection();

           //���ݿ������SQL���
           String sq = "UPDATE popedom" +
                       " SET   popedomName=?" +
                       " WHERE ID=?";

           //����һ��PreparedStatement����ִ��SQL��䡣
           ps = con.prepareStatement(sq);

           //�����������.

           ps.setString(1, stu.getPopedomName());
           ps.setInt(2, stu.getID());



           //ִ��SQL���
           ps.executeUpdate();

           System.out.println("�޸���Ϣ�����!");

       } catch (Exception e) {
           System.out.println("PopedomDAO���update()�����д���! : "
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
           String sq = "select * from popedom";

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
               Popedom stu = new Popedom();
               //ΪѧԱ�������Ը�ֵ
               stu.setID(rs.getInt(1));
               stu.setPopedomName(rs.getString(2));


               //Ϊ��������Ӷ���
               arr.add(stu);
           }

       } catch (Exception e) {
           System.out.println("PopedomDAO���chaXun()�����д���! : "
                              + e.getMessage());
       } finally {

           /** �ͷ���Դϵ�д���*/
           ConnectionManager.ResultSetClose(rs);
           ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
           ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
       }

       return arr;
   }


   public ArrayList chaXun(Popedom stu) {

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
           String sq = "select * from popedom where ID=?";

           //����һ��PreparedStatement����ִ��SQL��䡣
           ps = con.prepareStatement(sq,
                                     ResultSet.TYPE_SCROLL_SENSITIVE,
                                     ResultSet.CONCUR_UPDATABLE);

           //��Ҫ����ѧԱ������,��Ϊ�������ݸ�SQL���
           ps.setInt(1, stu.getID());

           //����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
           rs = ps.executeQuery();

           //���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
           while (rs.next()) {
               //Computer�����
               Popedom temp = new Popedom();
               //ΪPopedom�������Ը�ֵ
               temp.setID(rs.getInt(1));
               temp.setPopedomName(rs.getString(2));
               
               //Ϊ��������Ӷ���
               arr.add(temp);
                  }

       } catch (Exception e) {
           System.out.println("PopedomDAO���chaXun(student stu)�����д���! : "
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
