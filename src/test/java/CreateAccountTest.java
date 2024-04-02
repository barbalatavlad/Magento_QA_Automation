import data.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.MyAccountPage;
import utils.Utils;

public class CreateAccountTest extends BaseTest {

    @Test
    public void createNewAccountTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCreateAnAccountLink();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputEmail();
        Utils.waitInSeconds(5);
        createAccountPage.inputPassword();
        createAccountPage.inputConfirmPassword();
        createAccountPage.clickCreateAccountButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        String actualMessage = myAccountPage.getThankYouMessage();
        String expectedMessage = Constants.CREATE_ACCOUNT_THANKYOU_MESSAGE;
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
