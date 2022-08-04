package com.test;

import org.testng.annotations.Test;

public class Test1 {

	@Test (groups = "log")
	public void login() {
		System.out.println("login");
	}
	@Test (groups = "log")
	public void logout() {
		System.out.println("logout");
		
	}
	@Test (dependsOnMethods = "dashboard")
	public void dash1() {
		System.out.println("dash1");
	}
	@Test (dependsOnGroups =  "log")
	public void dashboard() {
		System.out.println("dashboard");
		
	}
	
}
