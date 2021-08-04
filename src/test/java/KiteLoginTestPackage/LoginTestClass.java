package KiteLoginTestPackage;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base_Utility_Class.Base_class;
import Base_Utility_Class.Utility_class;
import junit.framework.Assert;
import module1_login2.KiteFundsPage;
import module1_login2.KiteLogoutPage;
import module1_login2.KiteUserIDOptionsPage;
import module1_login2.login1page_POM;
import module1_login2.login2page_POM;
import module1_login2.loginHomepage_POM;

public class LoginTestClass extends Base_class {
	login1page_POM login1;
	login2page_POM login2;
	loginHomepage_POM home;
	KiteUserIDOptionsPage userIDOptions;
	KiteLogoutPage logout;
	KiteFundsPage funds;
	
	ExtentReports extent;
	ExtentTest test;
	
	
	@BeforeClass
	public void Browser_Set_Up() throws IOException {
		Initilize_Browser();
		
		extent = new ExtentReports("C:\\Users\\Admin\\KiteMavenProjectWithTeam\\test-output\\KiteTestWithTeamReport.html");
		
		login1 = new login1page_POM(driver);
		login2 = new login2page_POM(driver);
		home = new loginHomepage_POM(driver);
		userIDOptions = new KiteUserIDOptionsPage(driver);
		logout = new KiteLogoutPage(driver);
		funds = new KiteFundsPage(driver);
		
	}
	
	@BeforeMethod
	public void Kite_Login_Method() throws IOException {
		driver.navigate().refresh();
		login1.inpkitelogin1page_enterusername(Utility_class.ReadDatafile("UN"));
		login1.inpkitelogin1page_enterpassword(Utility_class.ReadDatafile("PWD"));
		login1.clickKitelogin1page_clickONSBTN();
		
		login2.inpKiteLogin2pagePin(Utility_class.ReadDatafile("PIN"));
		login2.clickKiteLogin2pagecontinuebtn();
		
	}
	
	@Test
	public void Kite_User_Verify_Test() throws IOException {
		String actUserID=home.getKiteHomepageUserID();
		String expUserID= Utility_class.ReadDatafile("UN");
		
		Assert.assertEquals("Actual user Id and expected user ID are different!", actUserID, expUserID);
		Reporter.log("Test case pass!");
		
		test=extent.startTest("Kite USer Verify Test");
		test.log(LogStatus.PASS, "Test case pass!");
		
	}
	
	@Test
	public void VerifyAvailableCashTest() throws IOException {
		test= extent.startTest("Available Cash Test");
		test.log(LogStatus.FAIL, "Test fail");
		home.clickKiteHomePageFundsTab();
		String actAvailableCash=funds.getKiteFundsPageAvailableCash();
		String expAvailableCash=Utility_class.ReadDatafile("AVLBLCASH");
		Assert.assertEquals("Expected cash and available actual cash different", actAvailableCash, expAvailableCash);
		
		
	}
	
	
	@AfterMethod
	public void Kite_Logout_And_Refresh_Method() {
		home.clickKiteHomePageUserID();
		userIDOptions.clickKiteUserIDOptionsLogoutBtn();
		logout.clickKiteLogoutPageChangeUSerBtn();
		extent.endTest(test);
		
		
		
	}
	
	@AfterClass
	public void Close_Set_Up() {
		extent.flush();
		driver.close();
		
	}

}
