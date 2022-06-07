package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ParitexPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;


public class stepDefinitions {


    ParitexPage paritexPage = new ParitexPage();

    @Given("User goes to {string}")
    public void user_goes_to(String wantedUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(wantedUrl));

    }

    @And("Clicks on sign in button")
    public void clicksToSignUpButton() {

        paritexPage.signİnElemeneti.click();
    }

    @And("User enters {string}")
    public void userEnters(String eposta) {
        paritexPage.epostaBox.sendKeys(ConfigReader.getProperty(eposta));
    }





    @And("User enters as parola {string}")
    public void userEnters_as_parola(String parola) {
        paritexPage.parolaBox.sendKeys(ConfigReader.getProperty(parola));
    }





    @Then("Clicks on login in button")
    public void clicksOnLoginIn() {
        paritexPage.logInButton.click();

    }



    @Then("Enters {string}")
        public void enters(String otpKey) {
        paritexPage.otpBox.click();
        paritexPage.otpBox.sendKeys(ConfigReader.getProperty(otpKey));

  }


    @And("Login with clicking")
    public void click() {
        paritexPage.otpLoginButton.click();

    }

    @And("Checks that you have successfully entered")
    public void checksThatYouHaveSuccessfullyEntered() {
        Assert.assertTrue(paritexPage.loginLogo.isDisplayed());
    }




    @Then("Verify can not login in")
    public void verifyCanNotLoginIn() {
        Assert.assertTrue(paritexPage.epostaBox.isDisplayed());
    }






    @And("Closes the page")
    public void closesThePage() {
        Driver.closeDriver();

    }


    @And("User enters from the scnerio outline {string}")
    public void userEntersFromTheScnerioOutline(String eposta) {
        paritexPage.epostaBox.sendKeys(eposta);
    }

    @And("User enters from the scnerio outline as parola {string}")
    public void userEntersFromTheScnerioOutlineAsParola(String parola) {
        paritexPage.parolaBox.sendKeys(parola);
    }

    @And("User can not click on the login in button")
    public void userCanNotClickOnTheLoginInButton() {
       Assert.assertTrue(paritexPage.epostaBox.isDisplayed());
    }
}




