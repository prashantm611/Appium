package appium_test;

import java.io.File;
import java.io.IOException;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BanjaraTest extends BanjaraCap {
	AndroidDriver<AndroidElement> driver;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver wd;
	@Test(enabled = true)
	public void test1() throws IOException, InterruptedException {
		driver = cap5();
		logger = extent.startTest("Banjara_test_1");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ENGLISH\")")).click(); //select language
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/rlClickConsumer")).click(); //open dropdown for country
		Thread.sleep(500);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/editText_search")).sendKeys("India"); //search India
		Thread.sleep(500);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"India (IN)\")")).click();
		Thread.sleep(500);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("8639780967"); // enter phone no.
		Thread.sleep(500);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
		Thread.sleep(500);		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.forbinary.banjararide:id/link_2"))).click(); //click on book now
		Thread.sleep(1000);
		logger.log(LogStatus.PASS, "Login Successful");		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hire Bike\")")).click(); //click on hire bike
		Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"CB Hornet 160R\")")).click(); // select the bike
		Thread.sleep(1000);
		/*driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"7 days\"))");
		Thread.sleep(1000);
		driver.findElements(MobileBy.className("android.widget.FrameLayout")).get(6).click();
		Thread.sleep(500);*/
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/btnBookNow")).click(); //click on book now
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/llDateContainer")).click(); //open calendar to select date
		Thread.sleep(500);
		driver.findElement(MobileBy.AccessibilityId("31 January 2023")).click(); //select date
		Thread.sleep(500);	
		driver.findElement(MobileBy.id("android:id/button1")).click(); //click ok
		Thread.sleep(1000);
		logger.log(LogStatus.PASS, "Booking process for CB Hornet 160R");
		driver.navigate().back();driver.navigate().back();driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("Open")).click(); //open menu on left
		Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bookings\")")).click(); //open bookings tab
		Thread.sleep(1000);
		logger.log(LogStatus.PASS, "Bookings Tab Opened");
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_button")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("Activa"); //search for Activa
		Thread.sleep(3000);
		logger.log(LogStatus.PASS, "Search for 'Activa' successful");
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
		Thread.sleep(1000);driver.navigate().back();Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))").click();
		logger.log(LogStatus.PASS, "Click on Call Us");
		Thread.sleep(1000);driver.navigate().back();driver.navigate().back();driver.navigate().back();Thread.sleep(3000);
		driver.terminateApp("com.forbinary.banjararide");
	}
	@BeforeTest
	public void beforeTest() {
		  extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/Banjara_Ride_Test.html",true);
		  extent.loadConfig(new File(System.getProperty("user.dir")+ "src/test/java/extent-config.xml"));
		  WebDriverManager.chromedriver().setup();
		  wd = new ChromeDriver();
	}

}
