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
    //增加
public static void insert(Popedom stu) {
PopedomDAO sdo = new PopedomDAO();
sdo.insert(stu);
}

//删除
public static void delete(Popedom stu) {
PopedomDAO sdo = new PopedomDAO();
sdo.delete(stu);
}

//修改
public static void update(Popedom stu){
PopedomDAO sdo = new PopedomDAO();
sdo.update(stu);
}

//全部查询
public static ArrayList select() {
PopedomDAO sdo = new PopedomDAO();
return sdo.chaXun();
}

//条件查询
public static ArrayList select(Popedom stu) {
PopedomDAO sdo = new PopedomDAO();
return sdo.chaXun(stu);
}

}
