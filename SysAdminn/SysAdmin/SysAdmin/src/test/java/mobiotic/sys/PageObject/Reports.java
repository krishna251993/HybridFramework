package mobiotic.sys.PageObject;

import java.text.DateFormat;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import generic.DateHelper;
import generic.DateHelper2;
import mobiotics.sys.commonPage.BasePage;
import mobiotics.sys.utilities.DemoExcelLibrary3;

public class Reports extends BasePage{
	
	private String path = "./ExcelPages/TestData.xlsx";
	
	private String dateXp1 = "(//a[@class='ui-state-default'])[";
	private String dateXp2 = "]";

		DateHelper2 dh = new DateHelper2();
		int date=5;
		int date1=15;

	public Reports()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="sms_reports_select")
	private WebElement dropDown;
	
	@FindBy(id="report_download")
	private WebElement  ReportDownload;
	
	@FindBy(id="fromdate")
	private WebElement fromDatecal;
	
	@FindBy(id="todate")
	private WebElement toDatecal;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement DfromDateMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement DfromDateYear;
	
	@FindBy(xpath="//span[text()='Prev']")
	private WebElement previousMonthFromCal;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextMonthFromCal;
	
	@FindBy(xpath="//a[text()='5']")
	private WebElement ForFive;
	
	@FindBy(id="report_download_modal_yes")
	private WebElement downloadButton;

	@FindBy(xpath="//div[@class='tablefullbody']/div/table//tr/th[3]//img[@class='filter_click']")
	private WebElement searchProvider;
	
	@FindBy(xpath="//div[@class='tablefullbody']/div/table//tr/th[4]//img[@class='filter_click']")
	private WebElement searchName;
	
	@FindBy(xpath="//div[@class='tablefullbody']/div/table//tr/th[5]//img[@class='filter_click']")
	private WebElement searchUserName;
	
	@FindBy(xpath="//div[@class='tablefullbody']/div/table//tr/th[6]//img[@class='filter_click']")
	private WebElement searchProviderKey;

	@FindBy(xpath="//div[@class='tablefullbody']/div/table//tr/th[7]//img[@class='filter_click']")
	private WebElement status;
	
	@FindBy(id="providerid")
	private WebElement providerText;
	
	@FindBy(id="providername")
	private WebElement nameText;
	
	@FindBy(id="username")
	private WebElement userText;
	
	@FindBy(id="providerkey")
	private WebElement providerKey;
	
	@FindBy(id="created")
	private WebElement createdDate;
	
	@FindBy(id="report_download_modal_yes")
	private WebElement downloadbt;
	
	@FindBy(xpath="//div[@class='dropdown']")
	private WebElement dropdownL;
	
	@FindBy(xpath="//a[@class='Logout sysadminlogout']")
	private WebElement Logout;
	
	
	public void selectFromDate()
	{
		fromDatecal.click();
		String frDate = DemoExcelLibrary3.getexcelData("Reports", 1, 2, path);
		System.out.println(frDate);
		String fromDateArr[] = frDate.split("_");
		previousMonthFromCal.click();
		//waitTillElementIsVisible(nextMonthFromCal);
		dh.selectMonth(previousMonthFromCal, nextMonthFromCal, "May", Integer.parseInt(fromDateArr[1]));
		//dh.selectDate(date);
		dh.selectDate(dateXp1, dateXp2, Integer.parseInt(fromDateArr[2]));
		downloadbt.click();
		
	}
	
	public void selectFromDate(String fromDate) {
		System.out.println(fromDate);
		String fromDateArr[] = fromDate.split("-");
		fromDatecal.click();
		waitTillElementIsVisible(nextMonthFromCal);
		dh.selectMonth(previousMonthFromCal, nextMonthFromCal, DfromDateMonth.getText(), Integer.parseInt(fromDateArr[1]));
		dh.selectDate(dateXp1, dateXp2, Integer.parseInt(fromDateArr[2]));
		//downloadbt.click();

		}
	
	

	
	public void datePicker() throws InterruptedException {
		//Log.info("Clicking on From daterange dropdown");
		JavascriptExecutor executor8 = (JavascriptExecutor)driver;
		//Thread.sleep(3000);
		executor8.executeScript("document.getElementById('fromdate').style.display='block';");
		//Select select8 = new Select(driver.findElement(By.id("fromdate")));
		//select8.selectByVisibleText("10 Nov 2019");
		fromDatecal.sendKeys("2019-11-01");
		Thread.sleep(3000);

		//Log.info("Clicking on To daterange dropdown");
		JavascriptExecutor executor10 = (JavascriptExecutor)driver;
		//Thread.sleep(3000);
		executor10.executeScript("document.getElementById('todate').style.display='block';");
		//Select select10 = new Select(driver.findElement(By.id("todate")));
		//select10.selectByVisibleText("15 Nov 2019");
		toDatecal.sendKeys("2019-11-15");
		Thread.sleep(3000);
	}
	
	public void dat() {
		
		int date=5;
		String con= dateXp1+date+dateXp2;
		System.out.println(con);
	
	}
	
	public void ProviderReport() throws InterruptedException {
		
		Thread.sleep(3000);
		dropDown.click();
		org.openqa.selenium.support.ui.Select ssel=new org.openqa.selenium.support.ui.Select(dropDown);
		ssel.selectByVisibleText("Providers");
		Thread.sleep(3000);
		ReportDownload.click();
		fromDatecal.click();
		org.openqa.selenium.support.ui.Select ssel1=new org.openqa.selenium.support.ui.Select(DfromDateMonth);
		ssel1.selectByIndex(0);
		Thread.sleep(3000);
		org.openqa.selenium.support.ui.Select ssel2=new org.openqa.selenium.support.ui.Select(DfromDateYear);
		ssel2.selectByVisibleText("2015");
		Thread.sleep(3000);
		//String con= "//a[text()='+date+']";
		//WebElement element = driver.findElement(By.xpath(con.toString()));
		//element.click();
		//System.out.println(con);
		//dh.selectDate(dateXp1, dateXp2, 5);
		//ForFive.click();
		driver.findElement(By.xpath(dateXp1+date+dateXp2)).click();
		
		toDatecal.click();
		org.openqa.selenium.support.ui.Select ssel3=new org.openqa.selenium.support.ui.Select(DfromDateMonth);
		ssel3.selectByIndex(1);
		Thread.sleep(3000);
		org.openqa.selenium.support.ui.Select ssel4=new org.openqa.selenium.support.ui.Select(DfromDateYear);
		ssel4.selectByVisibleText("2015");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dateXp1+date+dateXp2)).click();
		//String con1= "(//a[@class='ui-state-default'])["+date1+"]";
		//System.out.println(con1);
		//ForFive.click();
		Thread.sleep(3000);
		downloadbt.click();
		
	}
	
	public void DevicesReport() throws InterruptedException {
		Thread.sleep(3000);
		dropDown.click();
		org.openqa.selenium.support.ui.Select ssel=new org.openqa.selenium.support.ui.Select(dropDown);
		ssel.selectByVisibleText("Devices");
		Thread.sleep(3000);
		ReportDownload.click();
		fromDatecal.click();
		org.openqa.selenium.support.ui.Select ssel1=new org.openqa.selenium.support.ui.Select(DfromDateMonth);
		ssel1.selectByIndex(0);
		Thread.sleep(3000);
		org.openqa.selenium.support.ui.Select ssel2=new org.openqa.selenium.support.ui.Select(DfromDateYear);
		ssel2.selectByVisibleText("2015");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dateXp1+date+dateXp2)).click();
		//ForFive.click();
		
		toDatecal.click();
		org.openqa.selenium.support.ui.Select ssel3=new org.openqa.selenium.support.ui.Select(DfromDateMonth);
		ssel3.selectByIndex(1);
		Thread.sleep(3000);
		org.openqa.selenium.support.ui.Select ssel4=new org.openqa.selenium.support.ui.Select(DfromDateYear);
		ssel4.selectByVisibleText("2015");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dateXp1+date+dateXp2)).click();
		//ForFive.click();
		Thread.sleep(3000);
		downloadbt.click();
	}
	
	public void AppsReport() throws InterruptedException {
		Thread.sleep(3000);
		dropDown.click();
		org.openqa.selenium.support.ui.Select ssel=new org.openqa.selenium.support.ui.Select(dropDown);
		ssel.selectByVisibleText("Apps");
		Thread.sleep(3000);
		ReportDownload.click();
		fromDatecal.click();
		org.openqa.selenium.support.ui.Select ssel1=new org.openqa.selenium.support.ui.Select(DfromDateMonth);
		ssel1.selectByIndex(1);
		Thread.sleep(3000);
		org.openqa.selenium.support.ui.Select ssel2=new org.openqa.selenium.support.ui.Select(DfromDateYear);
		ssel2.selectByVisibleText("2015");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dateXp1+date+dateXp2)).click();
		//ForFive.click();
		
		toDatecal.click();
		org.openqa.selenium.support.ui.Select ssel3=new org.openqa.selenium.support.ui.Select(DfromDateMonth);
		ssel3.selectByIndex(1);
		Thread.sleep(3000);
		org.openqa.selenium.support.ui.Select ssel4=new org.openqa.selenium.support.ui.Select(DfromDateYear);
		ssel4.selectByVisibleText("2015");
		Thread.sleep(3000);
		driver.findElement(By.xpath(dateXp1+date+dateXp2)).click();
		//ForFive.click();
		Thread.sleep(3000);
		downloadbt.click();
}
	public void logout() throws InterruptedException{
		//waitTillElementIsClickable(dropdownL);
		dropdownL.click();
		Thread.sleep(3000);
		//org.openqa.selenium.support.ui.Select ssel=new org.openqa.selenium.support.ui.Select(dropdownL);
		//ssel.selectByVisibleText("Logout");
		//Thread.sleep(3000);
		Logout.click();
		driver.close();
	}
}



