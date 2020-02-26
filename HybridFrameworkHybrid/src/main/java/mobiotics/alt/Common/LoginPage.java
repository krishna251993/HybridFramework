package mobiotics.alt.Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mobiotics.alt.Constant.*;



public class LoginPage extends BaseTest {

	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	@FindBy(id="showMenu")
	private WebElement ShowMenu;
	
	@FindBy(id="hamburger-signin-button")
	private WebElement SigninButton;
	
	@FindBy(id="journey-email-lookup")
	private WebElement LookUp;
	
	@FindBy(id="moble-email-lookup")
	private WebElement LookupContinueButton;
	
	@FindBy(id="input-password")
	private WebElement SubRegPassword;
	
	@FindBy(id="login-button")
	private WebElement SubRegLoginButton;
	
	
	//@FindBy(xpath="//button[text()='LOGIN']")
	//private WebElement ;
	
	public void setLookupUserName(String UserName)
	{
		LookUp.sendKeys(un);
	}
	
	public void setSubRegPassword(String pw)
	{
		SubRegPassword.sendKeys(pw);
	}
	
	
	/*public void setpassphrase(String PassPhrase)
	{
		passPhrase.sendKeys(PassPhrase);	
	}*/
	
	public void clickToshowmenu() 
	{
		ShowMenu.click();
	}
	
	public void clickTosigninButton()
	{
		SigninButton.click();
	}
	
	public void clickTosubRegLoginButton()
	{
		SubRegLoginButton.click();
	}
	
	public void clickToLookupContinueBtn()
	{
		LookupContinueButton.click();
	}
	
	
	public void login(String un,String pw,String PP)
	{
		clickToshowmenu();
		clickTosigninButton();
		
		setLookupUserName(un);
		clickToLookupContinueBtn();
		
		setSubRegPassword(pw);
		//setpassphrase(PP);
		
		
		clickTosubRegLoginButton();
	}
}
