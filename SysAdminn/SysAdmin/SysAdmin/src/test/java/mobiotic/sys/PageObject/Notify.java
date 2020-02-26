package mobiotic.sys.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mobiotics.sys.commonPage.BasePage;
import mobiotics.sys.utilities.DemoExcelLibrary3;

public class Notify extends BasePage {
	
	private String path = "./ExcelPages/TestData.xlsx";
	
	public Notify()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="provider_list_id")
	private  WebElement list;
	
	@FindBy(id="notifytitle")
	private WebElement notifyTitle;
	
	@FindBy(id="notifymessage")
	private WebElement notifyMessage;
	
	@FindBy(xpath="//button[@class='btn upload_picture']")
	private WebElement uploadPicture;
	
	@FindBy(id="notifybutton")
    private  WebElement sendBt;
	
	@FindBy(id="notifycancel")
	private  WebElement cancelBt;
	
	
	public void selectProviders() throws InterruptedException {
		Thread.sleep(3000);
		list.click();
		org.openqa.selenium.support.ui.Select ssel=new org.openqa.selenium.support.ui.Select(list);
		ssel.selectByIndex(2);
		String title=DemoExcelLibrary3.getexcelData("Notify", 1, 0, path);
		notifyTitle.sendKeys(title);
		//notifyTitle.sendKeys("Test");
		String message=DemoExcelLibrary3.getexcelData("Notify", 1, 1, path);
		notifyMessage.sendKeys(message);
		//notifyMessage.sendKeys("Testing");
		sendBt.click();
}
}
