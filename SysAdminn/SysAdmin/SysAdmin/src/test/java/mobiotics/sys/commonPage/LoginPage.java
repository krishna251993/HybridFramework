package mobiotics.sys.commonPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mobiotics.sys.constant.BaseTest;



public class LoginPage extends BaseTest {

	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="sysadminid")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="passphrase")
	private WebElement passPhrase;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	private WebElement btnLogin;
	
	public void setUserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	
	public void setPassword(String pw)
	{
		txtPassword.sendKeys(pw);
	}
	
	public void setpassphrase(String PassPhrase)
	{
		passPhrase.sendKeys(PassPhrase);	
	}
	
	public void clickToProceed() {
		btnLogin.click();
	}
	
	public void login(String un,String pw,String PP)
	{
		setUserName(un);
		setPassword(pw);
		setpassphrase(PP);
		clickToProceed();
	}
}
