package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class VulcanTankPage extends BasePage {
    @FindBy(css = "#option-label-size-143-item-169")
    private WebElement lSize;
    @FindBy(css = "#option-label-color-93-item-49")
    private WebElement color;
    @FindBy(css = "#product-addtocart-button")
    private WebElement cartButton;
    @FindBy(css = ".message-success")
    private WebElement thankYouMessage;
    @FindBy(css = ".showcart")
    private WebElement cart;
    @FindBy(css = "#top-cart-btn-checkout")
    private WebElement proceedToCheckoutButton;

    public VulcanTankPage(WebDriver driver) {
        super(driver);
    }

    public void clickLSize() {
        Utils.waitUntilButtonIsClickable(driver, lSize);
        lSize.click();
    }

    public void clickColor() {
        Utils.waitUntilButtonIsClickable(driver, color);
        color.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public String getThankYouMessageText() {
        Utils.waitUntilTextIsVisible(driver, By.cssSelector(".message-success"));
        return thankYouMessage.getText();
    }

    public void goToCart() {
        cart.click();
    }

    public void clickCheckoutButton() {
        Utils.waitUntilButtonIsClickable(driver, proceedToCheckoutButton);
        proceedToCheckoutButton.click();
    }
}
