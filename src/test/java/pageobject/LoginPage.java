package pageobject;

import org.openqa.selenium.By;
//import static pageobject.BasePage.*;

public class LoginPage extends BasePage {

    private static By usertextbox = By.xpath("//input[@id='email']");
    private static By pswtextbox = By.xpath("//*[@id='ap_password']");
    private static By loginbtn = By.xpath("//input[@id='siteLogin']");
    private static By loginbtn2 = By.xpath("//*[@id='signInSubmit']");
    private static By continuebtn = By.xpath("//*[@id='auth-portal-continue']");
    private static By continuebtn2 = By.xpath("//*[@id='continue']");


    public void logininSouq(String username, String password) throws Exception {
        BasePage.setWebdriver();
        BasePage.driver.findElement(usertextbox).sendKeys(username);
        BasePage.driver.findElement(loginbtn).click();
        BasePage.driver.findElement(continuebtn).click();
        BasePage.driver.findElement(continuebtn2).click();
        BasePage.driver.findElement(pswtextbox).sendKeys(password);
        BasePage.driver.findElement(loginbtn2).click();


    }
}
