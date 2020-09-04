package org.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver driver;

	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\parup\\\\eclipse-workspace\\\\Apachepoi\\\\div1\\\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void navigate(String url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void navigateforward() {
		driver.navigate().forward();
	}

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	public static String title() {
		String title = driver.getTitle();
		return title;
	}

	public static void type(WebElement e, String value) {

		e.sendKeys(value);

	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static String getText(WebElement e) {
		String name = e.getText();
		return name;

	}

	public static String getAttribute(WebElement e) {
		String name = e.getAttribute("value");
		return name;

	}

	public static void dropDownValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void dropDown(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}

	public static void Thread(int value) throws InterruptedException {
		Thread.sleep(value);
	}

	public static void scrollDown(String value) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript(value);
	}

	public static void scrollDownvalue(String value, WebElement e) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript(value, e);
	}

	public static void scrollUpValue(String value, WebElement e) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript(value, e);
	}

	public static void actions(WebElement e) {
		Actions ac = new Actions(driver);
		ac.moveToElement(e).perform();
	}

	public static void actions1(WebElement e) {
		Actions ac = new Actions(driver);
		ac.contextClick(e).perform();

	}

	public void action2(WebElement e) {
		Actions ac = new Actions(driver);
		ac.doubleClick(e).perform();

	}

	private void actions3(WebElement e, WebElement des) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(e, des).perform();

	}

	public static String getdata(int rowNo, int cellNo) throws IOException {
		String data = null;

		File excelLocation = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\excel\\Book4.xlsx");

		FileInputStream f = new FileInputStream(excelLocation);
		Workbook w = new XSSFWorkbook(f);

		Sheet sheet = w.getSheet("Sheet3");
		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		if (cell.getCellType().name().equals("STRING")) {
			data = cell.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
			data = sim.format(date);

		}

		else {

			data = String.valueOf((long) cell.getNumericCellValue());

		}
		return data;

	}

}
