package com.rest.webservices.restfulwebservices;

public class HelloWorldBean {
	private String message;
	public HelloWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "HellowWorldBean [message=" + message + "]";
	}
	public String getMessage() {
		return message;
	}
	
}
