import data.Colors;
import data.ErrorMessage;
import default_messages.ForgotPassword;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import utils.Utils;

public class SignInNegativeTest extends BaseTest {

    @Test
    public void noEmailNoPasswordTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickSingInButton();
        Utils.waitInSeconds(1);
        String actualText = signInPage.getErrorMessage();
        String expectedText = ErrorMessage.LOGIN_AND_PASSWORD_ERROR_MESSAGE;
        Assert.assertEquals(actualText, expectedText, ErrorMessage.INCORRECT_EXPECTED_ERROR);
        String actualColor = signInPage.getErrorColor();
        String expectedColor = Colors.RED_COLOR;
        Assert.assertEquals(actualColor, expectedColor);
    }

    @Test
    public void wrongEmailNoPasswordTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputIncorrectEmail();
        Utils.waitInSeconds(1);
        signInPage.clickSingInButton();
        Utils.waitInSeconds(1);
        String actualText = signInPage.getEmailErrorMessage();
        String expectedText = ErrorMessage.INCORRECT_EMAIL_MESSAGE;
        Assert.assertEquals(actualText, expectedText);
        String actualText2 = signInPage.getPasswordErrorMessage();
        String expectedText2 = ErrorMessage.INCORRECT_PASSWORD_MESSAGE;
        Assert.assertEquals(actualText2, expectedText2);
        String actualColor = signInPage.getPasswordErrorColor();
        String expectedColor = Colors.RED_COLOR;
        Utils.waitInSeconds(1);
        Assert.assertEquals(actualColor, expectedColor);
        String actualText3 = signInPage.getForgotPasswordMessage();
        String expectedText3 = ForgotPassword.FORGOT_PASSWORD;
        Assert.assertEquals(actualText3, expectedText3);
        String actualColor2 = signInPage.getForgotPasswordMessageColor();
        String expectedColor2 = Colors.BLUE_COLOR;
        Assert.assertEquals(actualColor2, expectedColor2);
    }

    @Test
    public void rightEmailNoPasswordTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputCorrectEmail();
        Utils.waitInSeconds(1);
        signInPage.clickSingInButton();
        Utils.waitInSeconds(1);
        String actualText2 = signInPage.getPasswordErrorMessage();
        String expectedText2 = ErrorMessage.INCORRECT_PASSWORD_MESSAGE;
        Assert.assertEquals(actualText2, expectedText2);
    }

    @Test
    public void noEmailWithPasswordTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputCorrectPassword();
        Utils.waitInSeconds(1);
        signInPage.clickSingInButton();
        String actualText = signInPage.getEmailErrorMessage();
        String expectedText = ErrorMessage.MISSING_EMAIL_MESSAGE;
        Assert.assertEquals(actualText, expectedText);
    }
}
