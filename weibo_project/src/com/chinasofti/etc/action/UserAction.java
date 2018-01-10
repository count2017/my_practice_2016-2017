package com.chinasofti.etc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.chinasofti.etc.model.User;
import com.chinasofti.etc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements ServletRequestAware{
	private UserService userService;
	private User user;
	private String repassword;
	
	private HttpServletRequest request;
	private HttpSession session;
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		session = request.getSession();
		
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String reg(){
		if(userService.addUser(user)){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public String login(){
		user = userService.login(user.getUsername(), user.getPassword());
		if(user!=null){
			session.setAttribute("user", user);
			return "queryWeibo";
		}else{
			return ERROR;
		}
	}
	

}
