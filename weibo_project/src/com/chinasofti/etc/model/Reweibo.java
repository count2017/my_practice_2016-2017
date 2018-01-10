package com.chinasofti.etc.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Reweibo implements Serializable{
	private String reweiboid;
	private String message;//ÆÀÂÛÄÚÈÝ
	private Timestamp addtime;
	private User user;
	private Weibo weibo;
	public Reweibo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Reweibo(String reweiboid, String message, Timestamp addtime, User user, Weibo weibo) {
		super();
		this.reweiboid = reweiboid;
		this.message = message;
		this.addtime = addtime;
		this.user = user;
		this.weibo = weibo;
	}


	public Reweibo(String reweiboid, String message, Timestamp addtime) {
		super();
		this.reweiboid = reweiboid;
		this.message = message;
		this.addtime = addtime;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getReweiboid() {
		return reweiboid;
	}
	public void setReweiboid(String reweiboid) {
		this.reweiboid = reweiboid;
	}
	
	

	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Weibo getWeibo() {
		return weibo;
	}
	public void setWeibo(Weibo weibo) {
		this.weibo = weibo;
	}


	@Override
	public String toString() {
		return "Reweibo [reweiboid=" + reweiboid + ", message=" + message + ", addtime=" + addtime + "]";
	}

	
	
	

}
