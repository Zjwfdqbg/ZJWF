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
    //增加
public static void insert(Computer stu) {
    ComputerDAO sdo = new ComputerDAO();
    sdo.insert(stu);
}

//删除
public static void delete(Computer stu) {
    ComputerDAO sdo = new ComputerDAO();
    sdo.delete(stu);
}

//修改
public static void update(Computer stu){
    ComputerDAO sdo = new ComputerDAO();
    sdo.update(stu);
}

//全部查询
public static ArrayList select() {
    ComputerDAO sdo = new ComputerDAO();
    return sdo.chaXun();
}

//条件查询
public static ArrayList select(Computer stu) {
    ComputerDAO sdo = new ComputerDAO();
    return sdo.chaXun(stu);
}
}
