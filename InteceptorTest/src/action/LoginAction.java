package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends  ActionSupport{
    private  String account;
    private  String  password;
    
    
    public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String login(){
          if("admin".equals(account) &&  "123456".equals(password)){
                HttpSession session=ServletActionContext.getRequest().getSession();
                //���û��˺ű�����session��Χ��
                session.setAttribute("account", account);
	 return SUCCESS;
          }else{
                return  "login";
          }
    //����ʡ��account��password���Ե�getter��setter����
    }
}
