package appium_test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class KhanAcademytest extends Khancap{
	AndroidDriver<AndroidElement> driver;
	@Test(enabled = true)
	public void test1() throws IOException {
		driver = cap3();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("Settings")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in\")")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in\")"))).click();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in with Google\")")).click();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.google.android.gms:id/account_display_name")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Economics\")")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Finance and capital markets\")")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Interest and debt\")")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElements(MobileBy.AccessibilityId("Add Bookmark")).get(0).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"GOT IT\")")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Compound interest introduction\")")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		MobileElement video = driver.findElements(MobileBy.className("android.view.View")).get(1);
		assertTrue(video.isDisplayed());
		System.out.println("Video Playback Successful");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("Bookmarks tab")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		MobileElement bookmark = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Compound interest basics\")"));
		assertTrue(bookmark.isDisplayed());
		System.out.println("bookmark validated");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Edit\")")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Compound interest basics\")")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Delete\")")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		MobileElement delete = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"You have no bookmarks.\")"));
		assertTrue(delete.isDisplayed());
		System.out.println("Bookmark deleted successfully");
		driver.findElement(MobileBy.AccessibilityId("Explore tab")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AccessibilityId("Settings")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign out\"))").click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("android:id/button1")).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		MobileElement signout = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in\")"));
		assertTrue(signout.isDisplayed());
		System.out.println("Sign Out Successful");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C:/Users/RJ Aditya/Pictures/scr1.png"));

	

				
	}

}
