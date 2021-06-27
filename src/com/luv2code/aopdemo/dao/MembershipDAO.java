package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass()+ ": inside method 'addAccount'");
	}
	public void updateAccount() {
		System.out.println(getClass()+ ": inside method 'updateAccount'");
	}
	public String updateStringAccount() {
		System.out.println(getClass()+ ": inside method 'StringupdateAccount'");
		return "update";
	}
	public void goToWork() {
		System.out.println(getClass()+ ": inside method 'goToWork'\n");
	}
}
