package banjara;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BanjaraTest extends BanjaraCap{
	AndroidDriver<AndroidElement> driver;
	@Test(enabled = true)
	public void test1() throws IOException, InterruptedException {
		ExtentTest test = extent.createTest("Banjara Ride Test", "Extent Report for 'Banjara Ride' App");
		test.log(Status.INFO, "Test Started");
		driver = cap5();		
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
		test.log(Status.PASS, "Login Successful");		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hire Bike\")")).click(); //click on hire bike
		Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"CB Hornet 160R\")")).click(); // select the bike
		Thread.sleep(1000);
		test.log(Status.PASS, "Select CB Hornet 160R");
		/*driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"7 days\"))");
		Thread.sleep(1000);
		driver.findElements(MobileBy.className("android.widget.FrameLayout")).get(6).click();
		Thread.sleep(500);*/
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/btnBookNow")).click(); //click on book now
		Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Duration\"))");
		Thread.sleep(500);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/rlDurationSpinner")).click(); //click duration dropdown
		Thread.sleep(500);
		driver.findElements(MobileBy.className("android.widget.LinearLayout")).get(6).click(); //select 7 days
		Thread.sleep(500);
		test.log(Status.PASS, "Duration Selected - 7 days");
		Thread.sleep(500);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/llDateContainer")).click(); //open calendar to select date
		Thread.sleep(500);
		driver.findElement(MobileBy.AccessibilityId("31 January 2023")).click(); //select date
		Thread.sleep(500);	
		test.log(Status.PASS, "Date selection");
		driver.findElement(MobileBy.id("android:id/button1")).click(); //click ok
		Thread.sleep(1000);
		test.log(Status.PASS, "Booking process for CB Hornet 160R");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("Open")).click(); //open menu on left
		Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bookings\")")).click(); //open bookings tab
		Thread.sleep(1000);
		test.log(Status.PASS, "Bookings Tab Opened");
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_button")).click(); //click on search button
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("Activa"); //search for Activa
		Thread.sleep(3000);
		test.log(Status.PASS, "Search for 'Activa' successful");
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
		Thread.sleep(1000);driver.navigate().back();Thread.sleep(1000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))").click(); //click on call us button 
		test.log(Status.PASS, "Click on Call Us");
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH)); //switched back to homepage
		Thread.sleep(3000);
		driver.terminateApp("com.forbinary.banjararide"); //closed the app
		test.log(Status.PASS, "App Closed");
		System.out.println("Test Completed");
		test.log(Status.INFO, "Test Completed");
	}
}
