package module1_login2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteFundsPage {
	@FindBy(xpath ="(//h1[text() = '0.00'])[2]") private WebElement availableCash;
	
	public KiteFundsPage(WebDriver driverValue) {
		PageFactory.initElements(driverValue, this);
	}
	
	public String getKiteFundsPageAvailableCash() {
		String actAvailableCash = availableCash.getText();
		return actAvailableCash;
	}

}
