package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class CassiusTankPage extends BasePage {

    @FindBy(css = "#option-label-size-143-item-167")
    private WebElement sSize;

    @FindBy(css = "#option-label-color-93-item-50")
    private WebElement color;

    @FindBy(css = "#product-addtocart-button")
    private WebElement cartButton;

    @FindBy(xpath = "//a[contains(text(), 'Tops')]")
    private WebElement topsLink;

    @FindBy(css = ".message-success")
    private WebElement thankYouMessage;

    public CassiusTankPage(WebDriver driver) {
        super(driver);
    }

    public void clickSSize() {
        Utils.waitUntilButtonIsClickable(driver, sSize);
        sSize.click();
    }

    public void clickColor() {
        color.click();
    }

    public void addToCart() {
        cartButton.click();
    }

    public void clickTopsLink() {
        Utils.waitUntilLinkIsVisible(driver, topsLink);
        topsLink.click();
    }

    public String getThankYouMessageText() {
        Utils.waitUntilTextIsVisible(driver, By.cssSelector(".message-success"));
        return thankYouMessage.getText();
    }
}
