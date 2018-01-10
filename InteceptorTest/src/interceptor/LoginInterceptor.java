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
          //如果obj!=null说明session范围内可以获取到用户账号，说明用户已经登录        
          if(obj!=null){                  
               return invocation.invoke();
           }
           HttpServletRequest request=ServletActionContext.getRequest();
           //将错误提示信息保存至request范围内
           request.setAttribute("errorMsg", "对不起您还没有登录，请先登录");
           return "login";
    }
}

