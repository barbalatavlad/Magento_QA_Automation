package pages;

import data.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class ShippingPage extends BasePage {

    @FindBy(css = "#H3U1XF0")
    private WebElement cityField;

    @FindBy(css = "#O9RFCUU")
    private WebElement streetField;

    @FindBy(css = "#G467JCJ")
    private WebElement countryDropdown;

    public ShippingPage(WebDriver driver) {
        super(driver);
    }

    public void inputStreetName() {
        Utils.waitUntilFieldIsVisible(driver, streetField);
        streetField.sendKeys(Constants.STREET_ADDRESS);
    }

    public void inputCityName() {
        cityField.sendKeys(Constants.CITY);
    }

    public void clickCountryDropdown() {
        countryDropdown.click();
        driver.findElement(By.xpath("//select/option[@value= 'RO']"));
    }
}
