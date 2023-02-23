package appium_test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class calculator {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "aditya2");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	}
	@SuppressWarnings("rawtypes")
	@Test
	public void test1() throws InterruptedException {
		System.out.println("First Calculator Automation");
		driver.findElement(MobileBy.id("com.android.calculator2:id/digit_1")).click();
		//driver.findElement(MobileBy.id("com.android.calculator2:id/digit_6")).click();
		//driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
		//driver.findElement(MobileBy.id("com.android.calculator2:id/digit_8")).click();
		//driver.findElement(MobileBy.id("com.android.calculator2:id/digit_7")).click();
		driver.findElement(MobileBy.AccessibilityId("plus")).click();
		driver.findElement(MobileBy.id("com.android.calculator2:id/digit_9")).click();
		//driver.findElement(MobileBy.id("com.android.calculator2:id/digit_1")).click();
		//driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
		//driver.findElement(MobileBy.id("com.android.calculator2:id/digit_6")).click();
		//driver.findElement(MobileBy.id("com.android.calculator2:id/digit_7")).click();
		driver.findElement(MobileBy.AccessibilityId("equals")).click();
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("clear")).click();
		driver.navigate().back();
		driver.findElement(MobileBy.AccessibilityId("Phone")).click();
		Thread.sleep(1000);
		WebElement wb1 = driver.findElement(MobileBy.id("com.google.android.dialer:id/emptyListViewImage"));
		WebElement wb2 = driver.findElement(MobileBy.AccessibilityId("Call History tab."));
		TouchAction action = new TouchAction(driver);
		//action.press((PointOption) wb1).moveTo((PointOption) wb2).release().perform();
		//action.longPress(longPressOptions().withElement(element(wb1)).withDuration(Duration.ofSeconds(3))).moveTo(element(wb2)).release().perform();
		action.longPress(longPressOptions().withElement(element(wb1)).withDuration(Duration.ofSeconds(2))).moveTo(element(wb2)).release().perform();
		//action.longPress(longPressOptions().withPosition(PointOption<PointOption<T>>));
		
		
		
		Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("key pad")).click();
		WebElement wb3 = driver.findElement(MobileBy.AccessibilityId("0,+"));
		//AndroidTouchAction action = new AndroidTouchAction(driver);
		//action.longPress((LongPressOptions.longPressOptions().withElement(ElementOption.element(wb1)))).perform();
		//TouchAction act = new TouchAction(driver);
		//act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(wb1)).withDuration(Duration.ofSeconds(2))).release().perform();
		TouchAction act = new TouchAction(driver);
		act.longPress(longPressOptions().withElement(element(wb3)).withDuration(Duration.ofSeconds(1))).release().perform();
		
		
		driver.findElement(MobileBy.AccessibilityId("9,WXYZ")).click();
		driver.findElement(MobileBy.AccessibilityId("1,")).click();
		driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
		driver.findElement(MobileBy.AccessibilityId("1,")).click();
		driver.findElement(MobileBy.AccessibilityId("0,+")).click();
		driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
		driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
		driver.findElement(MobileBy.AccessibilityId("5,JKL")).click();
		driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
		driver.findElement(MobileBy.AccessibilityId("3,DEF")).click();
		driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
		driver.findElement(MobileBy.AccessibilityId("dial")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("End call")).click();
		
		
		
		
		
		
	
	
	}	
	

}
