package appium_test;

import java.io.IOException;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Clocktest extends Clock_cap{
	AndroidDriver<AndroidElement> driver;
	@Test(enabled = true)
	public void test1() throws IOException, InterruptedException {
		driver = cap4();
		driver.findElement(MobileBy.AccessibilityId("Alarm")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("Add alarm")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("9 o'clock")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.AccessibilityId("30 minutes")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.google.android.deskclock:id/material_clock_period_am_button")).click();
		Thread.sleep(1000);
		driver.findElement(MobileBy.id("com.google.android.deskclock:id/material_timepicker_ok_button")).click();
		
	
	
	}

}
