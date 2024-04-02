package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class MenPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Tops')]")
    private WebElement topsLink;

    public MenPage(WebDriver driver) {
        super(driver);
    }

    public void clickTopsLink() {
        Utils.waitUntilButtonIsClickable(driver, topsLink);
        topsLink.click();
    }
}
