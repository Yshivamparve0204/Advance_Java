package com.demo.model;

public class Category {
	private int cid;
	private String cname;
	private String desc;
	
	public Category() {
		super();
	}

	public Category(int cid, String cname, String desc) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.desc = desc;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", desc=" + desc + "]";
	}
	
	
		
		
}
