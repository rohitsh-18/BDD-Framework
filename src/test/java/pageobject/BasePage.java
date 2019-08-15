package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    public static AppiumDriver driver1;

    public static void setWebdriver() throws Exception {
        System.out.println("in driver launch");
        GlobalProperties properties = new GlobalProperties();
        BasePage.loadPropertiesObjectInHashMap(BasePage.readProperitesFile(), GlobalProperties.propMap);

        if (GlobalProperties.propMap.get("browserName").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", GlobalProperties.chromeDriverPathWindows);
            driver = new ChromeDriver();
        }
        driver.get(GlobalProperties.propMap.get("applicationURL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    public static Properties readProperitesFile() throws Exception {
        FileInputStream file = new FileInputStream("src/test/resources/Data/config.properties");
        Properties property = new Properties();
        property.load(file);
        return property;
    }

    public static void loadPropertiesObjectInHashMap(Properties prop, HashMap<String, String> propmap){
        for (Map.Entry<Object, Object> entry : prop.entrySet()){
            propmap.put((String) entry.getKey(), (String) entry.getValue());
        }

        }

    public AppiumDriver getAppiumDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        File app = new File("src/main/resources/Mobile/Amazon.apk");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, 8.1);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel2API27");
        capabilities.setCapability("appPackage","com.amazon.mShop.android.shopping");
        capabilities.setCapability("appActivity","com.amazon.mShop.home.HomeActivity");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver1 = new AndroidDriver(url,capabilities);
        return driver1;
    }
}


