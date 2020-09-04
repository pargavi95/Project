package org.pack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo extends Base{
	@BeforeClass
	public static void tc11() throws InterruptedException {

		WebDriver d = browserLaunch();

	}

	@Test
	public void tc1() throws InterruptedException, IOException {
		Thread(3000);
		navigate("http://demo.automationtesting.in/Register.html");
		Assert.assertEquals("http://demo.automationtesting.in/Register.html", driver.getCurrentUrl());
		String t = title();
		System.out.println(t);
		Assert.assertEquals(t, driver.getTitle());
		Thread(3000);
		LoginPage login = new LoginPage();

		type(login.getFname(), "pargavi");
		Assert.assertEquals("pargavi", getAttribute(login.getFname()));
		type(login.getLname(), "sri");
		Assert.assertEquals("sri", getAttribute(login.getLname()));
		type(login.getAddress(), "chennai,tamilnadu");
		Assert.assertEquals("chennai,tamilnadu", getAttribute(login.getAddress()));
		type(login.getEmail(), "parupargavim@gmail.com");
		Assert.assertEquals("parupargavim@gmail.com", getAttribute(login.getEmail()));
		type(login.getPhone(), "6374309331");
		Assert.assertEquals("6374309331", getAttribute(login.getPhone()));
		btnClick(login.getRadio());
		btnClick(login.getHobbies());
		scrollDown("window.scrollTo(0,500)");
		btnClick(login.getLang());
		btnClick(login.getLang1());
		dropDown(login.getSkills(), "C");
		Assert.assertEquals("C", getAttribute(login.getSkills()));
		dropDown(login.getCountry(), "India");
		Assert.assertEquals("India", getAttribute(login.getCountry()));
		btnClick(login.getCountry1());
		btnClick(login.getCountry2());
		dropDown(login.getYear(), "2000");
		Thread(3000);
		Assert.assertEquals("2000", getAttribute(login.getYear()));
		dropDown(login.getMonth(), "July");
		Assert.assertEquals("July", getAttribute(login.getMonth()));
		dropDown(login.getDate(), "4");
		Assert.assertEquals("4", getAttribute(login.getDate()));
		type(login.getPass(), "12345");
		Thread(3000);
		Assert.assertEquals("12345", getAttribute(login.getPass()));
		type(login.getCpass(), "12345");
		Assert.assertEquals("12345", getAttribute(login.getCpass()));
		btnClick(login.getSubmit());
		Thread(3000);
	}
}
