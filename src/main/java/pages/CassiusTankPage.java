package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class CassiusTankPage extends BasePage{
    public CassiusTankPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#option-label-size-143-item-167")
    private WebElement sSize;
    public void clickSSize(){
        Utils.waitUntilButtonIsClickable(driver,sSize);
        sSize.click();
    }
    @FindBy(css = "#option-label-color-93-item-50")
    private WebElement collor;
    public void clickColor(){
        collor.click();
    }
    @FindBy(css = "#product-addtocart-button")
    private  WebElement cartButton;
    public void addToCart(){
        cartButton.click();
    }
    @FindBy(xpath = "//a[contains(text(), 'Tops')]")
    private WebElement topsLink;
    public void clickTopsLink(){
        Utils.waitUntilLinkIsVisible(driver,topsLink);
        topsLink.click();
    }
    @FindBy(css = ".message-success")
    private WebElement thankYouMessage;
    public String getThankYouMessageText(){
        Utils.waitUntilTextIsVisible(driver,By.cssSelector(".message-success"));
       return thankYouMessage.getText();
    }
}
