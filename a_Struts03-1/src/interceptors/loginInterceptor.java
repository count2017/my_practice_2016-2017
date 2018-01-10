package interceptors;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import model.User;

public class loginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation a) throws Exception {
		HttpSession session=ServletActionContext.getRequest().getSession();
		User u=(User)session.getAttribute("User");
		if(u!=null){
			return a.invoke();
		}
		session.setAttribute("msg", "ÄúÉÐÎ´µÇÂ¼£¬ÇëÏÈµÇÂ¼");
		return "fail";
	}

}
