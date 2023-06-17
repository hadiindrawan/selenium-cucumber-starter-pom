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
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginPage.inputCredentials("tomsmith", "SuperSecretPassword!");
    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage.submitLogin();
    }
    @Then("Login message displayed")
    public void user_redirect_to_home_page_and_success_message_displayed() {
        loginPage.verify();
        closeBrowser();
    }

    public void closeBrowser() {
        super.teardown();
    }
}
