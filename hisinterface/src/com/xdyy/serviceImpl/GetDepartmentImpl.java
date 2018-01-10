package com.xdyy.serviceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.xdyy.bean.DepartmentBean;
import com.xdyy.tools.dao.Dao;






public class GetDepartmentImpl {
	
	public String getDepartment(Map<?, ?> map) {
			
			Dao dao =new Dao();		
			List<DepartmentBean> list=new ArrayList<DepartmentBean>();
			StringBuilder strbuilder=new StringBuilder();
			StringBuilder strbuf=new StringBuilder();
			List<String> paramValues=new ArrayList<String>();
			
			if (map.get("CKSBM")!=null){
				strbuilder.append(" and iksbm=? ");
				paramValues.add(map.get("CKSBM").toString());
			}
			
			String sql="SELECT * FROM YXHIS..TBZDMZKS WHERE BENABLE=1 "+strbuilder.toString();
			Object[] params=paramValues.toArray();		
			
			try {
				ResultSet rs=dao.query(sql, params);
				while(rs.next()){
					DepartmentBean department=new DepartmentBean();
					department.setCksbm(rs.getString("iksbm"));
					department.setCksmc(rs.getString("cksmc"));
					department.setCbz(rs.getString("cbz"));
					department.setCfybm(rs.getString("cfybm"));
					department.setCpym(rs.getString("cpym"));
					list.add(department);			
				}
			
				strbuf.append("<Rows>");
				for(int i=0;i<list.size();i++){				
					strbuf.append("<ROW CKSBM=\""+list.get(i).getCksbm()+"\" CPYM=\""+list.get(i).getCksmc()+"\" ");
					strbuf.append("CPYM=\""+list.get(i).getCpym()+"\" CKSDZ=\""+list.get(i).getCbz()+"\" ");
					strbuf.append("CFYBM=\""+list.get(i).getCfybm()+"\" CFYMC=\""+list.get(i).getCfymc()+"\" />");
				}
				strbuf.append("</Rows>");
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				strbuf.append("<RES.1>"+sf.format(new Date())+"</RES.1>");
				strbuf.append("<RES.2>1</RES.2>");
			} catch (SQLException e) {	
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				strbuf.append("<RES.1>"+sf.format(new Date())+"</RES.1>");
				strbuf.append("<RES.2>0</RES.2>");
				strbuf.append("<ERR>"+e.getMessage()+"</ERR>");
			}
		
			String str=getDepartmentImplStr(strbuf.toString());		
			return str;		
		}
	
	
	public String getDepartmentImplStr(String string) {
		StringBuffer strbuf=new StringBuffer();
		strbuf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		strbuf.append("\r\n");
		strbuf.append("<MSG>");	
		strbuf.append("<MSH>");
		strbuf.append("<ORG_CODE>00078</ORG_CODE>");
		strbuf.append("<InCODE>M01000</InCODE>");
		strbuf.append("<BaseFun>GetDept_MZ</BaseFun>");
		strbuf.append("</MSH>");
		strbuf.append("<RES>");		
		strbuf.append(string);
		strbuf.append("</RES>");
		strbuf.append("</MSG>");	
		return strbuf.toString();
		
	}

	
}
