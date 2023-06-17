package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginExamplePage extends BasePage {

    public LoginExamplePage(WebDriver driver) {
        super(driver);
    }

    private String baseURL = "https://the-internet.herokuapp.com/login";
    //Web Element
    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By btnLogin = By.xpath("//button[@type='submit']");

    private By msgLogin = By.id("flash");

    public LoginExamplePage goToSite (){
        driver.get(baseURL);
        return this;
    }

    public LoginExamplePage inputCredentials(String username, String password) {
        waitVisibility(usernameInput);

        writeText(usernameInput, username);
        writeText(passwordInput, password);

        return this;
    }

    public LoginExamplePage submitLogin() {
        click(btnLogin);
        return this;
    }

    public LoginExamplePage verify() {
        waitVisibility(msgLogin);
        elementIsDisplayed(msgLogin);
        return this;
    }
}
