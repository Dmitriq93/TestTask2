package pages.realth_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class HomePage extends BasePage {

    private final By XPanel = By.xpath("//h1[@class='dashboard-title']");
    private final By XAdd = By.xpath("//a[@href='/admin/blog/entry/add/']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage verificationTit() {
        String verificationTit = driver.getTitle();
        Assert.assertEquals(verificationTit, "Администрирование сайта | Панель управления");
        WebElement panel = driver.findElement(XPanel);
        String tit = panel.getText();
        Assert.assertEquals(tit, "Панель управления");
        return this;
    }

    public HomePage clickadd() {
        WebElement add = driver.findElement(XAdd);
        add.click();
        return this;
    }
}
