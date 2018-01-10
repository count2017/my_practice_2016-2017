package com.xdyy.serviceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.xdyy.bean.HzdlBean;

import com.xdyy.tools.dao.Dao;

public class GetHZDLinfor {

	public String getHZDLinfor(Map<?, ?> map) {
		Dao dao=new Dao();
		StringBuilder strbuilder=new StringBuilder();
		StringBuilder strbld=new StringBuilder();
		List<String> paramValues=new ArrayList<String>();	
		List<HzdlBean> list=new ArrayList<HzdlBean>();
		 
		String sql=" SELECT top 30 * FROM YXHIS..v_HZDLVIEW WHERE  1=1";
		Object[] params=paramValues.toArray();	
		
		if(map.get("iKSBM")!=null){
			 strbuilder.append(" and iksbm=? ");
			 paramValues.add(map.get("CKSBM").toString());
		 }
		
		 if(map.get("ckslsh")!=null){
			 strbuilder.append(" and ckslsh=?");
			 paramValues.add(map.get("iksbm").toString());
		 }
		 
		try {
			ResultSet rs = dao.query(sql, params);
			while(rs.next()){
				HzdlBean hzdl=new HzdlBean();
				hzdl.setIksbm(rs.getString("iksbm"));				
				hzdl.setCdqjzh(rs.getString("cdqjzh"));
				hzdl.setCghzl(rs.getString("cghzl"));
				hzdl.setCkslsh(rs.getString("ckslsh"));
				hzdl.setCksmc(rs.getString("cksmc"));
				hzdl.setCmzh(rs.getString("cmzh"));
				hzdl.setCysmc(rs.getString("cysmc"));
				hzdl.setDgh(rs.getDate("dgh"));
				list.add(hzdl);
				
			}	
			strbld.append("<Rows>");
			
		for(int i=0;i<list.size();i++){
			strbld.append("<Row IKSBM=\""+list.get(i).getIksbm()+"\" CKSMC=\""+list.get(i).getCksmc()+"\"");
			strbld.append(" CGHZL=\""+list.get(i).getCghzl()+"\" CMZH=\""+list.get(i).getCmzh()+"\"");			
			strbld.append(" CYSMC=\""+list.get(i).getCysmc()+"\" DGH=\""+list.get(i).getDgh()+"\"");
			strbld.append(" CDQJZH=\""+list.get(i).getCdqjzh()+"\" CKSLSH=\""+list.get(i).getCkslsh()+"\" />");
		}
		strbld.append("</Rows>");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		strbld.append("<RES.1>"+df.format(new Date())+"</RES.1>");
		strbld.append("<RES.2>1</RES.2>");
		} catch (SQLException e) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
			strbld.append("<RES.1>"+df.format(new Date())+"</RES.1>");
			strbld.append("<RES.2>0</RES.2>");
			strbld.append("<ERR>"+e.getMessage()+"</ERR>");
		}			 
		return strbld.toString();
	
	}
	
	
	public String getHZDLinforStr(Map<?, ?> map){
		StringBuffer  strbuf=new StringBuffer();
		String str=getHZDLinfor(map);
		
		strbuf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		strbuf.append("\r\n");
		strbuf.append("<MSG>");	
		strbuf.append("<MSH>");
		strbuf.append("<ORG_CODE>00078</ORG_CODE>");
		strbuf.append("<InCODE>M01005</InCODE>");
		strbuf.append("<BaseFun>getMZHYinfo</BaseFun>");
		strbuf.append("</MSH>");
		strbuf.append("<RES>");
		strbuf.append(str);	
		strbuf.append("</RES>");
		strbuf.append("</MSG>");			
		return strbuf.toString();	
	}

}
