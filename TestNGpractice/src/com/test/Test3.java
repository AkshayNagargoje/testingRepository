package com.test;

import org.testng.annotations.Test;

public class Test3 {
	// DEPENDENCE ON METHOD ,GROUP AND PRIORITY

	     // group name is LOG2 
		@Test(priority = 1, groups = "log2") // 1st execute 
		public void login1() {
			System.out.println("login22");
		}

		@Test(priority = 2, groups = "log2") // 2nd execute 
		public void checkTitle() {
			System.out.println("Title checked ");

		}
	   // this method is depend upon the LOG2 group 
		

		@Test(groups = "log2",dependsOnMethods = "logged" ,priority = 3 ) // 5th execute since depends on method is used .
		public void logout() {
			
			System.out.println("logout");
		}
		
	  // this method depends upon the Logged() method.
		@Test(groups = "log2", priority = 3)   // 3rd execute 
		public void logged() {
			System.out.println("logged");
		}
	  
		@Test(groups = "log2" ,dependsOnMethods = "logged") // 4 th eexecute 
		public void dashboard() {
			System.out.println("dashboard");
		}

}
