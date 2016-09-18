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
import com.model.Computer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
public class ComputerDAO {

    public ComputerDAO() {
    }


    public void insert(Computer stu) {

        //����һ�����ݿ����Ӷ���
        Connection con = null;
        //����һ��ִ������Ķ���
        PreparedStatement ps = null;

        try {
            /** ���ݿ����ϵ�д���*/

            //����ConnectionManager�ľ�̬����,�������ݿ�����.
            con = ConnectionManager.getConnection();

            //���ݿ������SQL���
            String sq = "insert into computer (id,OnUse,notes)" +
                        "       values (?,?,?)";
            //����һ��PreparedStatement����ִ��SQL��䡣
            ps = con.prepareStatement(sq);

            //�����������.
            ps.setString(1,stu.getId());
            ps.setInt(2,stu.getOnUse());
            ps.setString(3, stu.getNotes());


            //ִ��SQL���
            ps.executeUpdate();

            System.out.println("�����Ϣ�����!");

        } catch (Exception e) {
            System.out.println("ComputerDAO���insert()�����д���! : "
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
    public void delete(Computer stu) {

        //����һ�����ݿ����Ӷ���
        Connection con = null;
        //����һ��ִ������Ķ���
        PreparedStatement ps = null;

        try {
            /** ���ݿ����ϵ�д���*/

            //����ConnectionManager�ľ�̬����,�������ݿ�����.
            con = ConnectionManager.getConnection();

            //���ݿ������SQL���
            String sq = "delete from computer " +
                        " where id=?";

            //����һ��PreparedStatement����ִ��SQL��䡣
            ps = con.prepareStatement(sq);

            //�����������.
            ps.setString(1, stu.getId());

            //ִ��SQL���
            ps.executeUpdate();

            System.out.println("ɾ����Ϣ�����!");

        } catch (Exception e) {
            System.out.println("ComputerDAO���delete()�����д���! : "
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
    public void update(Computer stu) {

        //����һ�����ݿ����Ӷ���
        Connection con = null;
        //����һ��ִ������Ķ���
        PreparedStatement ps = null;

        try {
            /** ���ݿ����ϵ�д���*/

            //����ConnectionManager�ľ�̬����,�������ݿ�����.
            con = ConnectionManager.getConnection();

            //���ݿ������SQL���
            String sq = "UPDATE computer" +
                        " SET   OnUse=?,notes=?" +
                        " WHERE id=?";

            //����һ��PreparedStatement����ִ��SQL��䡣
            ps = con.prepareStatement(sq);

            //�����������.
            ps.setInt(1,stu.getOnUse() );
            ps.setString(2, stu.getNotes());
            ps.setString(3, stu.getId());


            //ִ��SQL���
            ps.executeUpdate();

            System.out.println("�޸���Ϣ�����!");

        } catch (Exception e) {
            System.out.println("ComputerDAO���update()�����д���! : "
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
            String sq = "select * from computer";

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
                Computer stu = new Computer();
                //ΪѧԱ�������Ը�ֵ
                stu.setId(rs.getString(1));
                stu.setOnUse(rs.getByte(2));
                stu.setNotes(rs.getString(3));

                //Ϊ��������Ӷ���
                arr.add(stu);
            }

        } catch (Exception e) {
            System.out.println("ComputerDAO���chaXun()�����д���! : "
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
  public ArrayList chaXun(Computer stu) {

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
            String sq = "select * from computer where id=?";

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
                Computer temp = new Computer();
                //ΪComputer�������Ը�ֵ
                temp.setId(rs.getString(1));
                temp.setOnUse(rs.getByte(2));
                temp.setNotes(rs.getString(3));

                //Ϊ��������Ӷ���
                arr.add(temp);
            }

        } catch (Exception e) {
            System.out.println("ComputerDAO���chaXun(student stu)�����д���! : "
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
