package org.browserlaunch;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppLaunch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options ui=new UiAutomator2Options();
		ui.setCapability("deviceName", "Pixel 6a API 33");
		ui.setCapability("app","D:\\software\\ApiDemos-debug.apk");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), ui);
		Thread.sleep(10000);
		driver.quit();

	}

}
