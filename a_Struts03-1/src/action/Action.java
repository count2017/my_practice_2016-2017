package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Action {
	public String add(){
		String mess="您成功执行了addUser()";
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("mess", mess);
		return "add";
	}
	public String delete(){
		String mess="您成功执行了deleteUser()";
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("mess", mess);
		return "delete";
	}
	public String update(){
		String mess="您成功执行了updateUser()";
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("mess", mess);
		return "update";
	}
	public String query(){
		String mess="您成功执行了queryUser()";
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("mess", mess);
		return "query";
	}
}
