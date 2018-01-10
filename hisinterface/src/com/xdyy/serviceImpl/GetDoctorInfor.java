package com.xdyy.serviceImpl;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.xdyy.bean.DoctorBean;
import com.xdyy.tools.dao.Dao;

public class GetDoctorInfor {
	
	


	public String getDoctorInforStr(String string)  {
		StringBuffer strbuf=new StringBuffer();
		strbuf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		strbuf.append("\r\n");
		strbuf.append("<MSG>");	
		strbuf.append("<MSH>");
		strbuf.append("<ORG_CODE>00078</ORG_CODE>");
		strbuf.append("<InCODE>M01002</InCODE>");
		strbuf.append("<BaseFun>GetDoctorInfo</BaseFun>");
		strbuf.append("</MSH>");
		strbuf.append("<RES>");		
		strbuf.append(string);		
		strbuf.append("</RES>");
		strbuf.append("</MSG>");
		
		return strbuf.toString();		
	}
	
	

	public String getDoctorInfor(Map<?, ?> map)  {
		
		Dao dao=new Dao();
		StringBuilder strbuilder=new StringBuilder();
		StringBuilder str=new StringBuilder();
		List<String> paramValues=new ArrayList<String>();
		List<DoctorBean> list=new ArrayList<DoctorBean>();
		
		
		/*if(!map.get("CKSBM").equals("")){
			strbuilder.append(" and IKS=? ");
			paramValues.add(map.get("CKSBM").toString());
		}
		
		if(!map.get("CYSBM").equals("")){
			strbuilder.append(" and ibm=? ");
			paramValues.add(map.get("CYSBM").toString());
		}*/
		
		Object[] params=paramValues.toArray();
		String sql="select  * from YXHIS..TBZDMZYS_ALL_new where 1=1 and cbz='专家号'  "+strbuilder.toString();
		try {
			ResultSet rs = dao.query(sql, params);			
			while(rs.next()){
				DoctorBean doctor=new DoctorBean();
				doctor.setCksmc(rs.getString("cmc"));
				doctor.setCksbm(rs.getString("IKS"));
				doctor.setCpym(rs.getString("cpym"));
				doctor.setCysbm(rs.getString("iysbm"));
				doctor.setCysmc(rs.getString("cysmc"));
				doctor.setCyszc("");
				doctor.setCysjs("");
				doctor.setCzptj("");
				doctor.setCsc("");
				list.add(doctor);
			}
			
		str.append("<Rows>");
		for(int i=0;i<list.size();i++){
			str.append("<Row CYSBM=\""+list.get(i).getCysbm()+"\" CYSMC=\""+list.get(i).getCysmc()+"\"");
			str.append(" CPYM=\""+list.get(i).getCpym()+"\" CKSBM=\""+list.get(i).getCksbm()+"\"");
			str.append(" CKSMC=\""+list.get(i).getCksmc()+"\" CZC=\""+list.get(i).getCyszc()+"\"");
			str.append(" CYSJS=\""+list.get(i).getCysjs()+"\" CSC=\""+list.get(i).getCsc()+"\"");
			str.append(" CZPLJ=\""+list.get(i).getCzptj()+"\" />");
		}
		str.append("</Rows>");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		str.append("<RES.1>"+sdf.format(new Date())+"</RES.1>");
		str.append("<RES.2>1</RES.2>");
		} catch (SQLException e) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");			
			str.append("<RES.1>"+sdf.format(new Date())+"</RES.1>");
			str.append("<RES.2>0</RES.2>");
			str.append("<ERR>"+e.getMessage()+"</ERR>");
		}	
		
		
		String strend=getDoctorInforStr(str.toString());
		return strend;
	}
	

}
