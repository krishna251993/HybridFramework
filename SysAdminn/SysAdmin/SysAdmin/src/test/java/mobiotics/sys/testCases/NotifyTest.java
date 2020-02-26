package mobiotics.sys.testCases;

import org.testng.annotations.Test;

import mobiotic.sys.PageObject.Notify;
import mobiotics.sys.commonPage.HomePage;
import mobiotics.sys.constant.BaseTest;

public class NotifyTest extends BaseTest {
	
	@Test
	public void Notify() throws Exception  {
		preCondition();
		Notify homePage=new HomePage().navigateToNotify();
		homePage.selectProviders();

}
}
