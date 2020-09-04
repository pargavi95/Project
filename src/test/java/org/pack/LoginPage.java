package org.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@ng-model='FirstName']")
	private WebElement fname;

	@FindBy(xpath = "//input[@ng-model='LastName']")
	private WebElement lname;
	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	private WebElement address;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@ng-model='Phone']")
	private WebElement phone;
	@FindBy(xpath = "(//input[@ng-model='radiovalue'])[2]")
	private WebElement radio;

	@FindBy(id = "checkbox2")
	private WebElement hobbies;

	@FindBy(id = "msdd")
	private WebElement lang;
	@FindBy(xpath = "//li[@class='ng-scope'][16]")
	private WebElement lang1;

	@FindBy(id = "Skills")
	private WebElement skills;

	@FindBy(id = "countries")
	private WebElement country;

	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	private WebElement country1;
	@FindBy(xpath = "//li[@class='select2-results__option'][5]")
	private WebElement country2;

	@FindBy(id = "yearbox")
	private WebElement year;
	@FindBy(xpath = "//select[@ng-model='monthbox']")
	private WebElement month;
	@FindBy(id = "daybox")
	private WebElement date;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getLang() {
		return lang;
	}

	public WebElement getLang1() {
		return lang1;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCountry1() {
		return country1;
	}

	public WebElement getCountry2() {
		return country2;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getCpass() {
		return cpass;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id = "firstpassword")
	private WebElement pass;
	@FindBy(id = "secondpassword")
	private WebElement cpass;
	@FindBy(id = "submitbtn")
	private WebElement submit;

}
