package com.clearcode.po;

import org.openqa.selenium.By;

public class HomePage {
	//public static By username_ip = By.id("authUse");
	//public static By pwd_ip = By.id("clearPass");
	//public static By login_btn = By.className("fa-sign-in");
	
	//public static By signup_link = By.linkText("Sign up!");
	//public static By student_rbutton =By.id("qf_876575");
	
	//public static By login_btn = By.partialLinkText("Login");
	

	public static  By username = By.id("input-username");
	public static By password = By.id("input-password");
	public static By loginbutt = By.className("btn-primary");
	public static By category = By.xpath("//*[@id=\"menu-catalog\"]/a/i");
	public static By product = By.xpath("//*[@id=\"menu-catalog\"]/ul/li[2]/a");
	
	
		
}
