package com.chinasofti.etc.test;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.chinasofti.etc.dao.EmpDao;
import com.chinasofti.etc.dao.EmpDaoImpl;
import com.chinasofti.etc.model.Dept;
import com.chinasofti.etc.model.Emp;
import com.chinasofti.etc.tools.SessionFactoryUtil;

public class TestEmp {
	private Transaction tr;
	private Session session;
	@Before
	public void init(){
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		session = sf.openSession();
		tr = session.beginTransaction();
		
	}
	
	@After
	public void exit(){
		tr.commit();
		session.close();
	}
	
	@Test
	public void Test01(){
		Emp e1 = new Emp();
		e1.setName("H");
		Dept d1 = (Dept) session.load(Dept.class, 20);
		System.out.println(d1);
		d1.getEmps().add(e1);
		System.out.println("--------------------");
		session.save(e1);
		Set<Emp> emps = (Set<Emp>) d1.getEmps();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
	
	
//	
//	public static void main(String[] args) {
////		Scanner sc = new Scanner(System.in);
////		System.out.println("��������Ҫ�ڼ�ҳ�ļ�¼");
////		int nowPage = sc.nextInt();
////		System.out.println("������ÿҳ�ܹ��ж�������¼");
////		int pageRecord = sc.nextInt();
////		String name = sc.next();
//		//����ͨ��Ա����Ų�ѯ
//		EmpDao dao = new EmpDaoImpl();
////		List<Object[]> l = dao.groupBy();
////	    for (Object[] objects : l) {
////			System.out.println(objects[0]+"-----"+objects[1]);
////		}
////		Emp e = dao.queryByEmpno(empno);
//		//���Բ�ѯ������Ϣ
////		List<Emp> list = dao.queryEmpByDeptno(deptno);
////		List<Emp> list = dao.queryEmpByLikeEname(name);
////		List<Emp> list = dao.queryEmpByPage(nowPage, pageRecord);
////		for (Emp emp : list) {
////			System.out.println(emp);
////		}
//	    //��ѯԱ������Ϊ3�Ĳ�����Ϣ
//	   List<Dept> ds =  dao.queryDept(3);
//	   for (Dept dept : ds) {
//		System.out.println("���ű�ţ�"+dept.getDeptno()+"��������"+dept.getDname());
//	}
//	    
//	}

}
