package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class MyAccountPage extends BasePage {

    @FindBy(css = ".message.success.success.message")
    private WebElement thankYouMessage;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getThankYouMessage() {
        Utils.waitUntilTextIsVisible(driver, By.cssSelector(".message.success.success.message"));
        return thankYouMessage.getText();
    }
}
