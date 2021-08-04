package module1_login2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogoutPage {
	@FindBy(xpath = "//a[text() = 'Change user']") private WebElement changeUserBtn;
	
	public KiteLogoutPage(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
		
	}
	
	public void clickKiteLogoutPageChangeUSerBtn() {
		changeUserBtn.click();
	}

}
