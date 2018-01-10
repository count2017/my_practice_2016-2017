package com.chinasofti.etc.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.chinasofti.etc.model.Dept;
import com.chinasofti.etc.model.Emp;
import com.chinasofti.etc.tools.SessionFactoryUtil;

public class EmpDaoImpl implements EmpDao{

	@Override
	public Emp queryByEmpno(int empno) {
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		String hql = "from Emp e where e.empno=:empno";
		Query query = session.createQuery(hql);
		query.setInteger("empno", empno);
		List<Emp> emp = query.list();
		Emp e = emp.get(0);
		session.close();
		return e;
	}

	@Override
	public List<Emp> queryAll() {
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		//因为查询的结果中COMM字段有些为空值，所以它的类型必须为包装器类型
		String hql = "from Emp";
		Query query = session.createQuery(hql);
		List<Emp> list = query.list();
		session.close();
		return list;
	}
	@Override
	public List<Emp> queryEmpByDeptno(int deptno){
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Dept d = new Dept();
		d.setDeptno(deptno);
		String hql = "from Emp e where e.deptno=:dept";
		List<Emp> emps = session.createQuery(hql).setEntity("dept", d).list();
		session.close();
		return emps;
		
	}

	@Override
	public List<Emp> queryEmpByLikeEname(String word) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		String hql = "from Emp e where e.name like ?";
		Query q =  session.createQuery(hql);
		q.setString(0, "%"+word+"%");
		List<Emp> emps =q.list();
		session.close();
		return emps;
	}

	@Override
	public List<Emp> queryEmpByPage(int nowPage, int pageRecords) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		String hql = "from Emp e order by e.empno";
		Query query = session.createQuery(hql);
		query.setFirstResult((nowPage-1)*pageRecords);
		query.setMaxResults(pageRecords);
		List<Emp> list = query.list();
		session.close();
		return list;
	}

	@Override
	public List<Object[]> groupBy() {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		String hql = "select max(e.sal),e.deptno from Emp e group by e.deptno";
		//group by 进行分组时， session.createSQLQuery(hql);
		Query query = session.createSQLQuery(hql);
		List<Object[]> l = query.list();
		session.close();
		return l;
	}

	@Override
	public List<Dept> queryDept(int count) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		String hql = "from Dept d where (select count(e) from d.emps e)=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, count);
		List<Dept> ds = query.list();
		return ds;
	}

}
