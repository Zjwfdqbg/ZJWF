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
import com.dao.PopedomDAO;
import com.model.Popedom;

import java.util.*;
public class PopedomBusiness {
    private PopedomBusiness() {
    }
    //����
public static void insert(Popedom stu) {
PopedomDAO sdo = new PopedomDAO();
sdo.insert(stu);
}

//ɾ��
public static void delete(Popedom stu) {
PopedomDAO sdo = new PopedomDAO();
sdo.delete(stu);
}

//�޸�
public static void update(Popedom stu){
PopedomDAO sdo = new PopedomDAO();
sdo.update(stu);
}

//ȫ����ѯ
public static ArrayList select() {
PopedomDAO sdo = new PopedomDAO();
return sdo.chaXun();
}

//������ѯ
public static ArrayList select(Popedom stu) {
PopedomDAO sdo = new PopedomDAO();
return sdo.chaXun(stu);
}

}
