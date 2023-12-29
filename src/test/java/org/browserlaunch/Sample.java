package org.browserlaunch;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Sample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//create object for UiAutomator2Options class
		UiAutomator2Options uiAOptions=new UiAutomator2Options();
		
		//Set the properties of device which we want to connect
		uiAOptions.setCapability("deviceName", "Pixel 6a API 33");
		uiAOptions.setCapability("app", "D:\\software\\ApiDemos-debug.apk");
		
		//create object for andriod
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), uiAOptions);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
	}

}
