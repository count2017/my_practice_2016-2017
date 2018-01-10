package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor  extends  AbstractInterceptor{
    public String intercept(ActionInvocation invocation) throws Exception {
          HttpSession session=ServletActionContext.getRequest().getSession();
          Object obj=session.getAttribute("account");
          //���obj!=null˵��session��Χ�ڿ��Ի�ȡ���û��˺ţ�˵���û��Ѿ���¼        
          if(obj!=null){                  
               return invocation.invoke();
           }
           HttpServletRequest request=ServletActionContext.getRequest();
           //��������ʾ��Ϣ������request��Χ��
           request.setAttribute("errorMsg", "�Բ�������û�е�¼�����ȵ�¼");
           return "login";
    }
}

