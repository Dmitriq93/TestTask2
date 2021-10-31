package pages.realth_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import static pages.realth_home.AddEntryPage.stringTitle;

public class AdminPanelPage extends BasePage {

    private final By xNameBlob = By.xpath("//a[text()='" + stringTitle + "']");
    private final By xDelete = By.xpath("//a[text()='Удалить']");
    private final By xConfirmation = By.xpath("//input[@value='Да, я уверен']");

    public AdminPanelPage(WebDriver driver) {
        super(driver);
    }

    public AdminPanelPage deleteBlog() {
        WebElement nameBlob = driver.findElement(xNameBlob);
        nameBlob.click();
        WebElement delete = driver.findElement(xDelete);
        delete.click();
        WebElement confirmation = driver.findElement(xConfirmation);
        confirmation.click();
        return this;
    }
}
