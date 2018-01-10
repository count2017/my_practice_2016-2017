package com.chinasofti.etc.model;

import java.io.Serializable;
//weiboid,userid,weiboname,message,addtime,clickNum
import java.sql.Timestamp;
import java.util.Set;
public class Weibo implements Serializable{
	private String weiboid;
	private User user;
	private String weiboname;
	private String message;
	private Timestamp addtime;
	private int clickNum;
	private Set<Reweibo> reweiboSet;
	public Weibo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Weibo(String weiboid, User user, String weiboname, String message, Timestamp addtime, int clickNum) {
		super();
		this.weiboid = weiboid;
		this.user = user;
		this.weiboname = weiboname;
		this.message = message;
		this.addtime = addtime;
		this.clickNum = clickNum;
	}
	public Weibo(String weiboid, String weiboname, String message, Timestamp addtime, int clickNum,
			Set<Reweibo> reweiboSet) {
		super();
		this.weiboid = weiboid;
		this.weiboname = weiboname;
		this.message = message;
		this.addtime = addtime;
		this.clickNum = clickNum;
		this.reweiboSet = reweiboSet;
	}
	public Weibo(String weiboid, User user, String weiboname, String message, Timestamp addtime, int clickNum,
			Set<Reweibo> reweiboSet) {
		super();
		this.weiboid = weiboid;
		this.user = user;
		this.weiboname = weiboname;
		this.message = message;
		this.addtime = addtime;
		this.clickNum = clickNum;
		this.reweiboSet = reweiboSet;
	}
	public String getWeiboid() {
		return weiboid;
	}
	public void setWeiboid(String weiboid) {
		this.weiboid = weiboid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getWeiboname() {
		return weiboname;
	}
	public void setWeiboname(String weiboname) {
		this.weiboname = weiboname;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public int getClickNum() {
		return clickNum;
	}
	public void setClickNum(int clickNum) {
		this.clickNum = clickNum;
	}
	public Set<Reweibo> getReweiboSet() {
		return reweiboSet;
	}
	public void setReweiboSet(Set<Reweibo> reweiboSet) {
		this.reweiboSet = reweiboSet;
	}
	@Override
	public String toString() {
		return "Weibo [weiboid=" + weiboid + ", user=" + user + ", weiboname=" + weiboname + ", message=" + message
				+ ", addtime=" + addtime + ", clickNum=" + clickNum + "]";
	}
	

}
