package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utils;

public class TopsPage extends BasePage{
    @FindBy(xpath = "(//strong[@class='product name product-item-name'])[1]")
    private WebElement cassiusTank;
    @FindBy(xpath = "//a[contains(text(), 'Tiberius Gym Tank')]")
    private WebElement tiberiusTank;
    @FindBy(xpath = "//a[contains(text(), 'Vulcan Weightlifting Tank' )]")
    private WebElement vulcanTank;
    public TopsPage(WebDriver driver) {
        super(driver);
    }

    public void clickCassiusTank(){
        cassiusTank.click();
    }

    public void clickTiberiusTank(){
        Utils.waitUntilTextIsVisible(driver, By.xpath("//a[contains(text(), 'Tiberius Gym Tank')]"));
        tiberiusTank.click();
    }

    public void scrollAndClickVulcanTank(){
        Utils.waitUntilButtonIsClickable(driver,vulcanTank);
        Utils.scrollToElement(driver,vulcanTank);
        vulcanTank.click();
    }
}
