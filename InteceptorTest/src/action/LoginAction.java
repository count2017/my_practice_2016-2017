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
                //将用户账号保存至session范围内
                session.setAttribute("account", account);
	 return SUCCESS;
          }else{
                return  "login";
          }
    //以下省略account和password属性的getter和setter方法
    }
}
