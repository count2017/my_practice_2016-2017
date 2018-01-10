package com.chinasofti.etc.dao;

import java.util.List;

import com.chinasofti.etc.model.Dept;
import com.chinasofti.etc.model.Emp;

public interface EmpDao {
	Emp queryByEmpno(int empno);
	List<Emp> queryAll();
	List<Emp> queryEmpByDeptno(int deptno);
	List<Emp> queryEmpByLikeEname(String word);
	List<Emp> queryEmpByPage(int nowPage,int pageRecords);
	List<Object[]> groupBy();
	//查询员工数量为3的部门信息
	List<Dept> queryDept(int count);
}
