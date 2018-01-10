package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import model.User;

public class LoginAction {
	private User u;
	
	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

	public String Login(){
		boolean flag=false;
		String name=u.getUname();
		String pass=u.getUpass();
		String role=u.getRole();
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		if("admin01".equals(name)&&"123".equals(pass)&&"系统管理员".equals(role)){
			flag=true;
		}else if("admin02".equals(name)&&"123".equals(pass)&&"系统维护员".equals(role)){
			flag=true;
		}else if("admin03".equals(name)&&"123".equals(pass)&&"普通用户".equals(role)){
			flag=true;
		}
		if(flag){
			session.removeAttribute("msg");
			session.removeAttribute("login_failed");
			session.removeAttribute("User");
			session.setAttribute("User", u);
			return "success";
		}else{
			session.removeAttribute("login_failed");
			session.setAttribute("login_failed", "抱歉，您输入的的信息有误，请重试");
			session.removeAttribute("User");
			return "fail";
		}
	}
	public String execute(){
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		session.removeAttribute("mess");
		return "success";
	}
}
