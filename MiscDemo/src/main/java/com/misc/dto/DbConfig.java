package com.misc.dto;

public class DbConfig {
	
	private String url;
	private String name;
	public DbConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DbConfig(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DbConfig [url=" + url + ", name=" + name + "]";
	}
	
	
	

}
