package mailchimp;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    WebDriver driver;

    @After
    public void closeDriver(){
        driver.close();
    }

    @Given("the user is on the register page")
    public void the_user_is_on_the_register_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://login.mailchimp.com/signup/");
    }

    @Given("the user inputs a valid email")
    public void the_user_inputs_a_valid_email() {
        String email = "test@test.com";
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);
    }

    @Given("the user inputs a valid username")
    public void the_user_inputs_a_valid_username() {
        String username = "test";
        WebElement usernameField = driver.findElement(By.id("new_username"));
        usernameField.sendKeys(username);
    }

    @Given("the user inputs a valid password")
    public void the_user_inputs_a_valid_password() throws InterruptedException {
        String password = "test";
        WebElement passwordField = driver.findElement(By.id("new_password"));
        passwordField.sendKeys(password);
        Thread.sleep(5000);
    }

    @When("the user clicks \"Sign up\"")
    public void the_user_clicks(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should see the \"Check your email\" site")
    public void the_user_user_should_see_the_check_your_email_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
