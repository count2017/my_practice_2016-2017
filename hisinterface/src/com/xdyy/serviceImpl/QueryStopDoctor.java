package com.xdyy.serviceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.xdyy.bean.DoctorArrangementBean;
import com.xdyy.tools.dao.Dao;

public class QueryStopDoctor  {

	public String getQueryStopDoctor(Map<?, ?> map) {
		Dao dao=new Dao();
		String strsql=null;
		StringBuffer strbuf=new StringBuffer();
		StringBuffer strbld=new StringBuffer();
		List<String> paramValues=new ArrayList<String>();
		ArrayList<DoctorArrangementBean> list=new ArrayList<DoctorArrangementBean>();
		System.out.println(map.get("IYSBM")+"ioioioi"+map.get("DRQ"));
		if(!map.get("IYSBM").equals("")){
			strbuf.append(" and iysbm=? ");
			paramValues.add(map.get("IYSBM").toString());						
		}

		if(!map.get("IYSBM").equals("")){
			strbuf.append(" and czzrq=? ");
			paramValues.add(map.get("DRQ").toString());		
		}
		
		strsql="select top 50 * from (select dbo.Week2Day(CPBBH,DPBRQ) CZZRQ,* from YXHIS..V_QTYXPBVIEW  ) a WHERE IYSBM NOT IN (SELECT IYSBM FROM YXHIS..TBZDMZYS_ALL)"+strbuf.toString();
		Object[] params=paramValues.toArray();		
		try {
			ResultSet rs=dao.query(strsql, params);
			while(rs.next()){
			DoctorArrangementBean doctorStop=new DoctorArrangementBean();
			doctorStop.setCksbm(rs.getString("iksbm"));
			doctorStop.setCksmc(rs.getString("cksmc"));
			doctorStop.setCysbm(rs.getString("iysbm"));
			doctorStop.setCysmc(rs.getString("cysmc"));
			doctorStop.setCpbrq(rs.getString("czzrq"));	
			list.add(doctorStop);
			}	
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			
			strbld.append("<Rows>");
			for(int i=0;i<list.size();i++){
				strbld.append("<Row DPBRQ=\""+list.get(i).getCpbrq()+"\" IYSBM=\""+list.get(i).getCysbm()+"\"");
				strbld.append("  CYSMC=\""+list.get(i).getCysmc()+"\" IKSBM=\""+list.get(i).getCksbm()+"\"");
				strbld.append("  CKSMC=\""+list.get(i).getCksmc()+"\" DTZRQ=\""+df.format(new Date())+"\" />");
			}
			strbld.append("</Rows>");
			strbld.append("<RES.1>"+df.format(new Date())+"</RES.1>");
			strbld.append("<RES.2>1</RES.2>");			
		} catch (SQLException e) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			strbld.append("<RES.1>"+df.format(new Date())+"</RES.1>");
			strbld.append("<RES.2>0</RES.2>");
			strbld.append("<ERR>"+e.getMessage()+"</ERR>");
		}
		return getQueryStopDoctorStr(strbld.toString());
	}

	public String getQueryStopDoctorStr(String str) {
		
		StringBuffer  strbuf=new StringBuffer();	
		strbuf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		strbuf.append("\r\n");
		strbuf.append("<MSG>");	
		strbuf.append("<MSH>");
		strbuf.append("<ORG_CODE>00078</ORG_CODE>");
		strbuf.append("<InCODE>M01007</InCODE>");
		strbuf.append("<BaseFun>QueryStopDoctor</BaseFun>");
		strbuf.append("</MSH>");
		strbuf.append("<RES>");
		strbuf.append(str);	
		strbuf.append("</RES>");
		strbuf.append("</MSG>");			
		return strbuf.toString();
	}

}
