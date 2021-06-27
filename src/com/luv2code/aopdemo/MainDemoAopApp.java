package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoAopApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoAOPConfig.class);
	
		//get the bean from spring container
		AccountDAO theDao = context.getBean("accountDAO",AccountDAO.class);
		//get the membership bean from spring container
		MembershipDAO theMembershipDao = context.getBean("membershipDAO",MembershipDAO.class);
		
		// call the getter and setter methods
		theDao.setName("Kózka");
		theDao.setTheServiceCode("DevCode");
		
		theDao.getName();
		theDao.getTheServiceCode();
		
		//call the bussiness method
		theDao.goToSleep();
		theMembershipDao.goToWork();
		
		//close the context
		context.close();
}
}
