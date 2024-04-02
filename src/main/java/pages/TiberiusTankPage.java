package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class TiberiusTankPage extends BasePage {
    @FindBy(css = "#option-label-size-143-item-168")
    private WebElement mSize;
    @FindBy(css = "#option-label-color-93-item-60")
    private WebElement color;
    @FindBy(css = "#product-addtocart-button")
    private WebElement addToCart;
    @FindBy(css = ".message-success")
    private WebElement thankYouMessage;
    @FindBy(xpath = "//a[contains(text(), 'Tops')]")
    private WebElement topsLink;

    public TiberiusTankPage(WebDriver driver) {
        super(driver);
    }

    public void clickMSize() {
        Utils.waitUntilButtonIsClickable(driver, mSize);
        mSize.click();
    }

    public void clickColor() {
        color.click();
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public String getThankYouMessageText() {
        Utils.waitUntilTextIsVisible(driver, By.cssSelector(".message-success"));
        return thankYouMessage.getText();
    }

    public void clickTopsLink() {
        Utils.waitUntilLinkIsVisible(driver, topsLink);
        topsLink.click();
    }
}

