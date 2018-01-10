<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleWebServiceInterfaceImplProxyid" scope="session" class="com.xdyy.serviceImpl.WebServiceInterfaceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleWebServiceInterfaceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleWebServiceInterfaceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleWebServiceInterfaceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.xdyy.serviceImpl.WebServiceInterfaceImpl getWebServiceInterfaceImpl10mtemp = sampleWebServiceInterfaceImplProxyid.getWebServiceInterfaceImpl();
if(getWebServiceInterfaceImpl10mtemp == null){
%>
<%=getWebServiceInterfaceImpl10mtemp %>
<%
}else{
        if(getWebServiceInterfaceImpl10mtemp!= null){
        String tempreturnp11 = getWebServiceInterfaceImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String xmlstr_1id=  request.getParameter("xmlstr16");
            java.lang.String xmlstr_1idTemp = null;
        if(!xmlstr_1id.equals("")){
         xmlstr_1idTemp  = xmlstr_1id;
        }
        java.lang.String funcResult13mtemp = sampleWebServiceInterfaceImplProxyid.funcResult(xmlstr_1idTemp);
if(funcResult13mtemp == null){
%>
<%=funcResult13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(funcResult13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>