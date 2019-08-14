package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import pageobject.LoginPage;

public class MyStepdefs {
    LoginPage loginpage = new LoginPage();

    @Given("^User login in the souq app with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLoginInTheSouqAppWithUsernameAndPassword(String username, String password) throws Throwable {
       loginpage.logininSouq(username, password);
        throw new PendingException();
    }
}
