package pages;

import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class CreateAccountPage extends BasePage {

    @FindBy(css = "#firstname")
    private WebElement firstNameField;

    @FindBy(css = "#lastname")
    private WebElement lastNameField;

    @FindBy(css = "#email_address")
    private WebElement emailField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = "#password-confirmation")
    private WebElement confirmPasswordField;

    @FindBy(css = ".action.submit.primary")
    private WebElement createAccountButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void inputFirstName() {
        firstNameField.sendKeys(Constants.FIRST_NAME);
    }

    public void inputLastName() {
        lastNameField.sendKeys(Constants.LAST_NAME);
    }

    public void inputEmail() {
        emailField.sendKeys(Constants.RANDOM_EMAIL);
    }

    public void inputPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
    }

    public void inputConfirmPassword() {
        Utils.scrollToElement(driver, confirmPasswordField);
        confirmPasswordField.sendKeys(Constants.PASSWORD);
    }

    public void clickCreateAccountButton() {
        Utils.waitUntilButtonIsClickable(driver, createAccountButton);
        createAccountButton.click();
    }
}
