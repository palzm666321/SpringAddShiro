package cn.mldn.mldnshiro.ssm.api.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Action implements Serializable{
	private String action;
	private String title;
	private String rid;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Action [action=" + action + ", title=" + title + ", rid=" + rid + "]";
	}
	
	
}
