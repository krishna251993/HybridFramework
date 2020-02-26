package mobiotics.sys.commonPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mobiotic.sys.PageObject.Notify;
import mobiotic.sys.PageObject.Reports;
import mobiotic.sys.PageObject.Sys_Providers;


public class HomePage extends Navigation_menu {
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//@FindBy(xpath="//p[text()='Dashboard ']")
	//private WebElement dashboardMenu;
	
	@FindBy(id="v-pills-home-tab")
	private WebElement dashboardMenu;
	
	@FindBy(id="nav-providers-tab")
	private WebElement providers;
	
	@FindBy(id="v-pills-messages-tab")
	private WebElement notify;
	
	//@FindBy(xpath ="//svg[text()='Reports']")
	//private WebElement reports;
	
	
	@FindBy(id="nav-provider-tab")
	private WebElement reports;
	
	@FindBy(xpath="//div[text()=User Guide] ")
	private WebElement userGuide;
	
	@FindBy(xpath="//div[text()='Terms and Conditions']")
	private WebElement termsConditions;
	
	@FindBy(xpath="//div[text()='Contact Support']")
	private WebElement contactSupport;
	
	
	
	//---------------This is Dash-Bord menu---------------------------------------
	public void nevigateToDashBoard_DashBoard() {
		dashboardMenu.click();
	}
	
	

	//---------------------This is for Provider menu-----------------------------------
	
	public Sys_Providers navigateToProvider() throws InterruptedException
	{
		Thread.sleep(5000);
		providers.click();
		return new Sys_Providers();
	}
	
	//---------------------This is for Notify_menu--------------------------------
	public Notify navigateToNotify() throws InterruptedException
	{
		Thread.sleep(3000);
		notify.click();
		return new Notify();
	}
	
	
	//---------------------This is for Reports_menu--------------------
	
	
	public Reports navigateToReports() throws InterruptedException
	{
		Thread.sleep(3000);
		reports.click();
		return new  Reports();
	}
	
	//--------------------------This is for UserGuide_menu-----------------------
	
	public void navigateToUserGuide()
	{
		userGuide.click();
	}
	
	//-------------This is for Terms and Condition Menu----------
	public void navigateToTermsAndCondition()
	{
		termsConditions.click();
	}
	
	//--------------------------This is for Contact Support Menu--------------------------
	public void navigateToContactSupport()
	{
		contactSupport.click();
	}	
	
}
