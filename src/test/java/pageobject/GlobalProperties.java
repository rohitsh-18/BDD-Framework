package pageobject;

import java.util.HashMap;

public class GlobalProperties {

    public static String configFilePath;
    public static HashMap<String, String> propMap;
    public static String chromeDriverPathWindows;

    public GlobalProperties() {

        propMap = new HashMap<String, String>();
        configFilePath = System.getProperty("user.dir") + "/" + "config.properties";
        chromeDriverPathWindows = System.getProperty("user.dir") + "/" + "src/test/resources/drivers/" + "chromedriver.exe";
        System.out.println(chromeDriverPathWindows + "++++++++++++++++++");

    }
}
