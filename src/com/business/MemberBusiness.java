package com.business;

 
import com.dao.MemberDAO;
import com.model.Member;

import java.util.*;
public class MemberBusiness {
    private MemberBusiness() {
    }
    //����
public static void insert(Member stu) {
MemberDAO sdo = new MemberDAO();
sdo.insert(stu);
}

//ɾ��
public static void delete(Member stu) {
MemberDAO sdo = new MemberDAO();
sdo.delete(stu);
}

//�޸�
public static void update(Member stu){
MemberDAO sdo = new MemberDAO();
sdo.update(stu);
}

//ȫ����ѯ
public static ArrayList select() {
MemberDAO sdo = new MemberDAO();
return sdo.chaXun();
}

//������ѯ
public static ArrayList select(Member stu) {
MemberDAO sdo = new MemberDAO();
return sdo.chaXun(stu);
}

}
