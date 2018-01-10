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
		if("admin01".equals(name)&&"123".equals(pass)&&"ϵͳ����Ա".equals(role)){
			flag=true;
		}else if("admin02".equals(name)&&"123".equals(pass)&&"ϵͳά��Ա".equals(role)){
			flag=true;
		}else if("admin03".equals(name)&&"123".equals(pass)&&"��ͨ�û�".equals(role)){
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
			session.setAttribute("login_failed", "��Ǹ��������ĵ���Ϣ����������");
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
