package com.business;

 
import com.dao.RecordDAO;
import com.model.Record;

import java.util.*;

public class RecordBuiness {
    private RecordBuiness() {
    }
    //增加
public static void insert(Record stu) {
RecordDAO sdo = new RecordDAO();
sdo.insert(stu);
}

//删除
public static void delete(Record stu) {
RecordDAO sdo = new RecordDAO();
sdo.delete(stu);
}

//修改
public static void update(Record stu){
RecordDAO sdo = new RecordDAO();
sdo.update(stu);
}

//全部查询
public static ArrayList select() {
RecordDAO sdo = new RecordDAO();
return sdo.chaXun();
}

//条件查询
public static ArrayList select(Record stu) {
RecordDAO sdo = new RecordDAO();
return sdo.chaXun(stu);
}

public static boolean judge(Record stu){
RecordDAO sdo = new RecordDAO();
return sdo.judgement(stu);
}


}
