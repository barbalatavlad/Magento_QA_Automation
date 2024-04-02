package pages;

import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class CreateAccountPage extends BasePage{
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#firstname")
    private WebElement firstNameField;
    public void inputFirstName(){
        firstNameField.sendKeys(Constants.FIRST_NAME);
    }
    @FindBy(css = "#lastname")
    private WebElement lastNameField;
    public void inputLastName(){
        lastNameField.sendKeys(Constants.LAST_NAME);
    }
    @FindBy(css = "#email_address")
    private WebElement emailField;
    public void inputEmail(){
        emailField.sendKeys(Constants.RANDOM_EMAIL);
    }
    @FindBy(css = "#password")
    private WebElement passwordField;
    public void inputPassword(){
        passwordField.sendKeys(Constants.PASSWORD);
    }
    @FindBy(css = "#password-confirmation")
    private WebElement confirmPasswordField;
    public void inputConfirmPassword(){
        Utils.scrollToElement(driver,confirmPasswordField);
        confirmPasswordField.sendKeys(Constants.PASSWORD);
    }
    @FindBy(css = ".action.submit.primary")
    private WebElement createAccountButton;
    public void clickCreateAccountButton(){
        Utils.waitUntilButtonIsClickable(driver,createAccountButton);
        createAccountButton.click();
    }
}
