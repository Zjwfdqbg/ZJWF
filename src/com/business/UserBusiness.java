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
import com.dao.UserDAO;
import com.model.User;

import java.util.*;
public class UserBusiness {
    private UserBusiness() {
    }
    //����
public static void insert(User stu) {
UserDAO sdo = new UserDAO();
sdo.insert(stu);
}

//ɾ��
public static void delete(User stu) {
UserDAO sdo = new UserDAO();
sdo.delete(stu);
}

//�޸�
public static void update(User stu){
UserDAO sdo = new UserDAO();
sdo.update(stu);
}

//ȫ����ѯ
public static ArrayList select() {
UserDAO sdo = new UserDAO();
return sdo.chaXun();
}

//������ѯ
public static ArrayList select(User stu) {
UserDAO sdo = new UserDAO();
return sdo.chaXun(stu);
}
    //������ѯ
public static ArrayList Dselect(User stu) {
UserDAO sdo = new UserDAO();
return sdo.DchaXun(stu);
}
public static boolean DLselect(User stu) {
    UserDAO sdo = new UserDAO();
    return sdo.DLchaXun(stu);
}

}
