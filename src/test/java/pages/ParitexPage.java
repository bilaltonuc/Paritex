package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import utilities.Driver;

public class ParitexPage {


        public ParitexPage() {

            PageFactory.initElements(Driver.getDriver(),this);

        }

    @FindBy(xpath="(//a[@class='mat-focus-indicator mr-2 mat-button mat-button-base mat-primary'])[1]")
    public WebElement signİnElemeneti;

    @FindBy(xpath= "(//input[@inputmode='text'])[1]")
    public WebElement epostaBox;

    @FindBy(xpath="(//input[@automation-id='tui-primitive-textfield__native-input'])[2]")
            public WebElement parolaBox;




    @FindBy(xpath = "(//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary primary'])[1]")
    public WebElement logInButton;

    @FindBy(xpath = "(//input[@placeholder=\"x x x x x x\"])[1]")
    public WebElement otpBox;

    @FindBy(xpath = "(//app-submit-button[@btnclass='primary'])[2]")
    public WebElement otpGirişYapButton;

    @FindBy(xpath = "(//div[@class='body-1 ml-10 font-medium leading-snug'])[1]")
    public WebElement  loginLogo;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[5]'])[1]")
    public WebElement  loginValidation;




}
