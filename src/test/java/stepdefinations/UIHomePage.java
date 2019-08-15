package stepdefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import pageobject.HomePage;

public class UIHomePage {
    private HomePage homePage = new HomePage();
    @Given("^User is at coco home page and verify the text on page \"([^\"]*)\"$")
    public void userIsAtCocoHomePageAndVerifyTheTextOnPage(String text) throws Throwable {
        homePage.verifyhomepage(text);
    }
}
