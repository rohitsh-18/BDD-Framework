package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static By textonpage = By.cssSelector("div.title");

    public void verifyhomepage(String text) throws Exception {
        BasePage.setWebdriver();
        String pagetext = BasePage.driver.findElement(textonpage).getText();
        Assert.assertTrue("Text is available on page", pagetext.contains(text));

    }

}
