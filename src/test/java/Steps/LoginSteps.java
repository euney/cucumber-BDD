package Steps;

import Pages.LoginPage;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("the user navigates to the {string}")
    public void the_user_navigates_to_the(String url) {
        driver=Driver.getDriver();
        driver.get(url);
    }
    @When("the user provides the username {string}")
    public void the_user_provides_the_username(String username) {
        loginPage=new LoginPage(driver);
        loginPage.username.sendKeys(username);
    }
    @When("the user provides the password {string}")
    public void the_user_provides_the_password(String password) throws InterruptedException {
        loginPage.password.sendKeys(password);
        Thread.sleep(2000);
    }
    
    @Then("the user should  click login button")
    public void the_user_should_click_login_button() {
      loginPage.loginButton.click();
    }
    @Then("the user should see {string}")
    public void the_user_should_see(String expectedHeader) {
     String actualHeader=loginPage.header.getText();
     Assert.assertEquals(expectedHeader,actualHeader);
    }


}
