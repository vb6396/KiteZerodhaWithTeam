package module1_login2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginHomepage_POM 
{
@FindBy(xpath="//span[text()='DV1510']") private WebElement UserID;	
	
	//step 2:initialization
	public loginHomepage_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	//usage
	public String getKiteHomepageUserID()
	{
		String actText=UserID.getText();
	    return actText;
	}

}
