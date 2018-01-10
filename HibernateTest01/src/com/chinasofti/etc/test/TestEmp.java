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
//		System.out.println("请输入你要第几页的记录");
//		int nowPage = sc.nextInt();
//		System.out.println("请输入每页总共有多少条记录");
//		int pageRecord = sc.nextInt();
//		String name = sc.next();
		//测试通过员工编号查询
		EmpDao dao = new EmpDaoImpl();
//		List<Object[]> l = dao.groupBy();
//	    for (Object[] objects : l) {
//			System.out.println(objects[0]+"-----"+objects[1]);
//		}
//		Emp e = dao.queryByEmpno(empno);
		//测试查询所有信息
//		List<Emp> list = dao.queryEmpByDeptno(deptno);
//		List<Emp> list = dao.queryEmpByLikeEname(name);
//		List<Emp> list = dao.queryEmpByPage(nowPage, pageRecord);
//		for (Emp emp : list) {
//			System.out.println(emp);
//		}
	    //查询员工数量为3的部门信息
	   List<Dept> ds =  dao.queryDept(3);
	   for (Dept dept : ds) {
		System.out.println("部门编号："+dept.getDeptno()+"部门名称"+dept.getDname());
	}
	    
	}

}
