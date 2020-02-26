package mobiotic.sys.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mobiotics.sys.commonPage.BasePage;

public class Sys_ProviderEdit extends BasePage {
	
	public Sys_ProviderEdit()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='admin_edit_action_icon']")
	private WebElement Edit;
	
	@FindBy(xpath = "//span[contains(text(), 'EDIT PROVIDER')]")
	private WebElement createProviderTitle;
	
	@FindBy(xpath="//img[@class= 'logo_icon']")
	private WebElement Logo_IconE;
	
	@FindBy(name="providername")
	private WebElement providerName;
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(name="adminemail")
	private WebElement adminmail;
	
	@FindBy(name="description")
	private WebElement description;
	
	@FindBy(xpath="//button[contains(text(), 'CREATE')]")
	private WebElement createButton;
	
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
}
	




