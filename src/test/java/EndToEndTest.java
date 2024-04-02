import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import pages.CassiusTankPage;
import pages.ShippingPage;
import pages.TopsPage;
import pages.MenPage;
import pages.VulcanTankPage;
import pages.TiberiusTankPage;

public class EndToEndTest extends BaseTest {

    @Test
    public void buyProductTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInLink();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputCorrectEmail();
        signInPage.inputCorrectPassword();
        signInPage.clickSingInButton();
        homePage.clickMenSection();
        MenPage menPage = new MenPage(driver);
        menPage.clickTopsLink();
        TopsPage topsPage = new TopsPage(driver);
        topsPage.clickCassiusTank();
        CassiusTankPage cassiusTankPage = new CassiusTankPage(driver);
        cassiusTankPage.clickSSize();
        cassiusTankPage.clickColor();
        cassiusTankPage.addToCart();
        String actualMessage = cassiusTankPage.getThankYouMessageText();
        String expectedMessage = "You added Cassius Sparring Tank to your shopping cart.";
        Assert.assertEquals(actualMessage, expectedMessage);
        cassiusTankPage.clickTopsLink();
        topsPage.clickTiberiusTank();
        TiberiusTankPage tiberiusTankPage = new TiberiusTankPage(driver);
        tiberiusTankPage.clickMSize();
        tiberiusTankPage.clickColor();
        tiberiusTankPage.clickAddToCart();
        String actualMessage1 = tiberiusTankPage.getThankYouMessageText();
        String expectedMessage1 = "You added Tiberius Gym Tank to your shopping cart.";
        Assert.assertEquals(actualMessage1, expectedMessage1);
        tiberiusTankPage.clickTopsLink();
        topsPage.scrollAndClickVulcanTank();
        VulcanTankPage vulcanTankPage = new VulcanTankPage(driver);
        vulcanTankPage.clickLSize();
        vulcanTankPage.clickColor();
        vulcanTankPage.clickCartButton();
        String actualMessage2 = vulcanTankPage.getThankYouMessageText();
        String expectedMessage2 = "You added Vulcan Weightlifting Tank to your shopping cart.";
        Assert.assertEquals(actualMessage2, expectedMessage2);
        vulcanTankPage.goToCart();
        vulcanTankPage.clickCheckoutButton();
        ShippingPage shippingPage = new ShippingPage(driver);
        shippingPage.inputStreetName();
        shippingPage.inputCityName();
        shippingPage.clickCountryDropdown();
    }
}
