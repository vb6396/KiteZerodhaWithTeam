package module1_login2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1page_POM {

	
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")private WebElement LgnBTN;
	
	public login1page_POM(WebDriver driverValue)
	{
		PageFactory.initElements(driverValue, this);
	}
	
	public void inpkitelogin1page_enterusername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpkitelogin1page_enterpassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clickKitelogin1page_clickONSBTN()
	{
		LgnBTN.click();
	}
	
	
	
	
}
