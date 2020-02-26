package generic;

import org.openqa.selenium.By;

import mobiotics.sys.commonPage.BasePage;



public class DateHelper  extends BasePage{
	private String date1= "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[";
	
	private String date2="]/a";
	
	private String month1="//*[@id=\"ui-datepicker-div\"]/div/div/select[";

    private String month2 = "]";
    
    private String previousMonth = "//*[@id=\"ui-datepicker-div\"]/div/a[1]/span";
    
    public void selectDate(String date)
    {
    	driver.findElement(By.xpath(date1+date+date2)).click();
    }
    
    public boolean isElementPresent(String month) {
    	try {
			return driver.findElement(By.xpath(month1 + month + month2)).isDisplayed();
		} catch (Exception e) {
			
			return false;
		}
    }
    
    public void selectMonth(String month) {
    	
    	driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
    	if(isElementPresent(month)) {
    		driver.findElement(By.xpath(month1 + month + month2)).click();
    		
    	}
    	else {
    		for(int i=1;i<=12;i++)
    		{
    			driver.findElement(By.xpath(previousMonth)).click();
    			if(isElementPresent(month)){
					driver.findElement(By.xpath(month1 + month + month2)).click();
					break;
				}
    		}
    	}
    }
}
