package com.chinasofti.etc.test;

import java.util.List;
import java.util.Scanner;

import com.chinasofti.etc.dao.EmpDao;
import com.chinasofti.etc.dao.EmpDaoImpl;
import com.chinasofti.etc.model.Dept;
import com.chinasofti.etc.model.Emp;

public class TestEmp {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("��������Ҫ�ڼ�ҳ�ļ�¼");
//		int nowPage = sc.nextInt();
//		System.out.println("������ÿҳ�ܹ��ж�������¼");
//		int pageRecord = sc.nextInt();
//		String name = sc.next();
		//����ͨ��Ա����Ų�ѯ
		EmpDao dao = new EmpDaoImpl();
//		List<Object[]> l = dao.groupBy();
//	    for (Object[] objects : l) {
//			System.out.println(objects[0]+"-----"+objects[1]);
//		}
//		Emp e = dao.queryByEmpno(empno);
		//���Բ�ѯ������Ϣ
//		List<Emp> list = dao.queryEmpByDeptno(deptno);
//		List<Emp> list = dao.queryEmpByLikeEname(name);
//		List<Emp> list = dao.queryEmpByPage(nowPage, pageRecord);
//		for (Emp emp : list) {
//			System.out.println(emp);
//		}
	    //��ѯԱ������Ϊ3�Ĳ�����Ϣ
	   List<Dept> ds =  dao.queryDept(3);
	   for (Dept dept : ds) {
		System.out.println("���ű�ţ�"+dept.getDeptno()+"��������"+dept.getDname());
	}
	    
	}

}
