package com.chinasofti.etc.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;
/*
 * 一个人可以发多个微博，也可以发表多个评论
 */
public class User implements Serializable{
	private String userid;
	private String username;
	private String password;
	private String nickname;
	private Timestamp regTime;
	private int sex;
	private Timestamp lastLoginTime;
	private Set<Weibo> weiboSet;
	private Set<Reweibo> reweiboSet;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userid, String username, String password, String nickname, Timestamp regTime, int sex,
			Timestamp lastLoginTime) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.regTime = regTime;
		this.sex = sex;
		this.lastLoginTime = lastLoginTime;
	}
	public User(String userid, String username, String password, String nickname, Timestamp regTime, int sex,
			Timestamp lastLoginTime, Set<Weibo> weiboSet, Set<Reweibo> reweiboSet) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.regTime = regTime;
		this.sex = sex;
		this.lastLoginTime = lastLoginTime;
		this.weiboSet = weiboSet;
		this.reweiboSet = reweiboSet;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Timestamp getRegTime() {
		return regTime;
	}
	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Set<Weibo> getWeiboSet() {
		return weiboSet;
	}
	public void setWeiboSet(Set<Weibo> weiboSet) {
		this.weiboSet = weiboSet;
	}
	public Set<Reweibo> getReweiboSet() {
		return reweiboSet;
	}
	public void setReweiboSet(Set<Reweibo> reweiboSet) {
		this.reweiboSet = reweiboSet;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", regTime=" + regTime + ", sex=" + sex + ", lastLoginTime=" + lastLoginTime + "]";
	}
	
	
	

}
