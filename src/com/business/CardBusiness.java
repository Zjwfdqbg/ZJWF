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
    //增加
public static void insert(Card stu) {
CardDAO sdo = new CardDAO();
sdo.insert(stu);
}



//删除
public static void delete(Card stu) {
CardDAO sdo = new CardDAO();
sdo.delete(stu);
}



//修改
public static void update(Card stu){
CardDAO sdo = new CardDAO();
sdo.update(stu);
}
 public static void GengXin(Card stu){
    CardDAO sdo = new CardDAO();
    sdo.GengXin(stu);
}
 
 
//全部查询
public static ArrayList select() {
CardDAO sdo = new CardDAO();
return sdo.chaXun();
}



//条件查询
public static ArrayList select(Card stu) {
CardDAO sdo = new CardDAO();
return sdo.chaXun(stu);
}
 public static ArrayList Dselect(Card stu) {
CardDAO sdo = new CardDAO();
return sdo.chaXun1(stu);
}


}
