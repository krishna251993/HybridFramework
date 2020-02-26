package mobiotics.alt.Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mobiotics.alt.PageObject.*;




public class HomePage extends Navigation_menu {
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="showMenu")
	private WebElement Menu;
	
	@FindBy(linkText ="https://altbalajifire.firebaseapp.com/shows")
	private WebElement Show;
	
	@FindBy(linkText="https://altbalajifire.firebaseapp.com/movies")
	private WebElement Movies;
	
	
	@FindBy(linkText="https://altbalajifire.firebaseapp.com/comedy")
	private WebElement Comedy;
	
	@FindBy(linkText="https://altbalajifire.firebaseapp.com/subscribe?progress=plan")
	private WebElement RegSub;
	
	@FindBy(linkText="//div[text()='Terms and Conditions']")
	private WebElement Subcription;
	
	@FindBy(linkText="https://altbalajifire.firebaseapp.com/notifications")
	private WebElement Notification;
	
	@FindBy(linkText="https://altbalajifire.firebaseapp.com/favourites")
	private WebElement Favourites;
	
	@FindBy(linkText="https://altbalajifire.firebaseapp.com/settings")
	private WebElement Setting;
	
	@FindBy(linkText="https://altbalajifire.firebaseapp.com/help/")
	private WebElement Help;
	
	@FindBy(linkText="https://altbalajifire.firebaseapp.com/about")
	private WebElement About;
	
	
	
	//---------------This is Dash-Bord menu---------------------------------------
	public void nevigateToDashBoard_DashBoard() {
		Menu.click();
	}
	
	
	
	//---------------------This is for Show_menu--------------------------------
	public Shows navigateToShow() throws InterruptedException
	{
		Thread.sleep(3000);
		Show.click();
		return new Shows();
		
	}
	
	
	//---------------------This is for Movies_menu--------------------
	
	
	public Movies navigateToMovie() throws InterruptedException
	{
		Thread.sleep(3000);
		Movies.click();
		return new Movies();
		
	}
	
	//-----------------This is for Comedy_menu------------------------
	public Comedy navigateToComedy() throws InterruptedException
	{
		Thread.sleep(3000);
		Comedy.click();
		return new Comedy();
		
	}
	
	//---------------------This is for Subscription_menu-----------------------------------
	
		public Subscription navigateToSubscription() throws InterruptedException
		{
			Thread.sleep(5000);
			Subcription.click();
			return new Subscription();
		
		}
	
		
	//----------------this is for Reguster_user_subscription------------------------
		
		public RegSubscribe navigateToRegsub() throws InterruptedException
		{
			Thread.sleep(5000);
			RegSub.click();
			return new RegSubscribe();
		
		}
		
		
		
	
	//--------------------------This is for Notifivation_menu-----------------------
	
	public Notification navigateToNotification()
	{
		Notification.click();
		return new Notification();
	}
	
	//-------------This is for Favourite Menu----------
	public Favourite navigateToFavourite()
	{
		Favourites.click();
		return new Favourite();
	}
	
	//--------------------------This is for Setting Menu--------------------------
	public Setting navigateToSetting()
	{
		Setting.click();
		return new Setting();
	}	
	
	//--------------------------This is for Help Menu--------------------------
		public Help navigateToHelp()
		{
			Help.click();
			return new Help();
		}
	
	//--------------------------This is for About Menu--------------------------
		public About navigateToAbout()
		{
			About.click();
			return new About();
		}
	
}
