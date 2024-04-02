package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[contains(text(), 'Create an Account')])[1]")
    private WebElement createAnAccountLink;

    @FindBy(xpath = "(//a[contains(text(), 'Sign In')])[1]")
    private WebElement signInLink;

    @FindBy(css = "#ui-id-5")
    private WebElement menSection;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void clickCreateAnAccountLink(){
        createAnAccountLink.click();
    }

    public void clickMenSection(){
        Utils.waitUntilButtonIsClickable(driver,menSection);
        menSection.click();
    }
}
