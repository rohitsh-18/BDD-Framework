package stepdefinations;

import cucumber.api.java.en.Given;
import pageobject.Mobile;

import java.net.MalformedURLException;

public class Mobile_app {

    Mobile mobile = new Mobile();

    @Given("^check mobile app$")
    public void checkMobileApp() throws MalformedURLException {
        mobile.launchAppiumDriver();
    }
}
