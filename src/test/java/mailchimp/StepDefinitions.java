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

    @Given("I am on the register page")
    public void i_am_on_the_register_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://login.mailchimp.com/signup/");
    }

    @Given("I input a valid email")
    public void i_input_a_valid_email() {
        String email = "test@test.com";
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);
    }

    @Given("I input a valid username")
    public void i_input_a_valid_username() {
        String username = "test";
        WebElement usernameField = driver.findElement(By.id("new_username"));
        usernameField.sendKeys(username);
    }

    @Given("I input a valid password")
    public void i_input_a_valid_password() throws InterruptedException {
        String password = "test";
        WebElement passwordField = driver.findElement(By.id("new_password"));
        passwordField.sendKeys(password);
        Thread.sleep(5000);
    }

    @When("I click \"Sign up\"")
    public void i_click(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I am registered")
    public void i_am_registered() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
