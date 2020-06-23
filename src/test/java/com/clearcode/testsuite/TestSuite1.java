package com.clearcode.testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;

import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{


public void loginAdmin(String pname, String mtitle, String model, String price, String category)
{
	wdu.type(HomePage.username, "admin");
	wdu.type(HomePage.password, "admin@123");
	wdu.click(HomePage.loginbutt);
	wdu.mouseOver(HomePage.category);
	wdu.click(HomePage.product);
	wdu.click(AddProductPage.addbutton);
	wdu.type(AddProductPage.productname,pname);
	wdu.type(AddProductPage.mtitle, mtitle);
	wdu.click(AddProductPage.data);
	wdu.type(AddProductPage.model, model);
	wdu.type(AddProductPage.price, price);
	wdu.click(AddProductPage.links);
	wdu.type(AddProductPage.category, category);
	wdu.click(AddProductPage.save);
	
	wdu.getTextNode(AddProductPage.msg, "Success: You have modified products!");
