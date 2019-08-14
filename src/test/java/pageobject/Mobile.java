package pageobject;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Mobile extends BasePage {

    private AppiumDriver driver;


    public void launchAppiumDriver() throws MalformedURLException {
        driver = getAppiumDriver();
        System.out.println("Appium driver launched");
    }
}
