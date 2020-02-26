package mobiotics.alt.Constant;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

import org.*;



import mobiotics.alt.Generic.*;
import mobiotics.alt.Common.*;

public class BaseTest implements AutomationConstants {
	public Logger log;
	public static WebDriver driver;
	
	public static String url;
	public static String un;
	public static String pw;
	public static String PP;
	public static String homePageURL;
	public static String loginPageURL;
	public static long timeout;
	
	public static boolean loginRequired=true;
	public static boolean logoutRequired=true;
	
	public BaseTest() {
		
		log=log.getLogger("Log_ Logger");
		PropertyConfigurator.configure("Log4j.properties");
		log=Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
	}
	
	public void initFrameWork() {
		log.info("initilizing framework");
		url=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "URL");
		un=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "UN");
		pw=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "PW");
		PP=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "PP");
		timeout=Long.parseLong(Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "IMPLICIT"));
	}
	
	@BeforeSuite
	public void initApplication() {
		initFrameWork();
		System.setProperty(CHROME_KEY, DRIVER_PATH+CHROME_FILE);
		
		String downloadFilepath = "D:\\SYSADMIN_REPORTS";
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting.popups", 2);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options= new ChromeOptions();
		
		HashMap<String, Object> chromeOptionsMap=new HashMap<String , Object>();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type");
		options.addArguments("--disable-extentions");
		
		
		DesiredCapabilities desiredcapablities=DesiredCapabilities.chrome();
		desiredcapablities.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		desiredcapablities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		desiredcapablities.setCapability(ChromeOptions.CAPABILITY, options);
		driver= new ChromeDriver(desiredcapablities);
		
		
		driver.manage().window().maximize();
		driver.get(url);
		log.info("TimeOut:"+timeout);
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	public void preCondition() throws Exception {
		if(loginRequired) {
			log.info("implicit login");
			LoginPage loginpage=new LoginPage();
			
			
			
			loginpage.clickToshowmenu();
			Thread.sleep(5000);
			loginpage.clickTosigninButton();
			Thread.sleep(5000);
			
			
			loginpage.setLookupUserName(un);
			loginpage.clickToLookupContinueBtn();
			Thread.sleep(5000);
			
			
			loginpage.setSubRegPassword(pw);
			Thread.sleep(2000);
			loginpage.clickTosubRegLoginButton();
			Thread.sleep(5000);
			//loginpage.setpassphrase(PP);
			
			
			
			
			
			
		}
	}
		/*	String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("SYSTEM ADMIN"))
				
			{
				log.info("user successfully logged in");
			}
			
			else
			{
				log.info("I' reseting the password");
				
			}
			loginRequired=true;
		}
	}
	
	public void postCondition() {
		if(logoutRequired)
		{
			log.info("Implicit logout");
			
		}
	}*/
	
	
	}
