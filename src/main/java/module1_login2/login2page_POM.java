package module1_login2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2page_POM
{

	@FindBy(xpath="//input[@id='pin']") private WebElement pin;

	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement continuebtn;

	//step 2:initialization
	 public login2page_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	 //Usage
	 public void inpKiteLogin2pagePin(String pinValue)
	 {
		 pin.sendKeys(pinValue);
	 }
	 
	 public void clickKiteLogin2pagecontinuebtn()
	 {
		 continuebtn.click();
	 }
	}
	
