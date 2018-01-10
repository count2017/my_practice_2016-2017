package interceptors;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import model.User;

public class Interceptor02 extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession();
		User u=(User)session.getAttribute("User");
		String role=u.getRole();
		if(!("系统维护员".equals(role)||"普通用户".equals(role))){
			session.removeAttribute("mess");
			return arg0.invoke();
		}
		String reMess="对不起，您没有此权限";
		session.setAttribute("mess", reMess);
		return "refused";
	}

}
