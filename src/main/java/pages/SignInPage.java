package pages;

import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class SignInPage extends BasePage {
    @FindBy(xpath = "//button[@class='action login primary']")
    private WebElement signInButton;
    @FindBy(xpath = "//div[@class='message-error error message']")
    private WebElement errorMessage;
    @FindBy(css = "#email")
    private WebElement emailField;
    @FindBy(css = "#email-error")
    private WebElement emailError;
    @FindBy(css = "#pass-error")
    private WebElement passwordError;
    @FindBy(xpath = "//a[@class='action remind']")
    private WebElement forgotPasswordMessage;
    @FindBy(xpath = "//input[@name='login[password]']")
    private WebElement passwordField;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickSingInButton() {
        Utils.waitUntilButtonIsClickable(driver, signInButton);
        signInButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public String getErrorColor() {
        return errorMessage.getCssValue("color");
    }

    public void inputIncorrectEmail() {
        emailField.sendKeys(Constants.WRONG_EMAIL);
    }

    public void inputCorrectEmail() {
        emailField.sendKeys(Constants.CORRECT_EMAIL);
    }

    public String getEmailErrorMessage() {
        return emailError.getText();
    }

    public String getPasswordErrorMessage() {
        return passwordError.getText();
    }

    public String getPasswordErrorColor() {
        return passwordError.getCssValue("color");
    }

    public String getForgotPasswordMessage() {
        return forgotPasswordMessage.getText();
    }

    public String getForgotPasswordMessageColor() {
        return forgotPasswordMessage.getCssValue("color");
    }

    public void inputCorrectPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
    }
}
