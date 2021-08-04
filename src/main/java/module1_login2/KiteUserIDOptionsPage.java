package module1_login2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteUserIDOptionsPage {
	
	@FindBy(xpath = "//a[text() = ' Logout']") private WebElement logoutBtn;
	
	
	public KiteUserIDOptionsPage(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public void clickKiteUserIDOptionsLogoutBtn() {
		logoutBtn.click();
	}

}
