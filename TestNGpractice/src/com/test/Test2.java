package com.test;

import org.testng.annotations.Test;

// DEPENDENCE ON METHOD AND PRIORITY 

public class Test2 {
     // group name is LOG1 
	@Test(priority = 1, groups = "log1")
	public void login1() {
		System.out.println("login22");
	}

	@Test(priority = 2, groups = "log1")
	public void checkTitle() {
		System.out.println("Title checked ");

	}
   // this method is depend upon the LOG1 group 
	@Test(priority = 1, dependsOnGroups = "log1")
	public void logged() {
		System.out.println("logged");
	}

	@Test(priority = 2)
	public void logout() {
		System.out.println("logout");
	}
   // this method depends upon the Logged() method.
	@Test(dependsOnMethods = "logged")
	public void dashboard() {
		System.out.println("dashboard");
	}

}
