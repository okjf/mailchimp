package mailchimp;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        driver.manage().window().maximize();
        driver.get("https://login.mailchimp.com/signup/");
    }

    @Given("the user inputs a valid email")
    public void the_user_inputs_a_valid_email() {
        String email = Generator.generateEmail();
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);
    }

    @Given("the user inputs a valid username")
    public void the_user_inputs_a_valid_username() {
        String username = Generator.generateUsername();
        WebElement usernameField = driver.findElement(By.id("new_username"));
        usernameField.sendKeys(username);
    }

    @Given("the user inputs a valid password")
    public void the_user_inputs_a_valid_password() {
        String password = Generator.generatePassword();
        WebElement passwordField = driver.findElement(By.id("new_password"));
        passwordField.sendKeys(password);
    }

    @When("the user signs up")
    public void the_user_signs_up(){
        WebElement signUpButton = driver.findElement(By.cssSelector("button[id=create-account]"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    @Then("the user sees the \"Check your email\" site")
    public void the_user_user_sees_the_check_your_email_site() {
        WebElement title = driver.findElement(By.cssSelector("h1"));
        assertEquals("Check your email", title.getText());
    }

    @And("the user inputs a long username")
    public void the_user_inputs_a_long_username() {
        String username = Generator.generateLongUsername();
        WebElement usernameField = driver.findElement(By.id("new_username"));
        usernameField.sendKeys(username);
    }

    @Given("the user inputs an already taken username")
    public void the_user_inputs_an_already_taken_username() {
        String username = "johndoe";
        WebElement usernameField = driver.findElement(By.id("new_username"));
        usernameField.sendKeys(username);
    }

    @Then("the user sees an error")
    public void the_user_sees_an_error() {
        WebElement errorText = driver.findElement(By.cssSelector("span[class=invalid-error]"));
        assertEquals("Another user with this username already exists. Maybe it's your evil twin. Spooky.", errorText.getText());
    }
}
