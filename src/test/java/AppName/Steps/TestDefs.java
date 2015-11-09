package AppName.Steps;

import AppName.Steps.OpenBrowserHelp;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestDefs {
    // Initializing the web driver
    public WebDriver driver = OpenBrowserHelp.getOpenBrowserHelp().getDriver();

    @Given("^I type the word \"([^\"]*)\" in the search field$")
    public void I_type_the_word_in_the_search_field(String arg1) throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/form/fieldset/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/form/fieldset/input[2]")).sendKeys(arg1);
    }

    @And("^I click enter to search$")
    public void I_click_enter_to_search() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/form/fieldset/input[2]")).sendKeys(Keys.RETURN);
    }
}
