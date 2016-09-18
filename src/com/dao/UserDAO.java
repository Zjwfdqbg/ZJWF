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

        //����һ�����ݿ����Ӷ���
        Connection con = null;
        //����һ��ִ������Ķ���
        PreparedStatement ps = null;

        try {
            /** ���ݿ����ϵ�д���*/

            //����ConnectionManager�ľ�̬����,�������ݿ�����.
            con = ConnectionManager.getConnection();

            //���ݿ������SQL���
            String sq = "insert into user(Username,password,popedomId)" +
                        "       values (?,?,?)";
            //����һ��PreparedStatement����ִ��SQL��䡣
            ps = con.prepareStatement(sq);

            //�����������.
            ps.setString(1,stu.getUsername());
             ps.setString(2, stu.getPassword());
            ps.setInt(3,stu.getPopedomId());



            //ִ��SQL���
            ps.executeUpdate();

            System.out.println("�����Ϣ�����!");

        } catch (Exception e) {
            System.out.println("UserDAO���insert()�����д���! : "
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
    public void delete(User stu) {

        //����һ�����ݿ����Ӷ���
        Connection con = null;
        //����һ��ִ������Ķ���
        PreparedStatement ps = null;

        try {
            /** ���ݿ����ϵ�д���*/

            //����ConnectionManager�ľ�̬����,�������ݿ�����.
            con = ConnectionManager.getConnection();

            //���ݿ������SQL���
            String sq = "delete from user " +
                        " where Username=?";

            //����һ��PreparedStatement����ִ��SQL��䡣
            ps = con.prepareStatement(sq);

            //�����������.
            ps.setString(1, stu.getUsername());

            //ִ��SQL���
            ps.executeUpdate();

            System.out.println("ɾ����Ϣ�����!");

        } catch (Exception e) {
            System.out.println("UserDAO���delete()�����д���! : "
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
    public void update(User stu) {

        //����һ�����ݿ����Ӷ���
        Connection con = null;
        //����һ��ִ������Ķ���
        PreparedStatement ps = null;

        try {
            /** ���ݿ����ϵ�д���*/

            //����ConnectionManager�ľ�̬����,�������ݿ�����.
            con = ConnectionManager.getConnection();

            //���ݿ������SQL���
            String sq = "UPDATE user" +
                        " SET   password=?,popedomId=?" +
                        " WHERE Username=?";

            //����һ��PreparedStatement����ִ��SQL��䡣
            ps = con.prepareStatement(sq);

            //�����������.
            ps.setString(1, stu.getPassword());
            ps.setInt(2,stu.getPopedomId() );
            ps.setString(3, stu.getUsername());


            //ִ��SQL���
            ps.executeUpdate();

            System.out.println("�޸���Ϣ�����!");

        } catch (Exception e) {
            System.out.println("UserDAO���update()�����д���! : "
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
            String sq = "select * from user";

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
                User stu = new User();
                //ΪѧԱ�������Ը�ֵ
                stu.setUsername(rs.getString(1));
                stu.setPassword(rs.getString(2));
                stu.setPopedomId(rs.getInt(3));

                //Ϊ��������Ӷ���
                arr.add(stu);
            }

        } catch (Exception e) {
        	e.printStackTrace();
            System.out.println("UserDAO���chaXun()�����д���! : "
                               + e.getMessage());
        } finally {

            /** �ͷ���Դϵ�д���*/
            ConnectionManager.ResultSetClose(rs);
            ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
            ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
        }

        return arr;
    }

    /**
     * ������������ѧԱ��Ϣ�ķ���
     * ����ֵ��: ���ҵ���ѧԱ
     * ������: ��Ҫ��Ѱ��ѧԱ������
     */
  public ArrayList chaXun(User stu) {

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
            String sq = "select * from user where Username=?";

            //����һ��PreparedStatement����ִ��SQL��䡣
            ps = con.prepareStatement(sq,
                                      ResultSet.TYPE_SCROLL_SENSITIVE,
                                      ResultSet.CONCUR_UPDATABLE);

            //��Ҫ����ѧԱ������,��Ϊ�������ݸ�SQL���
            ps.setString(1, stu.getUsername());

            //����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
            rs = ps.executeQuery();

            //���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
            while (rs.next()) {
                //Computer�����
                User temp = new User();
                //ΪComputer�������Ը�ֵ
                temp.setUsername(rs.getString(1));
                temp.setPassword(rs.getString(2));
                temp.setPopedomId(rs.getInt(3));


                //Ϊ��������Ӷ���
                arr.add(temp);
            }

        } catch (Exception e) {
            System.out.println("UserDAO���chaXun(student stu)�����д���! : "
                               + e.getMessage());
        } finally {

            /** �ͷ���Դϵ�д���*/
            ConnectionManager.ResultSetClose(rs);
            ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
            ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
        }

        return arr;
    }
    public ArrayList DchaXun(User stu) {

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
          String sq = "select * from user where Username=?  and password=?";

          //����һ��PreparedStatement����ִ��SQL��䡣
          ps = con.prepareStatement(sq,
                                    ResultSet.TYPE_SCROLL_SENSITIVE,
                                    ResultSet.CONCUR_UPDATABLE);

          //��Ҫ����ѧԱ������,��Ϊ�������ݸ�SQL���
          ps.setString(1, stu.getUsername());
          ps.setString(2,stu.getPassword());
          //����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
          rs = ps.executeQuery();

          //���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
          while (rs.next()) {
              //Computer�����
              User temp = new User();
              //ΪComputer�������Ը�ֵ
              temp.setUsername(rs.getString(1));
              temp.setPassword(rs.getString(2));
              temp.setPopedomId(rs.getInt(3));


              //Ϊ��������Ӷ���
              arr.add(temp);
          }

      } catch (Exception e) {
          System.out.println("UserDAO���chaXun(student stu)�����д���! : "
                             + e.getMessage());
      } finally {

          /** �ͷ���Դϵ�д���*/
          ConnectionManager.ResultSetClose(rs);
          ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
          ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
      }

      return arr;
  }

  public boolean DLchaXun(User stu) {
   boolean shiFou = false;
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
           String sq = "select popedomId from user where Username=?  and password=?";

           //����һ��PreparedStatement����ִ��SQL��䡣
           ps = con.prepareStatement(sq,
                                     ResultSet.TYPE_SCROLL_SENSITIVE,
                                     ResultSet.CONCUR_UPDATABLE);

           //��Ҫ����ѧԱ������,��Ϊ�������ݸ�SQL���
           ps.setString(1, stu.getUsername());
           ps.setString(2,stu.getPassword());
           //����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
           rs = ps.executeQuery();

           //���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
           rs.next();
           int quanXian = Integer.parseInt(rs.getString(1));
          if (quanXian==0) //�����
              shiFou = true;
          else //�������
              shiFou = false;



       } catch (Exception e) {
           System.out.println("UserDAO���chaXun(student stu)�����д���! : "
                              + e.getMessage());
       } finally {

           /** �ͷ���Դϵ�д���*/
           ConnectionManager.ResultSetClose(rs);
           ConnectionManager.StatementClose(ps); //�ͷ�ִ������Ķ���
           ConnectionManager.ConnectionClose(con); //�ر����ݿ�����
       }

       return shiFou;
  }
}
