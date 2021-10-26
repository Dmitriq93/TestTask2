package pages.realth_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtLoginPage extends BasePage {
    public RealtLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By login = By.xpath("//input[@name='username']");
    private final By pass = By.xpath("//input[@name='password']");
    private final By entry = By.xpath("//input[@value='Войти']");

    public RealtLoginPage entry(){
        driver.findElement(login).sendKeys("selenium");
        driver.findElement(pass).sendKeys("super_password");
        driver.findElement(entry).click();
        return this;
    }
}

