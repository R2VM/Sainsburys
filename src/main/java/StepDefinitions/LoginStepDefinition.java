package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    public static WebDriver driver;
    @Given("^user on login page$")
    public void userOnLoginPage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.sainsburys.co.uk/shop/gb/groceries");
        driver.manage().window().maximize();
        //driver.navigate().refresh();
        //driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
    }

    @Then("^user clicks on register link and enters details$")
    public void userClicksOnRegisterLinkAndEntersDetails() {
        driver.findElement(By.xpath("//*[@id=\"auxiliaryDock\"]/div[1]/div[2]/p/a")).click();
    }

    @Then("^user clicks on login link enters username and password and home page displays$")
    public void userClicksOnLoginLinkEntersUsernameAndPasswordAndHomePageDisplays() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"logonId\"]")).sendKeys("vivteck@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"check-email\"]")).click();
    }

    //public static void main(String[] args) {
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
 //   }



}
