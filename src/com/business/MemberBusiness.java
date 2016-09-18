package com.business;

 
import com.dao.MemberDAO;
import com.model.Member;

import java.util.*;
public class MemberBusiness {
    private MemberBusiness() {
    }
    //增加
public static void insert(Member stu) {
MemberDAO sdo = new MemberDAO();
sdo.insert(stu);
}

//删除
public static void delete(Member stu) {
MemberDAO sdo = new MemberDAO();
sdo.delete(stu);
}

//修改
public static void update(Member stu){
MemberDAO sdo = new MemberDAO();
sdo.update(stu);
}

//全部查询
public static ArrayList select() {
MemberDAO sdo = new MemberDAO();
return sdo.chaXun();
}

//条件查询
public static ArrayList select(Member stu) {
MemberDAO sdo = new MemberDAO();
return sdo.chaXun(stu);
}

}
