package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Action {
	public String add(){
		String mess="���ɹ�ִ����addUser()";
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("mess", mess);
		return "add";
	}
	public String delete(){
		String mess="���ɹ�ִ����deleteUser()";
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("mess", mess);
		return "delete";
	}
	public String update(){
		String mess="���ɹ�ִ����updateUser()";
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("mess", mess);
		return "update";
	}
	public String query(){
		String mess="���ɹ�ִ����queryUser()";
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("mess", mess);
		return "query";
	}
}
