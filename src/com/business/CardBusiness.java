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
import com.dao.CardDAO;
import com.model.Card;

import java.util.*;
public class CardBusiness {
    private CardBusiness() {
    }
    //����
public static void insert(Card stu) {
CardDAO sdo = new CardDAO();
sdo.insert(stu);
}



//ɾ��
public static void delete(Card stu) {
CardDAO sdo = new CardDAO();
sdo.delete(stu);
}



//�޸�
public static void update(Card stu){
CardDAO sdo = new CardDAO();
sdo.update(stu);
}
 public static void GengXin(Card stu){
    CardDAO sdo = new CardDAO();
    sdo.GengXin(stu);
}
 
 
//ȫ����ѯ
public static ArrayList select() {
CardDAO sdo = new CardDAO();
return sdo.chaXun();
}



//������ѯ
public static ArrayList select(Card stu) {
CardDAO sdo = new CardDAO();
return sdo.chaXun(stu);
}
 public static ArrayList Dselect(Card stu) {
CardDAO sdo = new CardDAO();
return sdo.chaXun1(stu);
}


}
