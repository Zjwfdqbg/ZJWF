package com.business;

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
import com.dao.ComputerDAO;
import com.model.Computer;
import com.view.Computer.*;
import java.util.*;
public class ComBusiness {
    private ComBusiness() {
    }
    //����
public static void insert(Computer stu) {
    ComputerDAO sdo = new ComputerDAO();
    sdo.insert(stu);
}

//ɾ��
public static void delete(Computer stu) {
    ComputerDAO sdo = new ComputerDAO();
    sdo.delete(stu);
}

//�޸�
public static void update(Computer stu){
    ComputerDAO sdo = new ComputerDAO();
    sdo.update(stu);
}

//ȫ����ѯ
public static ArrayList select() {
    ComputerDAO sdo = new ComputerDAO();
    return sdo.chaXun();
}

//������ѯ
public static ArrayList select(Computer stu) {
    ComputerDAO sdo = new ComputerDAO();
    return sdo.chaXun(stu);
}
}
