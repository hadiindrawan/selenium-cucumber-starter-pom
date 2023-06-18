
## THIS IS SHORT DOCUMENTATION
To use it just clone and update the readme file for new documentation. Happy testing 😁

## Selenium Cucumber Starter with POM

This is a starter cucumber selenium project with a POM and has a simple DDT implementation. Feel free to use it!


## Prerequisite

Check your local devices have installed java globally

```bash
  java -version

```
See the docs to install [Java](https://www.java.com/download/ie_manual.jsp).

And check your local devices have browser driver like **chromedriver**. See the docs here [Webdriver](https://www.selenium.dev/documentation/webdriver/troubleshooting/errors/driver_location/#quick-reference).





## Folder Structure and Usage

- [/src/test/java/datas](#testdatas)
    
    Folder to store data required for the tests. By default, there is an empty folder. You can easily configure it based on your needs.
- [/src/test/java/helpers](#testhelpers)
    
    This folder is used to store helper files needed in testing, like string generator or somethings.
- [/src/test/java/pages](#testpages)
    
    Pages is a folder to store files that configured to manage your page details. Included elements. There is parent method as BasePage which uses to child pages file. There are some common method. Here is the default list method.

    **constructor**: Set the driver from parameter and set wait function (params: driver)
    
    ```java
    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    ```
    **waitVisibility**: To Wait until the element displayed method (params: element selector)
    ```java
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    ```
    **click**: To click the element method (params: element selector)
    
    ```java
    public void click(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    ```
    **writeText**: To write text to input element method (params: element selector, string text)
    
    ```java
    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(Keys.chord(Keys.CONTROL, "a"), text);
    }

    ```
    **readText**: To read text the element method (params: element selector)
    
    ```java
    public String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    ```
    **elementIsDisplayed**: To check the element is displayed method (params: element selector)
    
    ```java
    public void elementIsDisplayed(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).isDisplayed();
    }

    ```
- [/src/test/java/scenarios](#testscenarios)

    This folder used to manage your test case file. Include step by step of the test. The test file is extended to parent method, namely BaseTest. There are some common method, which uses in child method. Here is the default list method.
    
    **setup**: To setup the browser which will use to.

    **teardown**: To close the browser.
- [/src/test/java/runner](#testrunner)

    This folder use to run the test file using junit cucumber.
- [/src/test/resources/feature](#resourcefeature)

    This folder is store the feature files (cucumber file).


