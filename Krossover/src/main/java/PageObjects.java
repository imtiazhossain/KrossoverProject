import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Imtiaz on 9/2/15.
 */
public class PageObjects extends TestBase {

    public void clickBasketballLink() {
        WebElement basketballLink = driver.findElement(By.xpath("//div/a[contains(@href, 'http://www.krossover.com/basketball')]"));
        basketballLink.click();
    }

    public void yourFullNameInput(String value) {
        element = driver.findElement(By.xpath("//*[@id=\"get-started\"]/div/div/form/div[1]/label"));
        element.click();
        element.sendKeys(value);
    }

    public void schoolOrTeamName(String value) {
        element = driver.findElement(By.xpath("//*[@id=\"get-started\"]/div/div/form/div[2]/label"));
        element.click();
        element.sendKeys(value);
    }

    public void city(String value) {
        element = driver.findElement(By.xpath("//*[@id=\"get-started\"]/div/div/form/div[3]/div[1]/label"));
        element.click();
        element.sendKeys(value);
    }

    public void state(String value) {
        element = driver.findElement(By.xpath("//*[@id=\"get-started\"]/div/div/form/div[3]/div[2]/label"));
        element.click();
        element.sendKeys(value);
    }

    public void sport(String value) {
        element = driver.findElement(By.xpath("//*[@id=\"get-started\"]/div/div/form/div[3]/div[2]/label"));
        element.click();
        element.sendKeys(value);
    }

    public void teamGender(String value) {
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"Field7\"]")));
        select.selectByVisibleText(value);
    }

    public void email(String value) {
        element = driver.findElement(By.xpath("//*[@id=\"get-started\"]/div/div/form/div[6]/label"));
        element.click();
        element.sendKeys(value);
    }

    public void phoneNumber(String value) {
        element = driver.findElement(By.xpath("//*[@id=\"get-started\"]/div/div/form/div[7]/label"));
        element.click();
        element.sendKeys(value);
    }

    public void bestDay(String value) {
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"Field14\"]")));
        select.selectByVisibleText(value);
    }

    public WebElement requestDemoButton() {
        element = driver.findElement(By.name("saveForm"));
        return element;
    }
}
