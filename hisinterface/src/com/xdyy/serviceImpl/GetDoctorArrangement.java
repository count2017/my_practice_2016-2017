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

public class GetDoctorArrangement {		
	
	public String getDoctorArrangementStr(Map<?, ?> map){
		
		String string=DoctorArrangement(map);
		StringBuffer strbuf=new StringBuffer();
		strbuf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		strbuf.append("\r\n");
		strbuf.append("<MSG>");	
		strbuf.append("<MSH>");
		strbuf.append("<ORG_CODE>00078</ORG_CODE>");
		strbuf.append("<InCODE>M01003</InCODE>");
		strbuf.append("<BaseFun>GetDoctorArrangement</BaseFun>");
		strbuf.append("</MSH>");
		strbuf.append("<RES>");
		strbuf.append(string);	
		strbuf.append("</RES>");
		strbuf.append("</MSG>");
		
		return strbuf.toString();
	}


	public String DoctorArrangement(Map<?, ?> map) {
		
		 Dao dao=new Dao();
		 StringBuilder strbuilder=new StringBuilder();
		 StringBuilder strbld=new StringBuilder();
		 List<String> paramValues=new ArrayList<String>();
		 List<DoctorArrangementBean> list=new ArrayList<DoctorArrangementBean>();
		
		 if(!map.get("CKSBM").equals("") ){
			 strbuilder.append(" and iksbm=? ");
			 paramValues.add(map.get("CKSBM").toString());
		 }
		
		 if(!map.get("IYSBM").equals("")){
			 strbuilder.append(" and IYSBM=?");
			 paramValues.add(map.get("IYSBM").toString());
		 }
		 
		 String sql="select top 30 * from  YLLED..TBQTYXMZYSPB where 1=1     "+strbuilder.toString();
			Object[] params=paramValues.toArray();				
			try {
				ResultSet rs = dao.query(sql, params);
				while(rs.next()){
					DoctorArrangementBean doctorarr=new DoctorArrangementBean();
					doctorarr.setCpbbh(rs.getString("CPBBH"));
					doctorarr.setCpbrq(rs.getString("DZZRQ"));
					doctorarr.setCzzweek(rs.getString("CWEEKDAY"));
					doctorarr.setImax(rs.getString("imax"));
					doctorarr.setCghzlbm(rs.getString("ighzl"));
					doctorarr.setCghzlmc(rs.getString("cghzl"));
					doctorarr.setCtzbj(rs.getString("tzbj"));
					doctorarr.setIcount("0");
					doctorarr.setIsyh("0");
					doctorarr.setCysbm(rs.getString("iysbm"));
					doctorarr.setCysmc(rs.getString("cysmc"));
					doctorarr.setCysjs(rs.getString("cysjs"));
					doctorarr.setCzc(rs.getString("czc"));
					doctorarr.setMzje(rs.getString("mzje"));
					doctorarr.setMghf(rs.getString("mghf"));
					doctorarr.setMzlf(rs.getString("mzlf"));
					doctorarr.setCksbm(rs.getString("iksbm"));
					doctorarr.setCksmc(rs.getString("cksmc"));
					doctorarr.setCkssj(rs.getString("ckssj"));
					doctorarr.setCjssj(rs.getString("cjssj"));
					doctorarr.setCsjd(rs.getString("csjd"));
					doctorarr.setCdz(rs.getString("cdz"));
					list.add(doctorarr);
				}
				strbld.append("<Rows>");
				for(int i=0;i<list.size();i++){					
				strbld.append("<Row CPBBH=\""+list.get(i).getCpbbh()+"\" CPBRQ=\""+list.get(i).getCpbrq()+"\" CZZWEEK=\""+list.get(i).getCzzweek()+"\"");
				strbld.append(" IMAX=\""+list.get(i).getImax()+"\" GHZLBM=\""+list.get(i).getCghzlbm()+"\" GHZLMC=\""+list.get(i).getCghzlmc()+"\" ");
				strbld.append(" TZBJ=\""+list.get(i).getCtzbj()+"\" ICOUNT=\"0\" ");
				strbld.append("ISYH=\"0\"  IYSBM=\""+list.get(i).getCysbm()+"\" ");
				strbld.append("CYSMC=\""+list.get(i).getCysmc()+"\" CYSJS=\""+list.get(i).getCysjs()+"\" ");
				strbld.append("CZC=\""+list.get(i).getCzc()+"\" MZJE=\""+list.get(i).getMzje()+"\" ");
				strbld.append("MGHF=\""+list.get(i).getMghf()+"\" MZLF=\""+list.get(i).getMzlf()+"\" IKSBM=\""+list.get(i).getCksbm()+"\" ");
				strbld.append("CKSMC=\""+list.get(i).getCksmc()+"\" CKSSJ=\""+list.get(i).getCkssj()+"\" CJSSJ=\""+list.get(i).getCjssj()+"\" ");
				strbld.append("CSJD=\""+list.get(i).getCsjd()+"\" CDZ=\""+list.get(i).getCdz()+"\" /> ");
				}
				strbld.append("</Rows>");
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				strbld.append("<RES.1>"+sf.format(new Date())+"</RES.1>");
				strbld.append("<RES.2>1</RES.2>");
			} catch (SQLException e) {
				SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				strbld.append("<RES.1>"+sf.format(new Date())+"</RES.1>");
				strbld.append("<RES.2>0</RES.2>");
				strbld.append("<ERR>"+e.getMessage()+"</ERR>");
			}		 
		 return strbld.toString();
		 
	}

}
