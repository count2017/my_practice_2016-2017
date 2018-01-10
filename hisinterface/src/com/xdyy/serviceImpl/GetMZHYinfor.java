package com.xdyy.serviceImpl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.xdyy.bean.MzhyBean;
import com.xdyy.tools.dao.Dao;

public class GetMZHYinfor {
	

public String getMZHYinfor(Map<?, ?> map) throws SQLException  {
		StringBuffer  strbuf=new StringBuffer();
		String str=getMZHYinforstr(map);
		
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

	public String getMZHYinforstr(Map<?, ?> map){	
		Dao dao=new Dao();
		StringBuilder strbld=new StringBuilder();
		StringBuilder strbuilder=new StringBuilder();
		List<String> paramValues=new ArrayList<String>();	
		List<MzhyBean> list=new ArrayList<MzhyBean>();
		 
		
		
		 if(!map.get("CPBBH").equals("") ){
			strbuilder.append(" and CPBBH=? ");
			 paramValues.add(map.get("CPBBH").toString());
			 
		 }		
		 
		 String sql=" select   * from YLLED..TBQTYXMZYSPB WHERE DZZRQ >=CONVERT(VARCHAR(20),GETDATE(),112)    "+strbuilder.toString();
			
		 Object[] params=paramValues.toArray();	
		try {	
			ResultSet rs = dao.query(sql, params);
			while(rs.next()){
				MzhyBean mzhy=new MzhyBean();
				mzhy.setCpbbh(rs.getString("CPBBH"));
				mzhy.setImax(rs.getInt("imax"));
				mzhy.setIlock("1");
				mzhy.setDlock("");
				mzhy.setCjzsd(rs.getString("csjd"));
				mzhy.setIlockType("");
				mzhy.setIysbm(rs.getString("iysbm"));
				mzhy.setCysmc(rs.getString("cysmc"));
				mzhy.setCsjd(rs.getString("csjd"));
				mzhy.setIksbm(rs.getString("IKSBM"));
				mzhy.setCksmc(rs.getString("CKSMC"));
				mzhy.setDbegin(rs.getString("ckssj"));
				mzhy.setDend(rs.getString("cjssj"));
				list.add(mzhy);				
			}	
			strbld.append("<Rows>");
		for(int i=0;i<list.size();i++){
			for(int x=1;x<=10;x++){
			strbld.append("<Row CPBBH=\""+list.get(i).getCpbbh()+"\" IXH=\""+x+"\"");
			strbld.append(" ILock=\""+list.get(i).getIlock()+"\" DLock=\""+list.get(i).getDlock()+"\"");			
			strbld.append(" CJZSD=\""+list.get(i).getCjzsd()+"\" ILockType=\""+list.get(i).getIlockType()+"\"");
			strbld.append(" IYSBM=\""+list.get(i).getIysbm()+"\" CYSMC=\""+list.get(i).getCysmc()+"\"");
			strbld.append(" CSJD=\""+list.get(i).getCsjd()+"\" IKSBM=\""+list.get(i).getIksbm()+"\"");
			strbld.append(" CKSMC=\""+list.get(i).getCksmc()+"\" Dbegin=\""+list.get(i).getDbegin()+"\" Dend=\""+list.get(i).getDend()+"\" />");
			}
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
	

}
