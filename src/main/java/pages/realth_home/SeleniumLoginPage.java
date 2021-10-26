package pages.realth_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class SeleniumLoginPage extends BasePage {

    private final By xLogin = By.xpath("//input[@name='username']");
    private final By xPass = By.xpath("//input[@name='password']");
    private final By xEntry = By.xpath("//input[@value='Войти']");

    public SeleniumLoginPage(WebDriver driver) {
        super(driver);
    }

    public SeleniumLoginPage entry(){
        driver.findElement(xLogin).sendKeys("selenium");
        driver.findElement(xPass).sendKeys("super_password");
        driver.findElement(xEntry).click();
        return this;
    }
}

