package scenarios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginExamplePage;

public class LoginExampleTest extends BaseTest {
    LoginExamplePage loginPage;

    @Given("User go to login page")
    public void goToBrowser() {
        super.setup("chrome");
        loginPage = new LoginExamplePage(driver);
        loginPage.goToSite();
    }
    @When("^User enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.inputCredentials(username, password);
    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage.submitLogin();
    }
    @Then("Login message displayed")
    public void login_message_displayed() {
        loginPage.verify();
        closeBrowser();
    }

    public void closeBrowser() {
        super.teardown();
    }
}
