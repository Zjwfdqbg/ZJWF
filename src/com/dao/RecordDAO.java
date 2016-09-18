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
import com.model.Record;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.text.DateFormat;
import java.util.Date;

public class RecordDAO {
	public RecordDAO() {
	}
	public boolean judgement(Record stu){
		// ����һ�����ݿ����Ӷ���
				Connection con = null;
				// ����һ��ִ������Ķ���
				PreparedStatement ps = null;
				// ����һ���洢��¼���Ķ���
				ResultSet rs = null;
				// ���������
				ArrayList arr = new ArrayList();

				try {
					/** ���ݿ����ϵ�д��� */

					// ����ConnectionManager�ľ�̬����,�������ݿ�����.
					con = ConnectionManager.getConnection();

					// ƴ�����ݿ������SQL���
					String sq = "select * from card c JOIN member m on c.MemberId = m.Id and c.ID=?";	

					// ����һ��PreparedStatement����ִ��SQL��䡣
					ps = con.prepareStatement(sq, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

					// ��Ҫ����ѧԱ������,��Ϊ�������ݸ�SQL���
					ps.setString(1, stu.getCardId());

					// ����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
					rs = ps.executeQuery();

					// ���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
					if (rs.next()) {
//						// Computer�����
//						Record temp = new Record();
//						// ΪComputer�������Ը�ֵ
//						temp.setCardId(rs.getString(2));
//						temp.setComputerId(rs.getString(3));
//						temp.setBeginTime(rs.getString(4).toString());
//						temp.setEndTime(rs.getString(5).toString());
//						temp.setBalance(rs.getDouble(6));
//
//						// Ϊ��������Ӷ���
//						arr.add(temp);
						return true;
					}

				} catch (Exception e) {
					System.out.println("RecordDAO���judge(student stu)�����д���! : " + e.getMessage());
				} finally {

					/** �ͷ���Դϵ�д��� */
					ConnectionManager.ResultSetClose(rs);
					ConnectionManager.StatementClose(ps); // �ͷ�ִ������Ķ���
					ConnectionManager.ConnectionClose(con); // �ر����ݿ�����
				}

				return false;
			}
	
	public void insert(Record stu) {

		// ����һ�����ݿ����Ӷ���
		Connection con = null;
		// ����һ��ִ������Ķ���
		PreparedStatement ps = null;

		try {
			/** ���ݿ����ϵ�д��� */

			// ����ConnectionManager�ľ�̬����,�������ݿ�����.
			con = ConnectionManager.getConnection();

			// ���ݿ������SQL���
			String sq = "insert into record (Id,CardId,ComputerId,BeginTime,EndTime,balance)"
					+ "       values (?,?,?,?,?,?)";
			// ����һ��PreparedStatement����ִ��SQL��䡣
			ps = con.prepareStatement(sq);

			// �����������.
			// ateFormat a;
			ps.setInt(1, stu.getId());
			ps.setString(2, stu.getCardId());
			ps.setString(3, stu.getComputerId());
			ps.setString(4, stu.getBeginTime());
			ps.setString(5, stu.getEndTime());
			ps.setDouble(6, stu.getBalance());

			// ִ��SQL���
			ps.executeUpdate();

			System.out.println("�����Ϣ�����!");

		} catch (Exception e) {
			System.out.println("RecordDAO���insert()�����д���! : " + e.getMessage());
		} finally {

			/** �ͷ���Դϵ�д��� */
			ConnectionManager.StatementClose(ps); // �ͷ�ִ������Ķ���
			ConnectionManager.ConnectionClose(con); // �ر����ݿ�����
		}
	}

	/**
	 * ����ѧ�ţ�������ɾ��ѧԱ��Ϣ�ķ���. ������: ��Ҫɾ�����Ǹ�ѧԱ
	 */
	public void delete(Record stu) {

		// ����һ�����ݿ����Ӷ���
		Connection con = null;
		// ����һ��ִ������Ķ���
		PreparedStatement ps = null;

		try {
			/** ���ݿ����ϵ�д��� */

			// ����ConnectionManager�ľ�̬����,�������ݿ�����.
			con = ConnectionManager.getConnection();

			// ���ݿ������SQL���
			String sq = "delete from record " + " where CardId=?";

			// ����һ��PreparedStatement����ִ��SQL��䡣
			ps = con.prepareStatement(sq);

			// �����������.
			ps.setString(1, stu.getComputerId());

			// ִ��SQL���
			ps.executeUpdate();

			System.out.println("ɾ����Ϣ�����!");

		} catch (Exception e) {
			System.out.println("RecordDAO���delete()�����д���! : " + e.getMessage());
		} finally {

			/** �ͷ���Դϵ�д��� */
			ConnectionManager.StatementClose(ps); // �ͷ�ִ������Ķ���
			ConnectionManager.ConnectionClose(con); // �ر����ݿ�����
		}
	}

	/**
	 * ����ѧ�ţ��������޸�ѧԱ��Ϣ�ķ���. ������: ��Ҫ�޸ĵ��Ǹ�ѧԱ
	 */
	public void update(Record stu) {

		// ����һ�����ݿ����Ӷ���
		Connection con = null;
		// ����һ��ִ������Ķ���
		PreparedStatement ps = null;

		try {
			/** ���ݿ����ϵ�д��� */

			// ����ConnectionManager�ľ�̬����,�������ݿ�����.
			con = ConnectionManager.getConnection();

			// ���ݿ������SQL���
			String sq = "UPDATE record" + " SET  CardId=?,BeginTime=?,EndTime=?,balance=?" + " WHERE ComputerId=?";

			// ����һ��PreparedStatement����ִ��SQL��䡣
			ps = con.prepareStatement(sq);

			// �����������.
			ps.setString(1, stu.getCardId());
			ps.setString(2, stu.getBeginTime());
			ps.setString(3, stu.getEndTime());
			ps.setDouble(4, stu.getBalance());
			ps.setString(5, stu.getCardId());

			// ִ��SQL���
			ps.executeUpdate();

			System.out.println("�޸���Ϣ�����!");

		} catch (Exception e) {
			System.out.println("RecordDAO���update()�����д���! : " + e.getMessage());
		} finally {

			/** �ͷ���Դϵ�д��� */
			ConnectionManager.StatementClose(ps); // �ͷ�ִ������Ķ���
			ConnectionManager.ConnectionClose(con); // �ر����ݿ�����
		}
	}

	public ArrayList chaXun() {

		// ����һ�����ݿ����Ӷ���
		Connection con = null;
		// ����һ��ִ������Ķ���
		PreparedStatement ps = null;
		// ����һ���洢��¼���Ķ���
		ResultSet rs = null;
		// ���������
		ArrayList arr = new ArrayList();

		try {
			/** ���ݿ����ϵ�д��� */

			// ƴ�����ݿ������SQL���
			String sq = "select * from record";

			// ����ConnectionManager�ľ�̬����,�������ݿ�����.
			con = ConnectionManager.getConnection();

			// ����һ��PreparedStatement����ִ��SQL��䡣
			ps = con.prepareStatement(sq, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// ����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
			rs = ps.executeQuery();

			// ���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
			while (rs.next()) {
				// ѧԱ�����
				Record stu = new Record();
				// ΪѧԱ�������Ը�ֵ
				stu.setId(rs.getInt(1));
				stu.setCardId(rs.getString(2));
				stu.setComputerId(rs.getString(3));
				stu.setBeginTime(rs.getString(4).toString());
				stu.setEndTime(rs.getString(5).toString());
				stu.setBalance(rs.getDouble(6));
				// Ϊ��������Ӷ���
				arr.add(stu);
			}

		} catch (Exception e) {
			System.out.println("RecordDAO���chaXun()�����д���! : " + e.getMessage());
		} finally {

			/** �ͷ���Դϵ�д��� */
			ConnectionManager.ResultSetClose(rs);
			ConnectionManager.StatementClose(ps); // �ͷ�ִ������Ķ���
			ConnectionManager.ConnectionClose(con); // �ر����ݿ�����
		}

		return arr;
	}

	/**
	 * ������������ѧԱ��Ϣ�ķ��� ����ֵ��: ���ҵ���ѧԱ ������: ��Ҫ��Ѱ��ѧԱ������
	 */
	public ArrayList chaXun(Record stu) {

		// ����һ�����ݿ����Ӷ���
		Connection con = null;
		// ����һ��ִ������Ķ���
		PreparedStatement ps = null;
		// ����һ���洢��¼���Ķ���
		ResultSet rs = null;
		// ���������
		ArrayList arr = new ArrayList();

		try {
			/** ���ݿ����ϵ�д��� */

			// ����ConnectionManager�ľ�̬����,�������ݿ�����.
			con = ConnectionManager.getConnection();

			// ƴ�����ݿ������SQL���
			String sq = "select * from record  where CardId=?";

			// ����һ��PreparedStatement����ִ��SQL��䡣
			ps = con.prepareStatement(sq, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// ��Ҫ����ѧԱ������,��Ϊ�������ݸ�SQL���
			ps.setString(1, stu.getCardId());

			// ����PreparedStatement�����executeQuery������ִ��Select��䣬������һ����¼������
			rs = ps.executeQuery();

			// ���ü�¼�������next�������ƶ�ָ�룬���������EOF����false
			while (rs.next()) {
				// Computer�����
				Record temp = new Record();
				// ΪComputer�������Ը�ֵ
				temp.setCardId(rs.getString(2));
				temp.setComputerId(rs.getString(3));
				temp.setBeginTime(rs.getString(4).toString());
				temp.setEndTime(rs.getString(5).toString());
				temp.setBalance(rs.getDouble(6));

				// Ϊ��������Ӷ���
				arr.add(temp);
			}

		} catch (Exception e) {
			System.out.println("RecordDAO���chaXun(student stu)�����д���! : " + e.getMessage());
		} finally {

			/** �ͷ���Դϵ�д��� */
			ConnectionManager.ResultSetClose(rs);
			ConnectionManager.StatementClose(ps); // �ͷ�ִ������Ķ���
			ConnectionManager.ConnectionClose(con); // �ر����ݿ�����
		}

		return arr;
	}
}
