package mobiotics.sys.testCases;

import org.testng.annotations.Test;

import mobiotic.sys.PageObject.Reports;
import mobiotics.sys.commonPage.HomePage;
import mobiotics.sys.constant.BaseTest;

public class ReportTest extends BaseTest{
	
	@Test
	public void Reports() throws Exception  {
		//preCondition();
		Thread.sleep(3000);
		Reports homePage=new HomePage().navigateToReports();
		homePage.ProviderReport();
		Thread.sleep(3000);
		homePage.DevicesReport();
		Thread.sleep(3000);
		homePage.AppsReport();
		Thread.sleep(3000);
	    homePage.logout();


}
}
