package com.xdyy.serviceImpl;




import java.util.Map;

import javax.jws.WebService;




import com.xdyy.tools.xmltostr.XmlResolve;

@WebService
public class WebServiceInterfaceImpl {
	

	
	public String funcResult(String xmlstr) throws Exception{
		System.out.println(xmlstr);
		String str="";
		
		Map<?, ?> map=new XmlResolve().parse(xmlstr);	
		
		if (map.get("BaseFun").toString().equals("GetDept_MZ")){
			str=new GetDepartmentImpl().getDepartment(map);
		}
		
		if(map.get("BaseFun").toString().equals("GetDoctorInfo")){
			str=new GetDoctorInfor().getDoctorInfor(map);
		}
		
		if(map.get("BaseFun").toString().equals("GetDoctorArrangement")){
			str=new GetDoctorArrangement().getDoctorArrangementStr(map);
		}
		
		if(map.get("BaseFun").toString().equals("getMZHYinfo")){
			str=new GetMZHYinfor().getMZHYinfor(map);
		}
		
		if(map.get("BaseFun").toString().equals("QueryStopDoctor")){
			str=new QueryStopDoctor().getQueryStopDoctor(map);
		}
		
		if(map.get("BaseFun").toString().equals("GetHZDLinfor")){
			str=new GetHZDLinfor().getHZDLinforStr(map);
		}
		System.out.println(str);
		return str;
	}


	

	
	

}
