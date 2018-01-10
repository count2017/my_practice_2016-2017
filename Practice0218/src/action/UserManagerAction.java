package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import model.User;

public class UserManagerAction extends ActionSupport{
	private User u;
	
	
	public User getU() {
		return u;
	}


	public void setU(User u) {
		this.u = u;
	}


	public String login(){
		String name = u.getName();
		String pass = u.getPass();
		if("admim".equals(name)&&"123".equals(pass)){
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			session.setAttribute("user", u);
			return SUCCESS;
		}
		return "fail";
	}
}
