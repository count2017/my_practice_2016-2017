package com.chinasofti.etc.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
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
//		session.doWork(new Work(){
//
//			@Override
//			public void execute(Connection connection) throws SQLException {
//				// TODO Auto-generated method stub
//				connection.setAutoCommit(true);
//			}});
		Emp e1 = new Emp();
		e1.setName("W");
		Dept d1 = (Dept) session.load(Dept.class, 20);
		Dept d2 = (Dept) session.load(Dept.class, 40);
		System.out.println("--------------------");
		e1.setDeptno(d2);
		System.out.println("--------------------");
		d1.getEmps().add(e1);
		System.out.println("--------------------");
		Set<Emp> emps = (Set<Emp>) d1.getEmps();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
	
	
//	
//	public static void main(String[] args) {
////		Scanner sc = new Scanner(System.in);
////		System.out.println("请输入你要第几页的记录");
////		int nowPage = sc.nextInt();
////		System.out.println("请输入每页总共有多少条记录");
////		int pageRecord = sc.nextInt();
////		String name = sc.next();
//		//测试通过员工编号查询
//		EmpDao dao = new EmpDaoImpl();
////		List<Object[]> l = dao.groupBy();
////	    for (Object[] objects : l) {
////			System.out.println(objects[0]+"-----"+objects[1]);
////		}
////		Emp e = dao.queryByEmpno(empno);
//		//测试查询所有信息
////		List<Emp> list = dao.queryEmpByDeptno(deptno);
////		List<Emp> list = dao.queryEmpByLikeEname(name);
////		List<Emp> list = dao.queryEmpByPage(nowPage, pageRecord);
////		for (Emp emp : list) {
////			System.out.println(emp);
////		}
//	    //查询员工数量为3的部门信息
//	   List<Dept> ds =  dao.queryDept(3);
//	   for (Dept dept : ds) {
//		System.out.println("部门编号："+dept.getDeptno()+"部门名称"+dept.getDname());
//	}
//	    
//	}

}
