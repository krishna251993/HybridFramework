package mobiotics.sys.testCases;

import org.testng.annotations.Test;

import mobiotic.sys.PageObject.Sys_Providers;
import mobiotics.sys.commonPage.HomePage;
import mobiotics.sys.constant.BaseTest;

public class ProviderTest extends BaseTest  {
	
	@Test
	public void provider() throws Exception  {
		//preCondition();
		Sys_Providers homePage=new HomePage().navigateToProvider();
		//homePage.AddProvider();
		homePage.EditProvider();
		//homePage.searchName();
		
	}	


}
