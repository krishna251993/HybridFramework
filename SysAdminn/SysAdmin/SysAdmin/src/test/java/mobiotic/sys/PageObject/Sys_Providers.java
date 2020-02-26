package mobiotic.sys.PageObject;

import java.awt.Robot;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import com.mongodb.diagnostics.logging.Logger;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

import mobiotics.sys.commonPage.BasePage;
import mobiotics.sys.constant.BaseTest;
import mobiotics.sys.utilities.DemoExcelLibrary3;

public class  Sys_Providers extends BasePage{
	
	private String path = "./ExcelPages/TestData.xlsx";
	
	public Sys_Providers()
	{
		PageFactory.initElements(driver, this);
	}
	
	//static final Logger logger = Logger.getLogger(Sys_Providers.class);
	
	@FindBy(id="create_new")
	private WebElement AddNew;
	
	@FindBy(xpath = "//span[contains(text(), 'CREATE A PROVIDER')]")
	private WebElement createProviderTitle;
	
	@FindBy(id="imgUpload")
	private WebElement Logo_Edit;
	
	@FindBy(xpath="(//input[@type='text'][@name='providername'])[2]")
	private WebElement providerNameE;
	
	@FindBy(xpath="(//input[@type='text'][@name='providername'])[1]")
	private WebElement providerNameA;
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="adminemail")
	private WebElement adminmail;
	
	@FindBy(name="description")
	private WebElement description;
	
	@FindBy(id="UserName")
	private WebElement userNameE;
	
	@FindBy(id="AdminEmail")
	private WebElement adminmailE;
	
	@FindBy(id="Description")
	private WebElement descriptionE;
	
	@FindBy(xpath="//button[contains(text(), 'CREATE')]")
	private WebElement createButton;
	
	@FindBy(id="disableButton")
	private WebElement createButtonE;
	
	@FindBy(xpath="//button[contains(text(), 'CANCEL')]")
	private WebElement cancelButton;
	
	@FindBy(xpath="//div[@class='tablefullbody']/div/table//tr/th[3]//img[@class='filter_click']")
	private WebElement searchProvider;
	
	@FindBy(xpath="//div[@class='tablefullbody']/div/table//tr/th[4]//img[@class='filter_click']")
	private WebElement searchName;
	
	@FindBy(xpath="//div[@class='tablefullbody']/div/table//tr/th[5]//img[@class='filter_click']")
	private WebElement searchUserName;
	
	@FindBy(id="providerid")
	private WebElement providerText;
	
	@FindBy(id="providername")
	private WebElement nameText;
	
	@FindBy(id="username")
	private WebElement Text;
	
	@FindBy(xpath = "//img[@class='admin_edit_action_icon']")        //Need to check
	private WebElement Edit;
	
	@FindBy(xpath = "//span[contains(text(), 'EDIT PROVIDER')]")
	private WebElement EditProviderTitle;
	
	@FindBy(xpath="//img[@class= 'logo_icon']")
	private WebElement Logo_IconE;
	
	
	public void AddProvider() throws InterruptedException, IOException {
		
		waitTillElementIsVisible(AddNew);
		Thread.sleep(3000);
		AddNew.click();
		//logger.info("I have clicked on Add New Button");
		//waitTillElementIsVisible(Logo_Edit);
		Thread.sleep(3000);
		Logo_Edit.sendKeys("D:\\chrome.png");
		/*Thread.sleep(3000);
		//String editIcon=DemoExcelLibrary3.getexcelData("Provider", 1, 0, path);
		//driver.switchTo().window(editIcon);
		String parentWindow = driver.getWindowHandle();
		java.util.Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		         //<!--Perform your operation here for new window-->
		         driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
		driver.getWindowHandle();
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//div[@class= 'logo_edit']"))
		Thread.sleep(3000);*/
		//Runtime.getRuntime().exec("D:\\chrome.png");
        Thread.sleep(3000);
        waitTillElementIsClickable(providerNameA);
		String Pname=DemoExcelLibrary3.getexcelData("Provider", 1, 1, path);
		providerNameA.sendKeys(Pname);
		String Uname=DemoExcelLibrary3.getexcelData("Provider", 1, 2, path);
		userName.sendKeys(Uname);
		String Amail=DemoExcelLibrary3.getexcelData("Provider", 1, 3, path);
		adminmail.sendKeys(Amail);
		String desc=DemoExcelLibrary3.getexcelData("Provider", 1, 4, path);
		description.sendKeys(desc);
		createButton.click();
		
		
		
	}
		
		public void searchName() throws InterruptedException {
			Thread.sleep(3000);
			waitTillElementIsVisible(searchName);
			searchName.click();
			String searchname=DemoExcelLibrary3.getexcelData("Search", 1, 0, path);
			nameText.sendKeys(searchname);
			Thread.sleep(5000);
			nameText.clear();
			Thread.sleep(5000);
			waitTillElementIsVisible(searchProvider);
			searchProvider.click();
			String searchProvider=DemoExcelLibrary3.getexcelData("Search", 1, 1, path);
			providerText.sendKeys(searchProvider);
			Thread.sleep(5000);
			providerText.clear();
			Thread.sleep(5000);
			waitTillElementIsVisible(searchUserName);
			searchUserName.click();
			String searchusername=DemoExcelLibrary3.getexcelData("Search", 1, 2, path);
			Text.sendKeys(searchusername);
			Thread.sleep(5000);
			Text.clear();
			
		}
		
		public void EditProvider() throws InterruptedException {
			Thread.sleep(3000);
			waitTillElementIsClickable(Edit);
			
			try {
				List<WebElement> links = driver.findElements(By.xpath("//img[@class='admin_edit_action_icon']"));

				Iterator<WebElement> iter = links.iterator();

				while(iter.hasNext()) {
				    WebElement we = iter.next();
					WebElement we2=iter.next();
				    we2.click();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Exception due to the "+e);
			}
			//Edit.click();
			//waitTillElementIsVisible(EditProviderTitle);
			//EditProviderTitle.getText();
			//waitTillElementIsClickable(Logo_Edit);
			//Logo_Edit.click();
			Thread.sleep(3000);
			//String editIcon=DemoExcelLibrary3.getexcelData("Provider", 1, 0, path);
			//Logo_Edit.sendKeys(editIcon);
			Thread.sleep(3000);
			
			waitTillElementIsVisible(providerNameE);
			providerNameE.clear();
			Thread.sleep(3000);
			String Pname=DemoExcelLibrary3.getexcelData("Provider", 1, 1, path);
			providerNameE.sendKeys(Pname);
			Thread.sleep(3000);
			waitTillElementIsVisible(userNameE);
			userNameE.clear();
			String Uname=DemoExcelLibrary3.getexcelData("Provider", 1, 2, path);
			userNameE.sendKeys(Uname);
			Thread.sleep(3000);
			waitTillElementIsVisible(adminmailE);
			adminmailE.clear();
			String Amail=DemoExcelLibrary3.getexcelData("Provider", 1, 3, path);
			adminmailE.sendKeys(Amail);
			Thread.sleep(3000);
			waitTillElementIsVisible(descriptionE);
			descriptionE.clear();
			String desc=DemoExcelLibrary3.getexcelData("Provider", 1, 4, path);
			descriptionE.sendKeys(desc);
			Thread.sleep(3000);
			createButtonE.click();
			
			
	
		
	
		
	}
}
	
