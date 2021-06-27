package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	String name;
	String theServiceCode;
	
	public void addAccount() {
		System.out.println(getClass()+"Add an account to db");
	}
	public void addAccount(Account account,boolean isRight) {
		System.out.println(getClass()+"Add an account"+account+"to db"+". it is "+isRight);
	}
	public void updateAccount() {
		System.out.println(getClass()+ ": inside method 'updateAccount'");
	}
	public void goToSleep() {
		System.out.println(getClass()+ ": inside method 'goToSleep'\n");
	}
	public String getName() {
		System.out.println(name + ": inside method 'getName'");
		return name;
	}
	public void setName(String name) {
		System.out.println(getClass()+ ": inside method 'setName'");
		this.name = name;
	}
	public String getTheServiceCode() {
		System.out.println(theServiceCode + ": inside method 'getTheServiceCode'");
		return theServiceCode;
	}
	public void setTheServiceCode(String theServiceCode) {
		System.out.println(getClass()+ ": inside method 'setTheServiceCode'");
		this.theServiceCode = theServiceCode;
	}
	
}
