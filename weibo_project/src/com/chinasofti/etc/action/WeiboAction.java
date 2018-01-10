package com.chinasofti.etc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.chinasofti.etc.dao.WeiboDao;
import com.chinasofti.etc.model.User;
import com.chinasofti.etc.model.Weibo;
import com.chinasofti.etc.service.WeiboService;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

public class WeiboAction extends ActionSupport implements ServletRequestAware{
	private WeiboService weiboService;
//	private WeiboDao weiboDao;
//	
//	public WeiboDao getWeiboDao() {
//		return weiboDao;
//	}
//	public void setWeiboDao(WeiboDao weiboDao) {
//		this.weiboDao = weiboDao;
//	}
	private String opt;
	private Weibo wb;
	private User user;
	private HttpServletRequest request;
	private HttpSession session;
	
	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
		session = request.getSession();
	}
	public WeiboService getWeiboService() {
		return weiboService;
	}
	public void setWeiboService(WeiboService weiboService) {
		this.weiboService = weiboService;
	}
	public Weibo getWb() {
		return wb;
	}
	public void setWb(Weibo wb) {
		this.wb = wb;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String addWeibo(){
		User u = (User)session.getAttribute("user");
		weiboService.addWeibo(wb, u);
		return "queryWeibo";
	}
	public String queryWeibo(){
		List<Weibo> list = weiboService.queryall();
		session.setAttribute("list", list);
		return SUCCESS;
	}
	public String deleteWeibo(){
		weiboService.deleteWeibo(wb.getWeiboid());
		return "queryWeibo";
	}
	public String updateWeibo(){
		weiboService.updateWeibo(wb);
		return "queryWeibo";
	}
	public String findWeiboById(){
		weiboService.findWeiboById(wb.getWeiboid());
		return SUCCESS;
	}
	

}
