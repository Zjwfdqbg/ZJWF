package com.business;

 
import com.dao.RecordDAO;
import com.model.Record;

import java.util.*;

public class RecordBuiness {
    private RecordBuiness() {
    }
    //����
public static void insert(Record stu) {
RecordDAO sdo = new RecordDAO();
sdo.insert(stu);
}

//ɾ��
public static void delete(Record stu) {
RecordDAO sdo = new RecordDAO();
sdo.delete(stu);
}

//�޸�
public static void update(Record stu){
RecordDAO sdo = new RecordDAO();
sdo.update(stu);
}

//ȫ����ѯ
public static ArrayList select() {
RecordDAO sdo = new RecordDAO();
return sdo.chaXun();
}

//������ѯ
public static ArrayList select(Record stu) {
RecordDAO sdo = new RecordDAO();
return sdo.chaXun(stu);
}

public static boolean judge(Record stu){
RecordDAO sdo = new RecordDAO();
return sdo.judgement(stu);
}


}
